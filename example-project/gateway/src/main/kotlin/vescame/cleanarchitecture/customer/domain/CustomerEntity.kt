package vescame.cleanarchitecture.customer.domain

import vescame.cleanarchitecture.audit.AuditableRetrievable
import vescame.cleanarchitecture.audit.status.RetrievableType
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime

data class CustomerEntity(
    val id: Long?,
    val name: String,
    val surname: String,
    val birthDate: LocalDate,
    val salary: BigDecimal,
    override val status: RetrievableType?,
    val createDate: LocalDateTime?,
    override val updateDate: LocalDateTime?
) : AuditableRetrievable
