data class Dependency1(var value1: Int)
data class Dependency2(var value2: String)

class SystemUnderTest(
    val dependency1: Dependency1,
    val dependency2: Dependency2
)

val d1 = Dependency1(15)
val d2 = Dependency2("25")

    fun calculate() =
        d1.value1 +  d2.value2.toInt()

