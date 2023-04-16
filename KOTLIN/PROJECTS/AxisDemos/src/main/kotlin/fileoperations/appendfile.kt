import java.io.File
fun main() {
    val filename = "abc.txt"
    // content to be written to file
    var content:String = "dummy text to show writing to file in kotlin chercher tech"
    // write content to file
    File(filename).writeText(content)
    File(filename).appendText("ppppppp")
}
