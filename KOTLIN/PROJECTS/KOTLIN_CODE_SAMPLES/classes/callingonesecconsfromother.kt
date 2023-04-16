fun main(args: Array<String>){
    val obj = StudentSecConsCall ("Ajeet")
    //val emp = Employee("Sagar","Pawar", 25)
}
class StudentSecConsCall{
    constructor(name: String): this(name, 45){
        println("secondary constructor with one param")
    }
    constructor(name: String, age: Int){
        println("secondary constructor with two param")
        println("Student Name: ${name.toUpperCase()}")
        println("Student Age: $age")
    }
}


/*
* Student(string name){
*
* Student(name,45)
*
* }
*
* Student(string name, int age){
* this.name=name;
* this.age= age;
* }
*
*
* */