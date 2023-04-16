// anonymous function with body as an expression
fun add(x: Int, y: Int): Int =   x+y


// anonymous function with body as a block
val anonymous2 = fun(a: Int, b: Int): Int {
    val mul = a * b
    return mul
}
fun main(args: Array<String>) {
    //invoking functions
    val sum = add(3,5)
    val mul = anonymous2(3,5)
    println("The sum of two numbers is: $sum")
    println("The multiply of two numbers is: $mul")
}