package vescame.cleanarchitecture.common

import java.math.RoundingMode

interface DecimalPropertyScaler {

    val scale: Int
    val roundingMode: RoundingMode
}
