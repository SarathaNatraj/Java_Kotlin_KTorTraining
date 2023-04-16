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
}