import java.util.Arrays;

fun main(){

    println("ENter the elements")
   // var userIntArr = Array<Int>(3, { i -> i * 5 })

    //constructing an array
    var userIntArr = Array<Int>(10,{i-> i * 1})

    // var userIntArr = Array<Int>(5) {readLine()!!.toInt()}
    println("All elements ")
    for ( x in userIntArr)
    println (x)


    val oddArray = userIntArr.filter{ it % 2 != 0 }.toTypedArray()
    print(Arrays.toString(oddArray)) // [1, 3, 5, 7, 9]




}