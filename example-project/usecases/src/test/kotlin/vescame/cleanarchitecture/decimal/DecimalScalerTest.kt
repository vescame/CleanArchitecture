package vescame.cleanarchitecture.decimal

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import vescame.cleanarchitecture.common.DefaultScale
import java.math.BigDecimal

internal class DecimalScalerTest : ShouldSpec({
    val scaler = DecimalScaler(DefaultScale.SCALE, DefaultScale.ROUNDING_MODE)

    should("scale BigDecimal property") {
        val actual = scaler.scaled(BigDecimal(10.333))

        actual.toString() shouldBe "10.33"
    }
})