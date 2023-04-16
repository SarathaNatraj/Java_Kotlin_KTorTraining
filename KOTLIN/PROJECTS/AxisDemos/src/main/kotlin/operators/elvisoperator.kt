//The Elvis operator ?: returns its first expression if it is not null, otherwise it returns the second expression.
fun main() {

    val words = listOf("forest", null, "Bible", "sky")

    for (word in words) {

        val n = word?.length ?: 0

        println("${word} has ${n} letters")
    }
}
