fun main(){
    var userIntArr = Array<Int>(5) {readLine()!!.toInt()}
    println("All elements ")

    val evens = userIntArr.filter { it > 0 && it % 2 == 0 }
    val odds = userIntArr.filter { it > 0 && it % 2 != 0 }

    val sumOfEvens = evens.reduce { acc, i -> acc + i }
    val sumOfOdds = odds.reduce { acc, i -> acc + i }

    println("The sum of $evens is $sumOfEvens")
    println("The sum of $odds is $sumOfOdds")

}