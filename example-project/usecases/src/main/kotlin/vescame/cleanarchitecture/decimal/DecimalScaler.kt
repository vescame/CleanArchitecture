package vescame.cleanarchitecture.decimal

import vescame.cleanarchitecture.common.DefaultScale
import java.math.BigDecimal
import java.math.RoundingMode

class DecimalScaler(
    override val scale: Int = DefaultScale.SCALE,
    override val roundingMode: RoundingMode = DefaultScale.ROUNDING_MODE
) : DecimalScalable {

    fun scaled(value: BigDecimal): BigDecimal = value.setScale(scale, roundingMode)
}