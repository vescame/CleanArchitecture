package vescame.cleanarchitecture.customer.http

import vescame.cleanarchitecture.common.CommonAdapter
import vescame.cleanarchitecture.customer.http.UserSource
import vescame.cleanarchitecture.customer.dto.CustomerResponse
import vescame.cleanarchitecture.customer.ExternalUser

class StubExternalUserSource(
    private val adapter: CommonAdapter<ExternalUser, CustomerResponse>
) : UserSource {

    override suspend fun getUserById(id: Long) = adapter.toAdapted(externalUser)

    private companion object {
        val externalUser = ExternalUser(
            id = 1,
            name = "name surname",
            birthDate = "1990-01-01",
            age = "32",
            salary = "2500.47",
            hasSalary = true
        )
    }
}
