// accepts all type of values
fun justPrint(tobePrintend:Any){
    println(tobePrintend)
}

data class Mobile(val modelNumber:Int=4588622, val name: String="Redmi")
fun main()
{
    justPrint("karthiq")
    justPrint(250.89)
    val mob = Mobile()
    justPrint(mob)

}

