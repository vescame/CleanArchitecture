package vescame.cleanarchitecture

import kotlinx.coroutines.coroutineScope
import vescame.cleanarchitecture.customer.CustomerService
import vescame.cleanarchitecture.customer.adapter.CustomerEntityAdapter
import vescame.cleanarchitecture.customer.http.StubExternalUserSource
import vescame.cleanarchitecture.customer.adapter.ExternalUserAdapter
import vescame.cleanarchitecture.common.DefaultScale.ROUNDING_MODE
import vescame.cleanarchitecture.common.DefaultScale.SCALE
import vescame.cleanarchitecture.decimal.DecimalScaler
import vescame.cleanarchitecture.audit.modification.AuditStrategy
import vescame.cleanarchitecture.audit.modification.strategy.SaveAuditStrategy
import vescame.cleanarchitecture.audit.modification.strategy.SoftDeleteAuditStrategyEntity
import vescame.cleanarchitecture.audit.modification.strategy.UpdateAuditStrategy
import vescame.cleanarchitecture.customer.Customer
import vescame.cleanarchitecture.customer.domain.CustomerEntity
import vescame.cleanarchitecture.customer.gateway.CustomerGatewayImpl
import vescame.cleanarchitecture.customer.repository.CustomerRepository
import java.math.BigDecimal
import java.time.LocalDate

suspend fun main() {
    val externalUserAdapter = ExternalUserAdapter()

    val stubExternalUserSource = StubExternalUserSource(externalUserAdapter)

    val decimalScaler = DecimalScaler(SCALE, ROUNDING_MODE)

    val customerAdapter = CustomerEntityAdapter(decimalScaler)

    val saveAuditStrategy = SaveAuditStrategy<CustomerEntity>()
    val updateAuditStrategy = UpdateAuditStrategy<CustomerEntity>()
    val deleteAuditStrategy = SoftDeleteAuditStrategyEntity<CustomerEntity>()

    val auditStrategy = AuditStrategy(
        saveAuditStrategy = saveAuditStrategy,
        updateAuditStrategy = updateAuditStrategy,
        deleteAuditStrategy = deleteAuditStrategy
    )

    val customerRepository = CustomerRepository(auditStrategy)

    val customerGateway = CustomerGatewayImpl(
        customerRepository = customerRepository
    )

    val customerService = CustomerService(
        source = stubExternalUserSource,
        adapter = customerAdapter,
        gateway = customerGateway
    )

    coroutineScope {
        customerService.save(
            Customer(
                id = null,
                externalId = 1,
                name = "user",
                surname = "surname",
                birthDate = LocalDate.of(1990, 1, 1),
                salary = BigDecimal("1500.0")
            )
        )
        val persisted = customerService.getAll()
        customerService.update(
            persisted.first().copy(name = "new", surname = "name")
        )
        customerService.getAll()
        customerService.delete("1")
         println(customerService.getCustomer(1))
    }
}
