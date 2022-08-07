package vescame.cleanarchitecture.customer.gateway.adapter

import vescame.cleanarchitecture.common.CommonAdapter
import vescame.cleanarchitecture.customer.domain.CustomerEntity
import vescame.cleanarchitecture.customer.gateway.model.CustomerModel

class GatewayCustomerEntityAdapter : CommonAdapter<CustomerModel, CustomerEntity> {

    override fun toAdapted(input: CustomerModel) = CustomerEntity(
        id = input.id,
        name = input.name,
        surname = input.surname,
        birthDate = input.birthDate,
        salary = input.salary,
        status = null,
        createDate = null,
        updateDate = null
    )
}