data class UserData(var name: String, var age: Int)

fun main(args: Array<String>) {
    val stu = UserData("John", 31)
    val stu2 = UserData("Ajeet", 30)
    println("Student Name is: ${stu.name}")
    println("Student Age is:  ${stu.age}")
    stu.name ="Mike"
    println("Student Name is: ${stu.name}")
    println("Student Name is: ${stu2.name}")
    println("Student Age is:  ${stu2.age}")
}
