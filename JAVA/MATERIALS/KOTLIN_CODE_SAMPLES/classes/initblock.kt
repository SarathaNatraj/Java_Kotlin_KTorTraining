fun main(args: Array<String>) {

    val stu = StudentInit("John", 31)
    val stu2 = StudentInit("John")
    val stu3 = StudentInit()

}

class StudentInit (val name: String = "Student", var age: Int = 99) {
    val stuName: String
    var stuAge: Int
    init{
        if(name == "Student") {
            stuName = "NA"
            stuAge = 0
        }
        else {
            stuName = name.toUpperCase()
            stuAge = age
        }
        println("Student Name is: $stuName")
        println("Student Age is: $stuAge")
    }
}