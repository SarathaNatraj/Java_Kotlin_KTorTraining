class Structure() {

    infix fun createPyramid(rows: Int) {
        var k = 0
        for (i in 1..rows) {
            k = 0
            for (space in 1..rows-i) {
                print("  ")
            }
            while (k != 2*i-1) {
                print("* ")
                ++k
            }
            println()
        }
    }
    //infix  fun Int.add( y: Int): Int =   this +y
}

fun main(args: Array<String>) {
    val p = Structure()
  //  4 add 5 //
    p createPyramid 10       // p.createPyramid(4)

    //createPyramid is operator
}