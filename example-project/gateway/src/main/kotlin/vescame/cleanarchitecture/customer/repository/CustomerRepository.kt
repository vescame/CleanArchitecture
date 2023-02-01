package vescame.cleanarchitecture.customer.repository

import vescame.cleanarchitecture.audit.modification.AuditStrategy
import vescame.cleanarchitecture.audit.status.RetrievableType
import vescame.cleanarchitecture.audit.status.RetrievableType.INACTIVE
import vescame.cleanarchitecture.customer.domain.CustomerEntity

class CustomerRepository(
    private val auditStrategy: AuditStrategy<CustomerEntity>
) {

    suspend fun findAll(): List<CustomerEntity> = CUSTOMER_REPOSITORY.filter { it.status != INACTIVE }

    suspend fun getById(id: Long) = CUSTOMER_REPOSITORY.firstOrNull { it.status != INACTIVE && it.id!! == id }

    suspend fun save(customerEntity: CustomerEntity) {
        CUSTOMER_REPOSITORY.add(
            auditStrategy.create(
                customerEntity.withNextId()
            ).also { println("$it created") }
        )
    }

    suspend fun update(customerEntity: CustomerEntity) {
        val customer = getById(customerEntity.id!!) ?: throw NoSuchElementException("cannot update customer $customerEntity")
        val index = CUSTOMER_REPOSITORY.indexOf(customer)
        CUSTOMER_REPOSITORY[index] = auditStrategy.update(customer, customerEntity).also { println("$CUSTOMER_REPOSITORY") }
    }

    suspend fun delete(id: Long) {
        val customer = getById(id) ?: throw NoSuchElementException("cannot delete customer $id. id is invalid.")
        update(auditStrategy.softDelete(customer))
    }

    private fun CustomerEntity.withNextId() = copy(id = latestId() + 1)

    private fun latestId() = CUSTOMER_REPOSITORY.maxByOrNull { it.id!! }?.id ?: 0

    private companion object {
        private val CUSTOMER_REPOSITORY: MutableList<CustomerEntity> = ArrayList()
    }
}