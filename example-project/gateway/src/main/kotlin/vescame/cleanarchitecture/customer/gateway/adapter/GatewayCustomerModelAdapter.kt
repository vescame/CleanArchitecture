package vescame.cleanarchitecture.customer.gateway.adapter

import vescame.cleanarchitecture.common.CommonAdapter
import vescame.cleanarchitecture.customer.domain.CustomerEntity
import vescame.cleanarchitecture.customer.gateway.model.CustomerModel

class GatewayCustomerModelAdapter : CommonAdapter<CustomerEntity?, CustomerModel?> {

    override fun toAdapted(input: CustomerEntity?) = if (input != null) {
        CustomerModel(
            id = input.id,
            name = input.name,
            surname = input.surname,
            birthDate = input.birthDate,
            salary = input.salary
        )
    } else null
}
