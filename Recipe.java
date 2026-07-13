/* Phase 2: Recipe.java | By: JustinRapid | Start Date: June 9th, 2026 | Completion date: June 2026
--------------------------------------------------------------------------------------------------------------------------
This class will
- Hold the name of the recipe (Like Grilled chicken and veggies)
- Hold the category it belond to (like Mediterrainian)
- Hold a list of Ingredient objects that the recipe requires
- Hold the number of servings the recipe makes
Be able to hand back any of that information when asked
*/
//Import List interface for declaring variable types and ArrayList class for creating the object
import java.util.List;
import java.util.ArrayList;

public class Recipe
{
   //Declare five Private fields
   //1. A String for the recipe name
   //2. A String for the cuisine category
   //3. A List<Ingredient> for the ingredients
   //4. A List<String> for the step-by-step instructions
   //5. An int for the number of servings
   
   private String name; //No values are set yet as the constructor will be responsible for establishing the values
   private String category;
   private List<Ingredient> ingredients;
   private List<String> instructions;
   private int servings;
   
   public Recipe(String name, String category, List<Ingredient> ingredients, List<String> instructions, int servings) //Constructor
   {
      //Initialize fields
      this.name = name;
      this.category = category;
      this.ingredients = ingredients;
      this.instructions = instructions;
      this.servings = servings;
   }
   
   public String getName() //Getter for name of recipe
   {
      return this.name;
   }
   
   public String getCategory() //Getter for category of cuisine
   {
      return this.category;
   }
   
   public List<Ingredient> getIngredients() //Getter for recipe ingredients
   {
      return this.ingredients;
   }
   
   public List<String> getInstructions() //Getter for recipe instructions
   {
      return this.instructions;
   }
   
   public int getServings() //Getter for recipe servings
   {
      return this.servings;
   }
}