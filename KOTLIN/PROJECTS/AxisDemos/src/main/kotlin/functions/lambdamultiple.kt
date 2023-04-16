data class PersonObjMul(val name: String, val age: Int)

fun main(args: Array<String>) {

    val people = listOf(
        PersonObjMul("Jack", 34),
        PersonObjMul("Shelly", 19),
        PersonObjMul("Patrick", 13),
        PersonObjMul("Jill", 12),
        PersonObjMul("Shane", 22),
        PersonObjMul("Joe", 18)
    )


    //higher order function -
    println(" Person starts with S and max age")
    val selectedPerson = people
        .filter { it.name.startsWith("S") }
        .maxByOrNull{ it.age }


    println(selectedPerson)
    println("name: ${selectedPerson?.name}" )
    println("age: ${selectedPerson?.age}" )
    println(" Person starts with S ")

    val filterList = people.filter { it.name.startsWith("S") }
    filterList.forEach { println(it) }


}


