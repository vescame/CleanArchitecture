package vescame.cleanarchitecture.customer.dto

import java.math.BigDecimal
import java.time.LocalDate

data class CustomerResponse(
    val id: String,
    val name: String,
    val birthDate: LocalDate,
    val salary: BigDecimal
)
