package vescame.cleanarchitecture.audit.modification.strategy

import vescame.cleanarchitecture.audit.modification.Auditable
import java.time.LocalDateTime

abstract class EntityChangeAuditStrategy<T : Auditable> : GatewayAuditStrategy<T> {

    override fun getUpdateDateTime() = now()

    private companion object {
        fun now(): LocalDateTime = LocalDateTime.now()
    }
}

