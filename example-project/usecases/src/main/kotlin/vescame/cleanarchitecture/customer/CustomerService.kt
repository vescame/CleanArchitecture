package vescame.cleanarchitecture.customer

import vescame.cleanarchitecture.customer.dto.CustomerResponse
import vescame.cleanarchitecture.customer.http.UserSource
import vescame.cleanarchitecture.common.CommonAdapter
import vescame.cleanarchitecture.customer.gateway.CustomerGateway
import vescame.cleanarchitecture.customer.gateway.model.CustomerModel

class CustomerService(
    private val source: UserSource,
    private val adapter: CommonAdapter<CustomerResponse, Customer>,
    private val gateway: CustomerGateway
) {

    suspend fun getAll() = gateway.findAll().map { it.toEntity() }

    suspend fun getCustomer(customerId: Long): Customer =
        gateway.getById(customerId)?.toEntity() ?: throw IllegalArgumentException("customer not found!")

    suspend fun save(customer: Customer) {
        gateway.save(customer.toModel())
    }

    suspend fun update(customer: Customer) {
        gateway.save(customer.toModel())
    }

    suspend fun delete(customerId: String) {
        gateway.deleteById(customerId.toLong())
    }

    private fun Customer.toModel() = CustomerModel(
        id = id,
        externalId = externalId,
        name = name,
        surname = surname,
        birthDate = birthDate,
        salary = salary
    )

    private fun CustomerModel.toEntity() = Customer(
        id = id,
        externalId = externalId,
        name = name,
        surname = surname,
        birthDate = birthDate,
        salary = salary
    )
}
