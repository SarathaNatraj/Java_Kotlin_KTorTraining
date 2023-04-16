fun main(args: Array<String>) {
    try {

        var num = 10/5
        println("Kotlin for Android")
        var arr = arrayOf(1,2,3)
        arr[5] = 78
        println(num)


    } catch (e: ArithmeticException) {
        println("Arithmetic Exception")
    } catch (e: Exception) {
        println(" parent exception type")
        println(e)
    } finally {
        println("It will print in any case.")
    }
}