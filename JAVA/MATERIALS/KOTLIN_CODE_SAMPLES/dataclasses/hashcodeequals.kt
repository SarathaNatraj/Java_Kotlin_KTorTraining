data class StudentData(val name: String, val age: Int)

fun main(args: Array<String>) {
    val stu = StudentData("John", 31)
    val stu2 = StudentData("John", 31)
    val stu3 = StudentData("Ajeet", 30)
    if (stu.equals(stu2) == true)
        println("stu is equal to stu2.")
    else
        println("stu is not equal to stu2.")

    if (stu.equals(stu3) == true)
        println("stu is equal to stu3.")
    else
        println("stu is not equal to stu3.")

    println("Hashcode of stu: ${stu.hashCode()}")
    println("Hashcode of stu2: ${stu2.hashCode()}")
    println("Hashcode of stu3: ${stu3.hashCode()}")
}