//The non-null assertion operator (!!) converts any value to a non-null type and throws an exception if the value is null.
fun main() {

//    val words = listOf("forest", null, "Bible", "sky")
    val words = listOf("forest", "Bible", "sky")

    var nOfChars: Int = 0

    for (word in words) {

        val n = word!!.length
        nOfChars += n
    }

    println("There are ${nOfChars} characters in the list")
}
