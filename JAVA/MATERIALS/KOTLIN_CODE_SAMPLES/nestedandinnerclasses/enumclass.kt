import javax.print.attribute.standard.PrinterMoreInfoManufacturer

enum class Months{
    January,
    February,
    March
}
fun main(args: Array<String>) {

    println(Months.January) //prints January
    println(Months.values().size) //prints 3
    println(Months.valueOf("March")) //prints March



    for (enum in Months.values()) {
        println(enum.name.toUpperCase())
    }

  println(Months.valueOf("Mar")) //throws java.lang.IllegalArgumentException: No enum constant Months.Mar

    println(CardType.SILVER.id)
    val cashPackPercentage = CardType.SILVER.calculateCashPackPercent();
    println(cashPackPercentage);

    for (enum in CardType.values()) {
        println(enum.name)
    }
}
enum class CardType(val color:String, var id:Int, var manufacturer: String){
    SILVER("gray" , 102, "Kalyan"){
                                 override  fun calculateCashPackPercent() = 0.25f
                                  },
    GOLD("yellow", 125, "ABC"){
        override  fun calculateCashPackPercent() = 0.5f
                              },
    PLATINUM("black", 500, "XYZ"){
        override  fun calculateCashPackPercent() = 0.75f
    };
    abstract fun calculateCashPackPercent() : Float

}

//class