package vescame.cleanarchitecture.customer.http

import vescame.cleanarchitecture.customer.dto.CustomerResponse

interface UserSource {

    fun getUserById(id: Long): CustomerResponse
}
