/*
Phase 7: WeeklyMealPlan.java | By: JustinRapid | Start Date: June 9th, 2026 |  Completion date: June 2026
--------------------------------------------------------------------------------------------------------------------------

What this program does
-----------------------
hold the list of seven recipes that make up the week
Hand back the full list of meals when asked by user
Hand back one specific day's meal if user chooses
Replace one day's meal with a new recipe
Display the full weekly plan in a readable format
getMeals() — hands back the list → Getter
getMealForDay(int day) — hands back one item → Getter (with a parameter)
setMealForDay(int day, Recipe recipe) — changes one item → Action
displayPlan() — prints everything → Action (output)
*/

import java.util.List;
import java.util.ArrayList;

public class WeeklyMealPlan
{
    // TODO: Declare one private field
    // A List<Recipe> called meals
   private List<Recipe> meals;

    // TODO: Write a constructor that takes a List<Recipe>
    // public WeeklyMealPlan(List<Recipe> meals)
    // Assign the parameter to the field
   public WeeklyMealPlan(List<Recipe> meals)
      {
         this.meals = meals;
      }

    // TODO: Write getMeals()
    // public List<Recipe> getMeals()
    // Returns the meals list
   public List<Recipe> getMeals()
   {
      return meals;
   }

    // TODO: Write getMealForDay(int day)
    // public Recipe getMealForDay(int day)
    // Returns the recipe at the given day index
    // Hint: meals.get(day)
   public Recipe getMealForDay(int day)
   {
      return meals.get(day);
   }

    // TODO: Write setMealForDay(int day, Recipe recipe)
    // public void setMealForDay(int day, Recipe recipe)
    // Replaces the recipe at the given day index
    // Hint: meals.set(day, recipe)
   public void setMealForDay(int day, Recipe recipe)
   {
      meals.set(day, recipe);
   }

    // TODO: Write displayPlan()
    // public void displayPlan()
    // Loop through the meals and print each day's recipe
    // We will build this one together after the others
   public void displayPlan()
   {
      System.out.println("==== Your Weekly Meal Plan =====");
      System.out.println();
      
      for(int i = 0; i < meals.size(); i++)
      {
         //Get the recipe for this specific day
         Recipe recipe = meals.get(i);
         
         //Print day number (i + 1 since i starts at 0)
         System.out.println("Day " + (i + 1) + ": " +
            recipe.getName() + " (" + recipe.getCategory() + ")");
      }
      System.out.println();
   }

   public void displayRecipe(int day)
   {
      //Get the recipe for that day   
      Recipe recipe = meals.get(day);
      
      //Print the header with day number, name, category, servings
      System.out.println("===== Day " + (day + 1) + ": " + recipe.getName() + " =====");
      System.out.println("Category: " + recipe.getCategory());
      System.out.println("Servings: " + recipe.getServings());
      System.out.print("\n");
      
      //Print out all ingredients in the recipe
      System.out.println("INGREDIENTS:");
      for(Ingredient ingredient : recipe.getIngredients())
      {
         System.out.println("- " + ingredient.getName());
      }
      System.out.print("\n");
      
      //Print all of the steps required in the recipe
      System.out.println("INSTRUCTIONS:");
      for(String step : recipe.getInstructions())
      {
         System.out.println(step);
      }
   
   }

}