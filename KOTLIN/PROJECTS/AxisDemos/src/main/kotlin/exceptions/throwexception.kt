fun main(args: Array<String>) {
    try{
        println("Before exception")
        throw Exception("Something went wrong here")
        println("After exception")
    }
    catch(e: Exception){
        println(e)

    }
    finally{
        println("You can't ignore me")
    }
}
