package vescame.cleanarchitecture.audit.modification

import vescame.cleanarchitecture.audit.AuditableRetrievable
import vescame.cleanarchitecture.audit.modification.strategy.SaveAuditStrategy
import vescame.cleanarchitecture.audit.modification.strategy.EntityChangeAuditStrategy
import vescame.cleanarchitecture.customer.domain.CustomerEntity
import vescame.cleanarchitecture.audit.modification.strategy.SoftDeleteAuditStrategyEntity

class AuditStrategy <T : AuditableRetrievable>(
    private val saveAuditStrategy: SaveAuditStrategy<T>,
    private val entityChangeAuditStrategy: EntityChangeAuditStrategy<T>,
    private val deleteAuditStrategy: SoftDeleteAuditStrategyEntity<T>
) {

    fun create(customerEntity: CustomerEntity) = with(saveAuditStrategy) {
        customerEntity.copy(
            createDate = getCreateDateTime(),
            updateDate = getUpdateDateTime(),
            status = getStatus()
        )
    }

    fun update(customerEntity: CustomerEntity) = with(entityChangeAuditStrategy) {
        customerEntity.copy(updateDate = getUpdateDateTime())
    }

    fun delete(customerEntity: CustomerEntity) = with(deleteAuditStrategy) {
        update(customerEntity.copy(status = getStatus()))
    }
}
