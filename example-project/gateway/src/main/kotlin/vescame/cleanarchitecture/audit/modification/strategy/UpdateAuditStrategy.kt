package vescame.cleanarchitecture.audit.modification.strategy

import vescame.cleanarchitecture.audit.AuditableRetrievable
import java.time.LocalDateTime
class UpdateAuditStrategy<T : AuditableRetrievable> : GatewayAuditStrategy<T> {

    override fun getUpdateDateTime() = now()

    private companion object {
        fun now(): LocalDateTime = LocalDateTime.now()
    }
}

