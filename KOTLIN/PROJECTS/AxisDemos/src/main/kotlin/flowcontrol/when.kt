import java.util.Random
fun main() {

   val r:Int = Random().nextInt(10) - 5

    when {
        r < 0 -> println("negative value")
        r == 0 -> println("zero")
        r > 0 -> println("positive value")
    }
}
