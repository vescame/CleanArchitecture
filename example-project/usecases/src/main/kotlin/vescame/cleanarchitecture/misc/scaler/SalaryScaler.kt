package vescame.cleanarchitecture.misc.scaler

import java.math.BigDecimal
import java.math.RoundingMode

class SalaryScaler(
    private val scale: Int,
    private val roundingMode: RoundingMode
) {

    fun scaled(value: BigDecimal): BigDecimal = value.setScale(scale, roundingMode)
}