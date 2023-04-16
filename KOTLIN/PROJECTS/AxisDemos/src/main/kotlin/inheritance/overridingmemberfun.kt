open class AnimalBase() {
    open fun sound() {
        println("Animal makes a sound")
    }
}

class MyDog: AnimalBase() {
   final override fun sound() {
        println("Dog makes a sound of woof woof")
    }
}

fun main(args: Array<String>) {
    val d = MyDog()
    d.sound()
}