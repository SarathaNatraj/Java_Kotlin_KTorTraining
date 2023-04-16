import java.io.File
fun main() {
    val fileName = "myfile1.txt"
    var fileObject = File(fileName)
    // create a new file
    val isNewFileCreated :Boolean = fileObject.createNewFile()
    if(isNewFileCreated){
        println("$fileName is created successfully.")
    } else{
        println("$fileName already exists.")
    }
    // try creating a file that already exists
    val isFileCreated :Boolean = fileObject.createNewFile()
    if(isFileCreated){
        println("$fileName is created successfully.")
    } else{
        println("$fileName already exists.")
    }
}