package vescame.cleanarchitecture.customer.adapter

import vescame.cleanarchitecture.customer.dto.CustomerResponse
import vescame.cleanarchitecture.customer.ExternalUser
import vescame.cleanarchitecture.customer.adapter.ExternalUserAdapter
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import java.time.LocalDate
import java.math.BigDecimal

internal class ExternalUserAdapterTest : ShouldSpec({
    val adapter = ExternalUserAdapter() 

    should("adapt user response to usecase required dto") {
        val user = ExternalUser(
            id = 1,
            name = "name surname",
            birthDate = "1990-01-01",
            age = "32",
            salary = "2500.47",
            hasSalary = true
        )

        val expected = CustomerResponse(
            id = "1",
            name = "name surname",
            birthDate = LocalDate.parse("1990-01-01"),
            salary = BigDecimal("2500.47")
        )

        val actual = adapter.toAdapted(user)

        actual.id shouldBe expected.id
        actual.name shouldBe expected.name
        actual.birthDate shouldBe expected.birthDate
        actual.salary shouldBe expected.salary
    }
})
