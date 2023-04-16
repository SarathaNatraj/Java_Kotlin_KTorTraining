fun main(args: Array<String>){
    val stu = StudentSecParentChild("Harry", 24)
}

open class CollegeSecParentChild{

    constructor(name: String, age: Int){
        println("parent class constructor")
        println("Student Name: ${name.toUpperCase()}")
        println("Student Age: $age")
    }
}
class StudentSecParentChild: CollegeSecParentChild{
    constructor(name: String, age: Int): super(name,age){
        println("child class constructor")
        println("Student Name: $name")
        println("Student Age: $age")
    }
}
