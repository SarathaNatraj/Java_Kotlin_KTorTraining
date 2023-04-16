fun main() {

   // val nums = intArrayOf(1, 2, 3, 4, 5)


    val nums = IntArray(5) {readLine()!!.toInt()}

    val avg = nums.average()
    println("The average is $avg")

    val nOfValues = nums.count()
    println("There are $nOfValues elements")

    val sumOfValues = nums.sum()
    println("The sum of values is $sumOfValues")


       val maxValue = nums.maxOrNull()
    println("The maximum is $maxValue")

    val minValue = nums.minOrNull()
    println("The maximum is $minValue")

    nums.sort()
    for ( x in nums)
        println (x)




}