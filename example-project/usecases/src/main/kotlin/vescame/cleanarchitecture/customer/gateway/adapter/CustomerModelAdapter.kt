package vescame.cleanarchitecture.customer.gateway.adapter

import vescame.cleanarchitecture.common.CommonAdapter
import vescame.cleanarchitecture.customer.Customer
import vescame.cleanarchitecture.customer.gateway.model.CustomerModel

class CustomerModelAdapter : CommonAdapter<Customer, CustomerModel> {

    override fun toAdapted(input: Customer) = CustomerModel(
        id = input.id,
        name = input.name,
        surname = input.surname,
        birthDate = input.birthDate,
        salary = input.salary
    )
}