class OuterClass {

    val oStr = "Outer Class"

    inner class InnerClass {
        val nStr = "Nested Class"
        fun demo() = "demo() function using $oStr"
    }
}

fun main(args: Array<String>) {
    val o = OuterClass()
    println("${o.InnerClass().demo()}")

    val i = OuterClass().InnerClass()
    println("${i.demo()}")
}
