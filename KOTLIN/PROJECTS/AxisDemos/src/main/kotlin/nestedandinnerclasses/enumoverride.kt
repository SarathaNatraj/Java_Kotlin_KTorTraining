enum class MonthsOverride(var shorthand: String) {
    January("JAN"){
        override fun printSomething() {
            println("First month of the year.")
        }
    },
    February("FEB"){
        override fun printSomething() {
            println("Second month of the year.")
        }
    },
    March("MAR"){
        override fun printSomething() {
            println("Third month of the year.")
        }
    };
    var a: String = "Hello, Kotlin Enums"
    abstract fun printSomething()
}

fun main(args: Array<String>) {
    MonthsOverride.February.printSomething() //prints Second month of the year.
    println(MonthsOverride.February.a) //prints Hello, Kotlin Enums
    println(MonthsOverride.March.a) //prints Hello, Kotlin Enums

}
