package vescame.cleanarchitecture.customer.adapter

import vescame.cleanarchitecture.common.CommonAdapter
import vescame.cleanarchitecture.customer.dto.CustomerResponse
import vescame.cleanarchitecture.customer.Customer

class CustomerAdapter : CommonAdapter<CustomerResponse, Customer> {

    override fun toAdapted(input: CustomerResponse) = Customer(
        id = input.id.toLong(),
        name = input.extractName(),
        surname = input.extractSurname(),
        birthDate = input.birthDate,
        salary = input.salary
    )

    private fun CustomerResponse.extractName() = 
        name.take(name.indexOf(" "))

    private fun CustomerResponse.extractSurname() = 
        name.substring(name.indexOf(" ") + 1)
}
