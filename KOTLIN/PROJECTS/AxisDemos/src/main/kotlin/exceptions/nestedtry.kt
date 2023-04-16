fun main(args: Array<String>) {
    try {
        val num = 100 / 5
        println(num)
        try {
            val num2 = 100 / 0
            println(num2)
        }
        catch(e: NumberFormatException){
            println("Number Format Exception")
        }
    }
    catch(e: ArithmeticException){
        println("Arithmetic Exception")
    }
}
