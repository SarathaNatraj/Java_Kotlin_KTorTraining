fun main(args: Array<String>) {
    try{
        val a = IntArray(5)
        a[10] = 99
    }
    catch(e: ArithmeticException){
        println("ArithmeticException occurred")
    }
    catch(e: NumberFormatException){
        println("Number format exception")
    }
    catch(e: ArrayIndexOutOfBoundsException){
        println("Array index is out of range")
    }
    catch(e: Exception){
        println("Some error occurred")
    }

    println("Out of try catch block")
}