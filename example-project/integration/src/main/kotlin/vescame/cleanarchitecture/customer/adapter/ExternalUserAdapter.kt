package vescame.cleanarchitecture.customer.adapter

import vescame.cleanarchitecture.common.CommonAdapter
import vescame.cleanarchitecture.customer.dto.CustomerResponse
import vescame.cleanarchitecture.customer.ExternalUser
import java.time.LocalDate
import java.math.BigDecimal

class ExternalUserAdapter : CommonAdapter<ExternalUser, CustomerResponse> {

    override fun toAdapted(input: ExternalUser) = CustomerResponse(
        id = input.id.toString(),
        name = input.name,
        birthDate = LocalDate.parse(input.birthDate),
        salary = BigDecimal(input.salary)
    )
}