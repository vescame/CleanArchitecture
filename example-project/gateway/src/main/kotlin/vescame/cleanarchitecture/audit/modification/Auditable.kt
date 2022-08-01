package vescame.cleanarchitecture.audit.modification

import java.time.LocalDateTime

interface Auditable {

    val updateDate: LocalDateTime?
}
