package nestedandinnerclasses
enum class CreditCard : ICardLimit{
    SILVER{
        override fun getCreditLimit(): Int {
            return 1000000
        }
    },
    GOLD{
        override fun getCreditLimit(): Int {
            return 2000000
        }
    },
    PLATINUM{
        override fun getCreditLimit(): Int = 3000000
    }
};



interface ICardLimit {
    fun getCreditLimit() : Int
}


        fun main(){
            val creditLimit = CreditCard.GOLD.getCreditLimit();
            println(creditLimit)
        }
