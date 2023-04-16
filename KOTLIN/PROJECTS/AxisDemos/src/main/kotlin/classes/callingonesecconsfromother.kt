fun main(args: Array<String>){
    val obj = StudentSecConsCall ("Ajeet")
}
class StudentSecConsCall{
    constructor(name: String): this(name, 45){
        println("secondary constructor with one param")
    }
    constructor(name: String, age: Int){
        println("secondary constructor with two param")
        println("Student Name: ${name.toUpperCase()}")
        println("Student Age: $age")
    }
}
