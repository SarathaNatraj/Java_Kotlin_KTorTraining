sealed class Shape{
    class Circle(var radius: Float): Shape()
    class Square(var length: Int): Shape()
    class Rectangle(var length: Int, var breadth: Int): Shape()
    //  object NotAShape : Shape()
}

fun passObj(e: Shape) =
    when (e) {
        is Shape.Circle ->println("Circle area is ${3.14*e.radius*e.radius}")
        is Shape.Square ->println("Square area is ${e.length*e.length}")
        is Shape.Rectangle ->println("Rectagle area is ${e.length*e.breadth}")
        //else -> "else case is not require as all case is covered above"
        //  Shape.NotAShape ->Double.NaN
    }
fun main(args: Array<String>) {

    var circle = Shape.Circle(5.0f)
    var square = Shape.Square(5)
    var rectangle = Shape.Rectangle(4,5)

    passObj(circle)
    passObj(square)
    passObj(rectangle)
}  