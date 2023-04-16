open class AnimalBase() {
    open fun sound() {
        println("Animal makes a sound")
    }
}

open class MyDog: AnimalBase() {
    override fun sound() {
        super.sound()
        println("Dog makes a sound of woof woof")
    }
}
open class MySplDog : MyDog(){
    final override fun sound() {
        println("MySplDog makes a sound of woof woof woof")

    }

}


fun main(args: Array<String>) {
    val d = MyDog()
    d.sound()
    val spl = MySplDog()
    spl.sound()
}