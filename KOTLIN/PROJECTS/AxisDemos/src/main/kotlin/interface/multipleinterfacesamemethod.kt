interface MX {

    fun demo() {
        println("demoX function")
    }
}

interface MY  {
    fun demo() {
        println("demoY function")
    }
}

// This class implements X and Y interfaces
//class MyClassM: MX, MY

//Error - must override

// This class implements X and Y interfaces
class MyClassM: MX, MY{
    override fun demo() {
        super<MX>.demo()
        //super<T>.funname()
    }
}


fun main(args: Array<String>) {
  val obj = MyClassM()
    obj.demo()
}