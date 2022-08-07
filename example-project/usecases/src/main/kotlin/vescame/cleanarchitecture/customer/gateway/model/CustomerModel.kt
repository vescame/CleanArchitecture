package vescame.cleanarchitecture.customer.gateway.model

import java.math.BigDecimal
import java.time.LocalDate

data class CustomerModel(
    val id: Long?,
    val externalId: Long,
    val name: String,
    val surname: String,
    val birthDate: LocalDate,
    val salary: BigDecimal
)
