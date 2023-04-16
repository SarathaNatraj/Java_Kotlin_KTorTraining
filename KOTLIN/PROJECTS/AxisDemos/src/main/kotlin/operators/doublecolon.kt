fun main() {

    val c = String::class

    c.supertypes.forEach { e -> println(e) }

    val words = listOf("car", "forest", "Bible")
    println(words.map(String::length)) //3, 6 , 5
}
//The double colon operator (::) is used to create a class or a function reference.

//double colon (::) operator, also known as method reference operator in Java, is used to call a method by referring to it
// with the help of its class directly.
//<Class name>::<method name>