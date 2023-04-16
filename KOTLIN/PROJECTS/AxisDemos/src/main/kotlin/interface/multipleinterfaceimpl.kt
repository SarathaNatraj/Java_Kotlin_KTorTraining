interface X {

    fun demoX() {
        println("demoX function")
    }
    fun funcX()
}

interface Y  {
    fun demoY() {
        println("demoY function")
    }
    fun funcY()
}
interface Z  : Y {
    fun demoZ() {

        println("demoY function")
    }
    fun funcZ()
}
// This class implements X and Y interfaces
class MyClassMulti: X, Z {
    override fun funcX() {
        println("Hello")
    }
    override fun funcY() {
        println("Hi")
    }
    override fun funcZ() {
        println("Hi Z")
    }


}

fun main(args: Array<String>) {
    val obj = MyClassMulti()
    obj.demoX()
    obj.demoY()
    obj.funcX()
    obj.funcY()
    obj.funcZ()
}