import java.io.File
import java.io.PrintWriter

fun main() {
    val fileName = "myfile.txt"
    var fileObject = File(fileName)
    // create a new file
    fileObject.writeText("This is some text for file writing operations")
    var content:String = "dummy text to show writing to file in koltin "
   val writer = PrintWriter(fileName)
    writer.append(content)
    writer.close()

}
