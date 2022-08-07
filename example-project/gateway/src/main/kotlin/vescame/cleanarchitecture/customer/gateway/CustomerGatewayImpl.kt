package vescame.cleanarchitecture.customer.gateway

import vescame.cleanarchitecture.customer.domain.CustomerEntity
import vescame.cleanarchitecture.customer.gateway.model.CustomerModel
import vescame.cleanarchitecture.customer.repository.CustomerRepository

class CustomerGatewayImpl(
    private val customerRepository: CustomerRepository
) : CustomerGateway {

    override suspend fun findAll() = customerRepository.findAll().mapToModel()

    override suspend fun getById(id: Long) = customerRepository.getById(id)?.toModel()

    override suspend fun save(customerModel: CustomerModel) {
        with(customerModel.toEntity()) {
            if (id != null) {
                if (getById(id) != null) {
                    customerRepository.update(this)
                } else {
                    throw IllegalArgumentException("update of customer $id cannot be completed, it's not yet persisted")
                }
            } else {
                customerRepository.save(this)
            }
        }
    }

    override suspend fun deleteById(id: Long) {
        customerRepository.delete(id)
    }

    private fun List<CustomerEntity>.mapToModel() = map { it.toModel()!! }

    private fun CustomerModel.toEntity() = CustomerEntity(
        id = id,
        externalId = externalId,
        name = name,
        surname = surname,
        birthDate = birthDate,
        salary = salary,
        status = null,
        createDate = null,
        updateDate = null
    )

    private fun CustomerEntity?.toModel() = this?.let {
        CustomerModel(
            id = it.id,
            externalId = it.externalId,
            name = it.name,
            surname = it.surname,
            birthDate = it.birthDate,
            salary = it.salary
        )
    }
}
