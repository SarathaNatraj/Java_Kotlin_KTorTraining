fun interface IntPredicate {
    fun accept(i: Int): Boolean
}

val isEven = IntPredicate { it % 2 == 0 }

fun main() {
    println("Is 10 even? - ${isEven.accept(10)}")
}

//SAM - Single Abstract Method