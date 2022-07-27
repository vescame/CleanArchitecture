package vescame.cleanarchitecture

import vescame.cleanarchitecture.customer.CustomerService
import vescame.cleanarchitecture.customer.adapter.CustomerAdapter
import vescame.cleanarchitecture.customer.http.StubExternalUserSource
import vescame.cleanarchitecture.customer.adapter.ExternalUserAdapter

fun main() {
    val externalUserAdapter = ExternalUserAdapter()

    val stubExternalUserSource = StubExternalUserSource(
        adapter = externalUserAdapter
    )

    val customerAdapter = CustomerAdapter()

    val customerService = CustomerService(
        source = stubExternalUserSource,
        adapter = customerAdapter
    )

    println(customerService.getCustomer("123"))
}
