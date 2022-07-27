package vescame.cleanarchitecture.customer.adapter

import vescame.cleanarchitecture.common.CommonAdapter
import vescame.cleanarchitecture.common.DecimalPropertyScaler
import vescame.cleanarchitecture.misc.scaler.DefaultScale
import vescame.cleanarchitecture.customer.dto.CustomerResponse
import vescame.cleanarchitecture.customer.Customer
import vescame.cleanarchitecture.misc.scaler.SalaryScaler
import java.math.RoundingMode

class CustomerAdapter(
    private val salaryScaler: SalaryScaler
) : CommonAdapter<CustomerResponse, Customer>, DecimalPropertyScaler {

    override val scale: Int = DefaultScale.SCALE
    override val roundingMode: RoundingMode = DefaultScale.ROUNDING_MODE

    override fun toAdapted(input: CustomerResponse) = Customer(
        id = input.id.toLong(),
        name = input.extractName(),
        surname = input.extractSurname(),
        birthDate = input.birthDate,
        salary = salaryScaler.scaled(input.salary)
    )

    private fun CustomerResponse.extractName() = 
        name.take(name.indexOf(" "))

    private fun CustomerResponse.extractSurname() = 
        name.substringAfter(" ")
}
