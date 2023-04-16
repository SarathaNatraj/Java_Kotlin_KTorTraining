interface MyInterface{
    var str: String

    //abstract method
    fun demo()

    //concrete method
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

/*

JAVA interface
interface Walkable{
//abstract method
public void walk();
//concrete method - fully impl. method
default public void run(){
    sop("");
}
}
 */