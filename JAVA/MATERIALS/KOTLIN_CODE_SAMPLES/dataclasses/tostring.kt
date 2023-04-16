data class StudentStr(val name: String, val age: Int, val sub: String)

fun main(args: Array<String>) {
    val stu = StudentStr("Steve", 26, "Math")
    println(stu.toString())
}
