package vescame.cleanarchitecture.customer

data class ExternalUser(
    val id: Long,
    val name: String,
    val birthDate: String,
    val age: String,
    val salary: String,
    val hasSalary: Boolean
)
