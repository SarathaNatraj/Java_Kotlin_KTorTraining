import java.io.File
fun main() {
    val file = File("myfile.txt")
    val bufferedReader = file.bufferedReader()
    val text:List<String> = bufferedReader.readLines()
    for(line in text){
        println(line)
    }
}
