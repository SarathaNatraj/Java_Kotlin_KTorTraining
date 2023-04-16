fun main(){
    val greet: ()->Unit = { println("Hello") }
    val square: (Int)->Int = { x -> x * x } // single level lambda expr
    val producePrinter: ()->()->Unit = { { println("I am printing") } } // two level lambda expr
// Usage
    greet() // Prints: Hello
    println(square(2)) // Prints: 4
    producePrinter()() // Prints: I am printing

    val oddSquared = listOf(1, 2, 3, 4, 5)
        .filter { n -> n % 2 == 1 } // 1, 3, 5
        .map { n -> n * n } // 1, 9, 25
        .drop(1) // 9, 25
        .take(1) // 9
    println("oddSquared is $oddSquared ")

    val target = listOf<Int>(1, 2, 3, 4, 5).filter( { n -> n % 2 == 0 })

    target.forEach { println(it) }


    val numbers = listOf(1, 2, 3)
    val words = listOf("one", "two", "three")
    numbers.zip(words)
    numbers.forEach({println(it)})

    val squares = listOf(1, 2, 3, 4,5)
        .associate { n -> n to n * n }
    squares.forEach({println(it)})


    val stream = listOf("d2", "a2", "b1", "b3", "c").asSequence().filter { it.startsWith('b' ) }

    stream.forEach(::println) // b1, b2

    println("Any B ${stream.any { it.startsWith('b') }}") // Any B true
    println("Any C ${stream.any { it.startsWith('c') }}") // Any C false

    stream.forEach(::println) // b1, b2











}