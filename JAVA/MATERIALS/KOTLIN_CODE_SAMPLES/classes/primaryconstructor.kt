fun main(args: Array<String>) {

    val person1 = PersonObj("Joe", 25)

    println("First Name = ${person1.firstName}")
    println("Age = ${person1.age}")
}
//primary constructor
class PersonObj(val firstName: String, var age: Int) {

}