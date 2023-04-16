fun main(args: Array<String>) {
    print("Enter your name: ")
    val name = readLine()

    try{
        if (name == "Jack"){
            throw Exception("You don't have access")
        }
        else
        {
            println("Welcome! You have access")
        }
    }
    catch (e: Exception){
        println(e.message)
    }
}
