package vescame.cleanarchitecture.customer

import vescame.cleanarchitecture.customer.dto.CustomerResponse
import vescame.cleanarchitecture.customer.Customer
import vescame.cleanarchitecture.customer.http.UserSource
import vescame.cleanarchitecture.common.CommonAdapter

class CustomerService(
    private val source: UserSource,
    private val adapter: CommonAdapter<CustomerResponse, Customer>
) {

    suspend fun getCustomer(customerId: String): Customer =
        adapter.toAdapted(source.getUserById(customerId.toLong()))
}
