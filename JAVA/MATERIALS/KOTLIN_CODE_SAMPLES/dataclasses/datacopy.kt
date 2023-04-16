data class StudentCopy(val name: String, val age: Int, val sub: String)

fun main(args: Array<String>) {
    val stu = StudentCopy("Steve", 26, "Math")

    // copying the age and subject from object stu
    val stu2 = stu.copy(name = "Lucy",sub="Science")

    println("stu: Name ${stu.name}, Age ${stu.age} & Subject ${stu.sub}")
    println("stu2: Name ${stu2.name}, Age ${stu2.age} & Subject ${stu2.sub}")
}
