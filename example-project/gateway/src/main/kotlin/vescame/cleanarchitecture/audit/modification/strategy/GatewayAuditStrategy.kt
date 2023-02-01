package vescame.cleanarchitecture.audit.modification.strategy

import vescame.cleanarchitecture.audit.modification.Auditable
import java.time.LocalDateTime

interface GatewayAuditStrategy<T : Auditable> {

    fun getUpdateDateTime(): LocalDateTime
}