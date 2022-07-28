package vescame.cleanarchitecture.customer.http

import vescame.cleanarchitecture.customer.http.UserSource
import vescame.cleanarchitecture.customer.dto.CustomerResponse
import vescame.cleanarchitecture.customer.adapter.ExternalUserAdapter
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import io.mockk.mockk
import io.mockk.every
import java.time.LocalDate
import java.math.BigDecimal

internal class StubExternalUserSourceTest : ShouldSpec({

    val adapter = mockk<ExternalUserAdapter>()
    val source = StubExternalUserSource(adapter)

    should("fetch user on external API") {
        val expected = CustomerResponse(
            id = "123",
            name = "username surname",
            birthDate = LocalDate.parse("1970-01-01"),
            salary = BigDecimal(2000.00)
        )

        every { adapter.toAdapted(any()) } returns expected

        val actual = source.getUserById(123)

        actual.id shouldBe "123"
        actual.name shouldBe expected.name
        actual.birthDate shouldBe expected.birthDate
        actual.salary shouldBe expected.salary
    }
})