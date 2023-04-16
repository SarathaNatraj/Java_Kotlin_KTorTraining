data class PersonM(val name: String, val age: Int)

fun main(args: Array<String>) {

    val greeting = { println("Hello!")}

    // invoking function
    greeting()


    val persons = listOf(PersonM("Tod", 5), PersonM("Max", 33),
        PersonM("Frank", 13), PersonM("Peter", 18),
        PersonM("Pamela", 18))

    val phrase = persons
        .filter { it.age >= 18 }
        .map { it.name }
        .joinToString(" and ", "In India ", " are of legal age.")

    println(phrase)

    //group people by age, print age and names together

    val map1 = persons.map { it.age to it.name }.toMap()
    println(map1)

    val map4 = persons.groupBy { it.age }
    println(map4)


    val map5 = persons.groupBy { it.age }.mapValues { it.value.map { it.name } }
    println(map5)

    //Map names, join together with delimiter
    val names = persons.map { it.name.toUpperCase() }.joinToString (" | ")
    println(names)




}
