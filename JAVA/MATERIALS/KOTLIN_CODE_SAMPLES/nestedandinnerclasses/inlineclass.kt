import java.util.UUID
// With inline classes
inline class RecipeId(val id: UUID)
inline class IngredientId(val id: UUID)
data class Recipe(val id: RecipeId)
data class Ingredient(val id: IngredientId, val recipeId: RecipeId)
val ingredientId = IngredientId(UUID.randomUUID())
// Can be quite easy to pass in the incorrect UUID without inline classes:
// wont compile! yay!
//val doesntCompileIngredient = Ingredient(ingredientId, ingredientId)
val recipeId = RecipeId(UUID.randomUUID())
// compiles and is safer!
val safeCompilingIngredient = Ingredient(ingredientId, recipeId)

fun main() {
    println(safeCompilingIngredient)

    val degrees : Float = 200f
    val deg:Degrees = Degrees(180f)
    val resDeg: Degrees = deg.plus(degrees)
    println(resDeg.degrees)
    auth(UserName("user1"),Password("demo"))

}


@JvmInline
value class Password(val pwd : String)

@JvmInline
value class UserName(val uname : String)

fun  auth(uname: UserName, pwd:Password){
    //db call authenicate
    println("authenticating ab")
}


inline class Degrees(val degrees: Float=0f){
    fun plus(degrees: Float):Degrees{
        return Degrees(this.degrees + degrees)
    }
    fun minus(degrees: Degrees):Degrees{
        return Degrees(this.degrees - degrees.degrees)
    }
}