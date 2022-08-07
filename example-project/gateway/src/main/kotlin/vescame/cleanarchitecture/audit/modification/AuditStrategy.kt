package vescame.cleanarchitecture.audit.modification

import vescame.cleanarchitecture.audit.AuditableRetrievable
import vescame.cleanarchitecture.audit.modification.strategy.SaveAuditStrategy
import vescame.cleanarchitecture.customer.domain.CustomerEntity
import vescame.cleanarchitecture.audit.modification.strategy.SoftDeleteAuditStrategyEntity
import vescame.cleanarchitecture.audit.modification.strategy.UpdateAuditStrategy

class AuditStrategy <T : AuditableRetrievable>(
    private val saveAuditStrategy: SaveAuditStrategy<T>,
    private val updateAuditStrategy: UpdateAuditStrategy<T>,
    private val deleteAuditStrategy: SoftDeleteAuditStrategyEntity<T>
) {

    fun create(customerEntity: CustomerEntity) = with(saveAuditStrategy) {
        customerEntity.copy(
            createDate = getCreateDateTime(),
            updateDate = getUpdateDateTime(),
            status = getStatus()
        )
    }

    fun update(currentCustomerEntity: CustomerEntity, customerEntity: CustomerEntity) = with(updateAuditStrategy) {
        customerEntity.copy(
            createDate = currentCustomerEntity.createDate,
            updateDate = getUpdateDateTime(),
            status = (customerEntity.status ?: currentCustomerEntity.status) ?: throw IllegalArgumentException("cannot update a `null` status entity")
        )
    }

    fun softDelete(customerEntity: CustomerEntity) = with(deleteAuditStrategy) {
       customerEntity.copy(status = getStatus())
    }
}
