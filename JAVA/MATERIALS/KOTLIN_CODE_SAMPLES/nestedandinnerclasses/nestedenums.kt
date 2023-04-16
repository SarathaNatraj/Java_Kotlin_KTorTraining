enum class NestedMonths {
    January,
    February,
    March;

    enum class Day{
        Monday,
        Tuesday,
        Wednesday
    }
}

fun main(args: Array<String>) {
    println(NestedMonths.Day.Tuesday) //prints Tuesday
}
