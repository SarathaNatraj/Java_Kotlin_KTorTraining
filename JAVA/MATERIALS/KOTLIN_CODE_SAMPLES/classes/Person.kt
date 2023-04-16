fun main(args: Array<String>) {
    val person1 = Person("joe", 25)
}
//sagar pawar kumar - S.P. Kumar
class Person(fName: String, personAge: Int) {
    val firstName: String
    var age: Int

    // initializer block
    init {
        firstName = caps(fName)
        age = personAge

        println("First Name = $firstName")
        println("Age = $age")
    }
    fun caps(fName:String):String{
        return fName.capitalize()
    }
}