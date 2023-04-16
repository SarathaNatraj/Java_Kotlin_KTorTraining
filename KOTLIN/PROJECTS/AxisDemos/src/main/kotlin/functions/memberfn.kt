class User(val firstName: String, val lastName: String) {
    // Member function
    fun getFullName(): String {
        return firstName + " " + lastName }
}
fun main(){
    val user = User("Bill", "Gates") // Create an object of the class
    println("Display Name : ${user.getFullName()}") // Call the member function

}