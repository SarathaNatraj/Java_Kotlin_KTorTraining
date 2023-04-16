open class AnimalProp() {
    open var colour: String = "White"
}

class DogProp: AnimalProp() {
    override var colour: String = "Black"
    fun sound() {
        println("Dog makes a sound of woof woof")
    }
}

fun main(args: Array<String>) {
    val d = DogProp()
    d.sound()
    println("${d.colour}")
}