enum class MonthsWhen {
    January,
    February,
    March;
}

fun main(args: Array<String>) {

    var m = MonthsWhen.February

    when (m) {
        MonthsWhen.January  -> print("Matches with Jan")
        MonthsWhen.February -> print("Matches with Feb") //prints this.
        MonthsWhen.March -> print("Matches with Mar")
    }
}
