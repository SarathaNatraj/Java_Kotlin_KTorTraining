data class City(val id : Int ,val name: String, val population : Int, val countryCode: String )
fun main(args: Array<String>) {

    val city = listOf(
        City(1, "Chennai", 34000, "CH"),
        City(2, "Bangalore", 46000, "BA"),
        City(3, "Mumbai", 56000, "MU"),
        City(4, "Kolkatta", 65000, "KL"),
        City(5, "Manali", 4000, "ML"),
        City(6, "Delhi", 76000, "DL"),

    )

    val selectedPerson = city.maxByOrNull{ it.population }


    println(selectedPerson)
    println("city: ${selectedPerson?.name}" )
    println("population: ${selectedPerson?.population}" )
}

//Q.1) Find the most populated city


