fun main(args: Array<String>){
    val obj = StudentSec ("Ajeet", 30)
    val objq = StudentSec ("Ajeet", 30,"aasa@gmail.com")
}

class StudentSec{
    constructor(name: String, age: Int){
        println("Student Name: ${name.toUpperCase()}")
        println("Student Age: $age")
    }

    constructor(name: String, age: Int,email : String){
        println("Student Name: ${name.toUpperCase()}")
        println("Student Age: $age")
        println("Student Email : $email")
    }
}
