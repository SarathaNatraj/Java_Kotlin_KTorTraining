data class Customer(val name: String, val email : String)

fun main(args: Array<String>) {
    println("Hello World!")
    val cust = Customer("bbb","sdsss")
    //cust.email ="asdasdsa"
    //cust.name = "sdasa"
    println("Name ${cust.name}")
    println("email ${cust.email}")
    val custObj = Customer("bbb","sdsss")
    if(cust.equals(custObj))
        println("equals")
    else
        println("not equals")

    println(cust.copy("aaaa","bbbb"))


   }