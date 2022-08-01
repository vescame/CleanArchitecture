package vescame.cleanarchitecture.audit.modification.strategy

import vescame.cleanarchitecture.audit.AuditableRetrievable

class UpdateAuditStrategy<T : AuditableRetrievable> : EntityChangeAuditStrategy<T>()
