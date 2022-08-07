package vescame.cleanarchitecture.customer.gateway

import vescame.cleanarchitecture.customer.domain.CustomerEntity
import vescame.cleanarchitecture.customer.gateway.adapter.GatewayCustomerEntityAdapter
import vescame.cleanarchitecture.customer.gateway.adapter.GatewayCustomerModelAdapter
import vescame.cleanarchitecture.customer.gateway.model.CustomerModel
import vescame.cleanarchitecture.customer.repository.CustomerRepository

class CustomerGatewayImpl(
    private val customerRepository: CustomerRepository,
    private val gatewayCustomerModelAdapter: GatewayCustomerModelAdapter,
    private val gatewayCustomerEntityAdapter: GatewayCustomerEntityAdapter
) : CustomerGateway {

    override suspend fun findAll() = customerRepository.findAll().mapToModel()

    override suspend fun getById(id: Long): CustomerModel? {
        val customer = customerRepository.getById(id)
        return if (customer != null) {
            gatewayCustomerModelAdapter.toAdapted(customer)
        } else null
    }

    override suspend fun save(customerModel: CustomerModel) {
        with(gatewayCustomerEntityAdapter.toAdapted(customerModel)) {
            if (id != null) {
                when (val oldCustomer = getById(id)) {
                    null -> throw IllegalArgumentException("update of customer $id cannot be completed, it's not yet persisted")
                    else -> customerRepository.update(this)
                }
            } else {
                customerRepository.save(this)
            }
        }
    }

    override suspend fun deleteById(id: Long) {
        customerRepository.delete(id)
    }

    private fun List<CustomerEntity>.mapToModel() = map { gatewayCustomerModelAdapter.toAdapted(it)!! }
}
