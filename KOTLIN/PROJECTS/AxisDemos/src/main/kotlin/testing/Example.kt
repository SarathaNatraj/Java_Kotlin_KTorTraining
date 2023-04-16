class ExampleClass {
    fun multiplyByTen(number: Int) = 10 * number
    fun publicFunction() = privateFunction()
    private fun privateFunction() = "Returned value"
}

object ExampleObject {
    fun concat(one: String, two: String) = one + two
}