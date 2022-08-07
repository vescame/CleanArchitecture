package vescame.cleanarchitecture.customer

import java.time.LocalDate
import java.math.BigDecimal

data class Customer(
    val id: Long?,
    val externalId: Long,
    val name: String,
    val surname: String,
    val birthDate: LocalDate,
    val salary: BigDecimal
)
