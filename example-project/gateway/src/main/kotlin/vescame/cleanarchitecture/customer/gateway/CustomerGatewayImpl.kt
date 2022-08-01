package vescame.cleanarchitecture.customer.gateway

import vescame.cleanarchitecture.customer.gateway.adapter.CustomerEntityAdapter
import vescame.cleanarchitecture.customer.gateway.adapter.CustomerModelAdapter
import vescame.cleanarchitecture.customer.gateway.model.CustomerModel
import vescame.cleanarchitecture.customer.repository.CustomerRepository

class CustomerGatewayImpl(
    private val customerRepository: CustomerRepository,
    private val customerModelAdapter: CustomerModelAdapter,
    private val customerEntityAdapter: CustomerEntityAdapter
) : CustomerGateway {

    override suspend fun findAll() = customerRepository.findAll().map {
        println(it)
        customerModelAdapter.toAdapted(it)!!
    }

    override suspend fun getById(id: Long): CustomerModel? {
        val customer = customerRepository.getById(id)
        return if (customer != null) {
            customerModelAdapter.toAdapted(customer)
        } else null
    }

    override suspend fun save(customerModel: CustomerModel) {
        with(customerEntityAdapter.toAdapted(customerModel)) {
            if (id != null) {
                if (getById(id) != null) {
                    println("updating $customerModel")
                    customerRepository.update(this)
                } else {
                    throw IllegalArgumentException("update of customer $id cannot be completed, it's not yet persisted")
                }
            } else {
                println("saving $customerModel")
                customerRepository.save(this)
            }
        }
    }

    override suspend fun deleteById(id: Long) {
        customerRepository.delete(id)
    }
}
