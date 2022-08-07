package vescame.cleanarchitecture.customer.gateway

import vescame.cleanarchitecture.customer.gateway.model.CustomerModel

interface CustomerGateway {

    suspend fun findAll(): List<CustomerModel>
    suspend fun getById(id: Long): CustomerModel?
    suspend fun save(customerModel: CustomerModel)
    suspend fun deleteById(id: Long)
}