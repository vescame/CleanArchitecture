package vescame.cleanarchitecture.audit

import vescame.cleanarchitecture.audit.modification.Auditable
import vescame.cleanarchitecture.audit.status.Retrievable

interface AuditableRetrievable : Auditable, Retrievable
