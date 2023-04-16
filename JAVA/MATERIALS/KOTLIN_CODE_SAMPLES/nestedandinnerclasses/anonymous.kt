interface  Switcher{
    fun on(): String
}

fun powerOn1() : String{
//local inner class
    class  Led1(val color:String){
        fun blink() : String{
            return "Blinking $color"
        }

    }
    val powerLed = Led1("Green")
    //anonymous class or object
    val powerSwitch = object : Switcher{
        override fun on(): String {
            return powerLed.blink()
        }

    }
    return powerSwitch.on()
}
fun main(){
    println( powerOn1())
}