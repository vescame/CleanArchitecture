package vescame.cleanarchitecture.customer.adapter

import vescame.cleanarchitecture.common.CommonAdapter
import vescame.cleanarchitecture.customer.dto.CustomerResponse
import vescame.cleanarchitecture.customer.Customer
import vescame.cleanarchitecture.decimal.DecimalScaler

class CustomerEntityAdapter(
    private val decimalScalable: DecimalScaler
) : CommonAdapter<CustomerResponse, Customer> {

    override fun toAdapted(input: CustomerResponse) = Customer(
        id = null,
        externalId = input.id.toLong(),
        name = input.extractName(),
        surname = input.extractSurname(),
        birthDate = input.birthDate,
        salary = decimalScalable.scaled(input.salary)
    )

    private fun CustomerResponse.extractName() = 
        name.take(name.indexOf(" "))

    private fun CustomerResponse.extractSurname() = 
        name.substringAfter(" ")
}
