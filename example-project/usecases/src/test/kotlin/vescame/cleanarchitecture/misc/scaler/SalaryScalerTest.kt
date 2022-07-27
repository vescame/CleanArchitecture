package vescame.cleanarchitecture.misc.scaler

import java.math.BigDecimal
import java.math.RoundingMode
import vescame.cleanarchitecture.misc.scaler.DefaultScale.SCALE
import vescame.cleanarchitecture.misc.scaler.DefaultScale.ROUNDING_MODE
import vescame.cleanarchitecture.misc.scaler.SalaryScaler
import io.kotest.matchers.shouldBe
import io.kotest.core.spec.style.ShouldSpec

internal class SalaryScalerTest : ShouldSpec ({
    val scaler = SalaryScaler(SCALE, ROUNDING_MODE)

    should("scale BigDecimal property") {
        val actual = scaler.scaled(BigDecimal(10.333))

        actual.toString() shouldBe "10.33"
    }
})
