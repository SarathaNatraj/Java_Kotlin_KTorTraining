data class EmployeeUnit(
    val name: String,
    val email: String,
    val company: String
) // + automatically generated equals(), hashCode(), toString(), and copy()

object MyCompany {                                // A singleton
    const val name: String = "MyCompany"
}

fun main() {                                      // Function at the top level
    val employee = EmployeeUnit("Alice",               // No `new` keyword
        "alice@mycompany.com", MyCompany.name)
    println(employee)
}