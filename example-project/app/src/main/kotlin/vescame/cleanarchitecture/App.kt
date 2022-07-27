package vescame.cleanarchitecture

import vescame.cleanarchitecture.customer.CustomerService
import vescame.cleanarchitecture.customer.adapter.CustomerAdapter
import vescame.cleanarchitecture.customer.http.StubExternalUserSource
import vescame.cleanarchitecture.customer.adapter.ExternalUserAdapter
import vescame.cleanarchitecture.misc.scaler.DefaultScale
import vescame.cleanarchitecture.misc.scaler.DefaultScale.ROUNDING_MODE
import vescame.cleanarchitecture.misc.scaler.DefaultScale.SCALE
import vescame.cleanarchitecture.misc.scaler.SalaryScaler

fun main() {
    val externalUserAdapter = ExternalUserAdapter()

    val stubExternalUserSource = StubExternalUserSource(
        adapter = externalUserAdapter
    )

    val salaryScaler = SalaryScaler(SCALE, ROUNDING_MODE)

    val customerAdapter = CustomerAdapter(salaryScaler)

    val customerService = CustomerService(
        source = stubExternalUserSource,
        adapter = customerAdapter
    )

    println(customerService.getCustomer("123"))
}
