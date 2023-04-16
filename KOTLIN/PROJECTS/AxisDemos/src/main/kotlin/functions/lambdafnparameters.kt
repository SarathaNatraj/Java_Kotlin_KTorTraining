 class LambdaFunctions{

     fun getStartsWithS() : List<PersonL>{
        val selectedPerson = people
            .filter { it.name.startsWith("S") }
        return selectedPerson
    }

    fun getStartsWithSSize() : Int{
        val selectedPerson = people
            .filter { it.name.startsWith("S") }
        return selectedPerson.size
    }
}


data class PersonL(val name: String, val age: Int)
val people = listOf(
    PersonL("Jack", 34),
    PersonL("Shelly", 19),
    PersonL("Patrick", 13),
    PersonL("Jill", 12),
    PersonL("Shane", 22),
    PersonL("Joe", 18)
)

fun main(args: Array<String>) {

    val la = LambdaFunctions()

    //LAMBDA EXPRESSION
    val selectedPerson:Int = la.getStartsWithS().size

    //lambda expression
    val selectedPerson1 = people.minByOrNull({ it.age })

    println(selectedPerson)
//    println("name: ${selectedPerson?.name}" )
//    println("age: ${selectedPerson?.age}" )

    println(selectedPerson1)
    println("name: ${selectedPerson1?.name}" )
    println("age: ${selectedPerson1?.age}" )

    //passing lambda to function
    callMe({ println("Hello!") })

}

fun callMe(greeting: () -> Unit) {
    greeting()
}

