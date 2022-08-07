package vescame.cleanarchitecture.customer

import vescame.cleanarchitecture.customer.dto.CustomerResponse
import vescame.cleanarchitecture.customer.http.UserSource
import vescame.cleanarchitecture.common.CommonAdapter
import vescame.cleanarchitecture.customer.gateway.CustomerGateway
import vescame.cleanarchitecture.customer.gateway.model.CustomerModel

class CustomerService(
    private val source: UserSource,
    private val adapter: CommonAdapter<CustomerResponse, Customer>,
    private val gatewayAdapter: CommonAdapter<Customer, CustomerModel>,
    private val gateway: CustomerGateway
) {

    suspend fun getAll() = gateway.findAll()

    suspend fun getCustomer(customerId: String): Customer =
        adapter.toAdapted(source.getUserById(customerId.toLong()))

    suspend fun save(customer: Customer) {
        gateway.save(gatewayAdapter.toAdapted(customer))
    }

    suspend fun update(customer: Customer) {
        gateway.save(gatewayAdapter.toAdapted(customer))
    }

    suspend fun delete(customerId: String) {
        gateway.deleteById(customerId.toLong())
    }
}
