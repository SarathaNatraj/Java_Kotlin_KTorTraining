// SealedClasses/SealedEx1.kt

sealed class Transport {
    abstract val capacity: Int
}

data class Train(
    val line: String,
    override val capacity: Int
) : Transport()

data class Bus(
    val number: String,
    override val capacity: Int
) : Transport()

data class Tram(
    val route: String,
    override val capacity: Int
) : Transport()

data class Plane(
    val flightNumber: String,
    override val capacity: Int
) : Transport()

fun travel(transport: Transport) {
    when (transport) {
        is Train ->
            println("Train ${transport.line}")
        is Bus ->
            println("Bus ${transport.number}")
        is Tram ->
            println("Tram ${transport.route}")
        is Plane ->
            println("Plane ${transport.flightNumber}")
    }
    println("size ${transport.capacity}")
}

fun main() {
    listOf(
        Train("S1", 200),
        Bus("11", 45),
        Tram("22A Express", 60),
        Plane("1103", 190)
    ).forEach(::travel)
  //  println
/*eq """
  Train S1
  size 200
  Bus 11
  size 45
  Tram 22A Express
  size 60
  Plane 1103
  size 190
  """*/
}