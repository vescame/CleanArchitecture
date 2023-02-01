package vescame.cleanarchitecture.audit.modification.strategy

import vescame.cleanarchitecture.audit.AuditableRetrievable
import vescame.cleanarchitecture.audit.status.RetrievableType.ACTIVE
import vescame.cleanarchitecture.audit.status.strategy.RetrievableAuditStrategy
import java.time.LocalDateTime

class SaveAuditStrategy<T : AuditableRetrievable> : GatewayAuditStrategy<T>, RetrievableAuditStrategy<T> {

    override fun getUpdateDateTime() = now()

    fun getCreateDateTime() = now()

    override fun getStatus() = ACTIVE

    private companion object {
        fun now(): LocalDateTime = LocalDateTime.now()
    }
}