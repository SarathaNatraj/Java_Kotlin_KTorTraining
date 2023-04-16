class OuterClass {

    private val oStr = "Outer Class"

    inner class InnerClass {
        val nStr = "Nested Class"
        fun demo() = "demo() function using $oStr"
    }
}

fun main(args: Array<String>) {
    val o = OuterClass()
    println("${o.InnerClass().demo()}")

    val i = OuterClass().InnerClass()
    println("${i.demo()}")

    val hardDisk = ComputerOuter("Desktop").HardDisk(250)
    println(hardDisk.getInfo())

    powerOn();

}
class ComputerOuter(val model: String){
    private val name:String? =""

    inner class HardDisk(val sizeInGb: Int){
        fun  buildDate() : String{
            return "2023-02-15"
        }
        fun getInfo()="Installed on ${this@ComputerOuter} with  ${sizeInGb} in Gb having ${model} brand "

    }

}

//Local inner class - defined the inside fun

fun powerOn() : String{
    var defaultColr: String = "Blue"
    class  Led(val color:String){
        fun blink() : String{
            return "Blinking $color"
        }
        fun changeDefultColor(){
            defaultColr ="yellow"
        }
    }
    val powerLed = Led("Green")
    println(" Default color $defaultColr")
    powerLed.changeDefultColor()
    println(" Default color is changed to $defaultColr")
    println(powerLed.blink())
    return powerLed.blink()
}


//data class, nested class, inner class, local inner class