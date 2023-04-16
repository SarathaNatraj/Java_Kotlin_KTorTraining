fun main(args : Array<String>)  {
    val acc2 = InfixFunc()
    acc2 add 100.00
}
class InfixFunc {
    var balance = 10.0
    infix fun add(amount: Double): Unit {
        this.balance = balance + amount
        print(this.balance)
    }
}
