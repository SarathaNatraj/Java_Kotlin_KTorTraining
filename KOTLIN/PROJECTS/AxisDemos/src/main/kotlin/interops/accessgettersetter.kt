fun main(args: Array<String>) {
    val myJava = MyJava()

    myJava.lastName = "Mike"
    myJava.setfirstName("John")

    println("accessing value using property: "+myJava.firstName)
    println("accessing value using property: "+myJava.lastName)

    println("accessing value using method: "+myJava.getfirstName())
    println("accessing value using method: "+myJava.getlastName())
}
