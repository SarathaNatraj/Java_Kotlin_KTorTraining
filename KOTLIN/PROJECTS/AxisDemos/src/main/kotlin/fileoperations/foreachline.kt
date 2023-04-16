import java.io.File
fun main() {
    val file = File("mytext.txt")
    file.forEachLine { println(it) }
}
