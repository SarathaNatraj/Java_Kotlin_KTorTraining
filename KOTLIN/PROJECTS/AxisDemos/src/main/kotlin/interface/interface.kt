interface MyInterface{
    var str: String

    fun demo()

    fun func(){
        println("Hello")
    }
}

class MyClassInter: MyInterface{
    override var str: String = "Kotlin for Android"
    override fun demo() {
        println("demo function")
    }
}
fun main(args: Array<String>) {
    val obj = MyClassInter()
    obj.demo()
    obj.func()
    println(obj.str)

}