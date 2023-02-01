package vescame.cleanarchitecture.decimal

import java.math.RoundingMode

interface DecimalScalable {

    val scale: Int
    val roundingMode: RoundingMode
}
