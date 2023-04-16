abstract class StudentAbs(name: String, age: Int) {

    init {
        println("Student name is: $name")
        println("Student age is: $age")
    }

    //non-abstract function
    fun demo() {
        println("Non-abstract function of abstract class")
    }

    //abstract function
    abstract fun func(message: String)
}

class College(name: String, age: Int): StudentAbs(name, age) {

    override fun func(message: String) {
        println(message)
    }
}

fun main(args: Array<String>) {
    val obj = College("test", 31)
    obj.func("I'm a Blogger")
    obj.demo()
}