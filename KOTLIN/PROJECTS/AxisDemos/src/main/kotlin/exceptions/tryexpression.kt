fun main(args: Array<String>) {
    var website = "Kotlin for Android"
    var num = try {
        website.toInt()
    }
    catch (e: NumberFormatException)
    {
        "Cannot convert String to integer"
    }
    println(num)

    var number = "100"
    var num2 = try {
        number.toInt()
    }
    catch (e: NumberFormatException)
    {
        "Cannot convert String to integer"
    }
    println(num2)
}