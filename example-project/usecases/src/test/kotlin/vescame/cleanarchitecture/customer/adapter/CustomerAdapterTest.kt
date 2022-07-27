package vescame.cleanarchitecture.customer.adapter

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import vescame.cleanarchitecture.customer.dto.CustomerResponse
import vescame.cleanarchitecture.misc.scaler.DefaultScale.ROUNDING_MODE
import vescame.cleanarchitecture.misc.scaler.DefaultScale.SCALE
import vescame.cleanarchitecture.misc.scaler.SalaryScaler
import java.math.BigDecimal
import java.time.LocalDate

internal class CustomerAdapterTest : ShouldSpec({
    val salaryScaler = mockk<SalaryScaler>()
    val adapter = CustomerAdapter(
        salaryScaler = salaryScaler
    )

    should("map response dto to entity") {
        val response = CustomerResponse(
            id = "1234",
            name = "any name",
            birthDate = LocalDate.of(2022, 1, 1),
            salary = BigDecimal(1500.333)
        )

        val expectedSalary = response.salary.setScale(SCALE, ROUNDING_MODE)

        every { salaryScaler.scaled(any()) } returns expectedSalary

        val adapted = adapter.toAdapted(response)

        adapted.id shouldBe 1234
        adapted.name shouldBe "any"
        adapted.surname shouldBe "name"
        adapted.birthDate shouldBe LocalDate.of(2022, 1, 1)
        adapted.salary shouldBe expectedSalary
    }
})
