/*
Phase 6: MainMealPlanner.java | By: JustinRapid | Start Date: June 9th, 2026 | Original Completion date: June 2026
--------------------------------------------------------------------------------------------------------------------------

This program will generate a seven day meal plan by filtering recipes based on the user's categories and allergy profile.
replace a single day in an existing plan without regenerating the whole week if desired.
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MealPlanner
{

    // TODO: Write generateWeeklyPlan(UserPreferences prefs, AllergyProfile profile)
    // public static WeeklyMealPlan generateWeeklyPlan(UserPreferences prefs, AllergyProfile profile)
    public static WeeklyMealPlan generateWeeklyPlan(UserPreferences prefs, AllergyProfile profile)
    {
      // Step 1: Get all recipes from RecipeDatabase
      List<Recipe> allRecipes = RecipeDatabase.getAllRecipes();
      
      // Step 2: Filter safe recipes using profile
      List<Recipe> safeRecipes = RecipeDatabase.filterSafe(profile);
      List<Recipe> filteredRecipes = new ArrayList<>();
      
      // Step 3: Filter by user's selected categories
      for(String category : prefs.getCategories())
      {
         for(Recipe recipe : safeRecipes)
         {
            if(recipe.getCategory().equalsIgnoreCase(category))
               filteredRecipes.add(recipe);
         }
      }
     
     // Step 4: Shuffle the filtered list
     Collections.shuffle(filteredRecipes);
     
     // Step 5: Pick the first 7 recipes from the shuffled list
     List<Recipe> weekMeals = new ArrayList<>();
     
     int mealsNeeded = Math.min(7, filteredRecipes.size());
     
     for(int i = 0; i < mealsNeeded; i++)
      weekMeals.add(filteredRecipes.get(i));
      
     // Step 6: Return a new WeeklyMealPlan built from those 7 recipes
     return new WeeklyMealPlan(weekMeals);
    }
    
    // TODO: Write replaceDay(int day, WeeklyMealPlan plan, AllergyProfile profile)
    // public static void replaceDay(int day, WeeklyMealPlan plan, AllergyProfile profile)
    public static void replaceDay(int day, WeeklyMealPlan plan, AllergyProfile profile)
    {
      // Step 1: Get all safe recipes using profile
      List<Recipe> safeRecipes = RecipeDatabase.filterSafe(profile);
      
      // Step 2: Remove any recipes already in the current plan
      safeRecipes.removeAll(plan.getMeals());
      
      // Step 3: Shuffle the remaining pool
      Collections.shuffle(safeRecipes);
      
      // Step 4: Pick the first recipe and call plan.setMealForDay(day, recipe)
      if(!safeRecipes.isEmpty())
         plan.setMealForDay(day, safeRecipes.get(0));
    }
    
   


    
    
   
    
    

}
