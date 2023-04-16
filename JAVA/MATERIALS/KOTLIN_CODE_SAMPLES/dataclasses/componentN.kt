data class StudentComp(val name: String, val age: Int, val sub: String)

//componentN functions
fun main(args: Array<String>) {
    val stu = StudentComp("Steve", 26, "Math")
    val name = stu.component1()
    val age = stu.component2()
    val sub = stu.component3()
    println("Name is: $name")
    println("Age is: $age")
    println("SUbject is: $sub")
}
