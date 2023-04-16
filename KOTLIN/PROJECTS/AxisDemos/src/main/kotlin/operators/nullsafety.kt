//Kotlin's null-safety operator ?. provides a safe method call—a method is called only if the object is not null.
fun main() {

    val words = listOf("forest", null, "Bible", "sky")

    for (word in words) {

        println(word?.toUpperCase())
    }
    }

