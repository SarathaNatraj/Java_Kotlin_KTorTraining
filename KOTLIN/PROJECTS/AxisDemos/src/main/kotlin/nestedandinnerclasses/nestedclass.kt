class StudentNest {
     var studentId: Int = 1
    class Subject {
        fun subjectFunc(){
            println("Nested function - Math")
       //     println("student id is ${studentId}")
        }
    }
    class Subject1 {
        fun subjectFunc(){
            println("Nested function - Math")
          //  println("student id is ${studentId}")
        }
    }
}
fun main() {
    println(StudentNest.Subject().subjectFunc())
    println(StudentNest.Subject1().subjectFunc())
}