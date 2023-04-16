fun demo(exam: (id: String)->Unit, id: String){
    println("Have a Nice Day users - inline function")
    exam(id)
}
inline fun demo1(exam: (id: String)->Unit, id: String){
       println("Have a Nice Day users please try again")
    exam(id)
}
class Second {
    var stdid:Int = 0
    var stdName:String="John"
    var stdRollno:Int=13
    var stdAddress:String="adadsas"
    fun stddets(){
        println("Welcome To My Domain this is the second example reagrding the kotlin companion object")
        println("${this.stdid}")
        println("${this.stdName}")
        println("${this.stdRollno}")
        println("${this.stdAddress}")
        println("We have entered the student details like student id, student name, student roll number, student Address etc the information’s are encrypted and it is stored in the separate database in cloud applications")
    }
    companion object eg{
        var p: Int = 3
        var empid:Int = 0
        var empName:String="Malar"
        var empSalary:Int=13000
        var empAddress:String="fsdfmsdnfds"
        fun details(){
            println("Your details are: $p")
            p++
        }
        fun empdetails(){
            println("${this.empid}")
            println("${this.empName}")
            println("${this.empSalary}")
            println("${this.empAddress}")
            println("We have entered the student details like employee id, employee name, employee salary, employee Address etc the information’s are encrypted and it is stored in the separate database in cloud applications")
        }
    }
}
fun main() {
    demo({ id: String ->
        println("Thank you users for spending the time")
        println("Kindly keep trying and spent your valuable time with us $id")
    }, "Welcome Users")
    Second.details()
    Second.eg.details()
    Second.eg.empdetails()
 }

