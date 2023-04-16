class StudentNest {
     var studentId: Int = 1
    //by default static
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

    val motherBoard = Computer.MotherBoard("Sony", "China")
    println(motherBoard.getInfo())
}

class Computer(val model: String){
    private val name:String? =""

    class MotherBoard(val manufacturer: String, val originCountry: String){
        fun  buildDate() : String{
            return "2023-02-15"
        }
        fun getInfo()="Made by ${manufacturer} ${originCountry}"

    }

}

