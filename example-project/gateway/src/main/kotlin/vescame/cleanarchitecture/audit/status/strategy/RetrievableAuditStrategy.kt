package vescame.cleanarchitecture.audit.status.strategy

import vescame.cleanarchitecture.audit.status.Retrievable
import vescame.cleanarchitecture.audit.status.RetrievableType

interface RetrievableAuditStrategy<T : Retrievable> {

    fun getStatus(): RetrievableType
}
