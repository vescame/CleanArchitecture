package vescame.cleanarchitecture.audit.modification.strategy

import vescame.cleanarchitecture.audit.status.Retrievable
import vescame.cleanarchitecture.audit.status.RetrievableType.INACTIVE
import vescame.cleanarchitecture.audit.status.strategy.RetrievableAuditStrategy

class SoftDeleteAuditStrategyEntity<T : Retrievable> : RetrievableAuditStrategy<T> {

    override fun getStatus() = INACTIVE
}
