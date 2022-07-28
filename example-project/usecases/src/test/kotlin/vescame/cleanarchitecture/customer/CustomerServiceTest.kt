package vescame.cleanarchitecture.customer

import vescame.cleanarchitecture.common.CommonAdapter
import vescame.cleanarchitecture.customer.CustomerService
import vescame.cleanarchitecture.customer.http.UserSource
import vescame.cleanarchitecture.customer.dto.CustomerResponse
import io.kotest.matchers.shouldBe
import io.kotest.core.spec.style.ShouldSpec
import io.mockk.mockk
import io.mockk.every
import io.mockk.verify
import io.mockk.coEvery
import io.mockk.coVerifyOrder
import java.time.LocalDate
import java.math.BigDecimal

internal class CustomerServiceTest : ShouldSpec({

    val source = mockk<UserSource>()
    val adapter = mockk<CommonAdapter<CustomerResponse, Customer>>()
    val service = CustomerService(source, adapter) 

    should("orchestrate customer integration fetch and response adapt") {
        val adapted = Customer(
            id = 1,
            name = "user",
            surname = "surname",
            birthDate = LocalDate.of(1970, 1, 1),
            salary = BigDecimal(2000.5)
        )

        coEvery {
            source.getUserById(1)
        } returns CustomerResponse(
            id = "1",
            name = "user surname",
            birthDate = LocalDate.of(1970, 1, 1),
            salary = BigDecimal(2000.4911)
        )

        every { adapter.toAdapted(any()) } returns adapted
        
        service.getCustomer("1")

        coVerifyOrder {
            source.getUserById(1)
            adapter.toAdapted(any())
        }
    }
})
