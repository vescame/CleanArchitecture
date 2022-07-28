package vescame.cleanarchitecture

import vescame.cleanarchitecture.customer.CustomerService
import vescame.cleanarchitecture.customer.adapter.CustomerAdapter
import vescame.cleanarchitecture.customer.http.StubExternalUserSource
import vescame.cleanarchitecture.customer.adapter.ExternalUserAdapter
import vescame.cleanarchitecture.misc.scaler.DefaultScale
import vescame.cleanarchitecture.misc.scaler.DefaultScale.ROUNDING_MODE
import vescame.cleanarchitecture.misc.scaler.DefaultScale.SCALE
import vescame.cleanarchitecture.misc.scaler.SalaryScaler
import kotlinx.coroutines.Job
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

val scope = CoroutineScope(Job() + Dispatchers.Main)

fun main() {
    val externalUserAdapter = ExternalUserAdapter()

    val stubExternalUserSource = StubExternalUserSource(externalUserAdapter)

    val salaryScaler = SalaryScaler(SCALE, ROUNDING_MODE)

    val customerAdapter = CustomerAdapter(salaryScaler)

    val customerService = CustomerService(
        source = stubExternalUserSource,
        adapter = customerAdapter
    )

    scope.launch {
        println(customerService.getCustomer("123"))
    }
}
