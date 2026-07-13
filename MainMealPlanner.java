/* 
Phase 8: MainMealPlanner.java | By: JustinRapid | Start Date: June 9th, 2026 | Original Completion date: June 2026
--------------------------------------------------------------------------------------------------------------------------

What This Program Does
---------------------------------
Show a welcome message and a main menu
Let the user set their allergy profile
Let the user pick their cusine category
Generate and display the weekly plan
Let the user modify the plan if desired
Loop until the user chooses to quit the program
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MainMealPlanner
{
    // Shared objects the whole program uses
    private static Scanner input = new Scanner(System.in);
    private static AllergyProfile profile = new AllergyProfile();
    private static UserPreferences prefs = new UserPreferences();
    private static WeeklyMealPlan currentPlan = null;

    public static void main(String[] args)
    {
       //Display welcome menu
       System.out.println("======================================");
       System.out.println(" THE WEEKLY MEAL PLANNER APPLICATION");
       System.out.println("======================================");
       
       boolean running = true;
       
       while(running)
       {
         System.out.println("----- Main Menu -----");
         System.out.println("1. Set Allergy Profile");
         System.out.println("2. Select Meal Category");
         System.out.println("3. Generate The Weekly Meal Plan");
         System.out.println("4. View Full Recipe For a Day");
         System.out.println("5. Replace a Single Day");
         System.out.println("6. Exit Program");
         System.out.print("Please make a selection: ");
         
         int choice = input.nextInt();
         input.nextLine(); //clears the leftover newline after nextInt
         
         switch(choice)
         {
         case 1: setAllergyProfile(); break;
         case 2: selectCategories(); break;
         case 3: generatePlan(); break;
         case 4: viewRecipe(); break;
         case 5: replaceDay(); break;
         case 6: running = false;
            System.out.println("Goodbye!"); break;
         default: System.out.println("Invalid selection. Please choose between 1-6.");
         }
         
       }
        
        
    }

   public static void setAllergyProfile()
   {
      System.out.println("----- SET ALLERGY PROFILE -----");
      System.out.println("Available allergens to choose from:");
      System.out.println("Soybeans, Peanuts, Almonds, Walnuts, Sesame Seed,");
      System.out.println("Tomatoes, Carrots, Potatoes, Green Beans, Onions,");
      System.out.println("Spinach, Cauliflower, Broccoli, Apple, Peach, Banana");
      System.out.print("\n");
      System.out.println("Type an allergen to add it to the profile, or type 'done' to finish.");
      
      boolean adding = true;
      
      while(adding)
      {
         System.out.print("Add allergen (or 'done'): ");
         String entry = input.nextLine();
         
         if(entry.equalsIgnoreCase("done"))
            adding = false;
         else
         {
            profile.addAllergen(entry);
            System.out.println(entry + " has been added to your allergy profile!");
         }
      }
      
      System.out.println("\nYour Current allergy profile: " + profile.getAllergens());
   
   }

   public static void selectCategories()
   {
      System.out.println("----- SELECT MEAL CATEGORY -----");
      System.out.println("Available Categories:");
      System.out.println("American, Italian, Mexican, Asian, Mediterranean,");
      System.out.println("BBQ, Soul Food, Middle Eastern, Seafood");
      System.out.print("\n");
      System.out.println("Type a category to add it, or type 'done' to finish.");
      
      List<String>selectedCategories = new ArrayList<>();
      
      boolean adding = true;
      
      while(adding)
      {
         System.out.print("Add a category (or 'done'): ");
         String entry = input.nextLine();
         
         if(entry.equalsIgnoreCase("done"))
            adding = false;
         else
         {
            selectedCategories.add(entry);
            System.out.println(entry + " has been added.");
         }
      }
   
      prefs.setCategories(selectedCategories);
      System.out.println("\nYour selected meal categories: " + prefs.getCategories());
   
   }

   public static void generatePlan()
   {
      System.out.println("----- GENERATE WEEKLY MEAL PLAN -----");
      
      //make sure the user has picked their categories
      if(prefs.getCategories().isEmpty())
      {
         System.out.println("Please select at least one category first (Option 2).");
         return;
      }
      
      currentPlan = MealPlanner.generateWeeklyPlan(prefs, profile);
      
      if(currentPlan.getMeals().isEmpty())
      {
         System.out.println("No recipes matched your categories and allergies.");
         System.out.println("Try selecting more categories or fewer allergens.");
      }
      else
         currentPlan.displayPlan();
   }

   public static void viewRecipe()
   {
      System.out.println("----- VIEW FULL RECIPE -----");
      
      if(currentPlan == null)
      {
         System.out.println("Please generate a meal plan first (Option 3).");
         return;
      }
   
      System.out.print("Enter a day (1 through 7): ");
      int day = input.nextInt();
      input.nextLine();
      
      //validate the day is within the range
      if(day < 1 || day > currentPlan.getMeals().size())
      {
         System.out.println("Invalid day. Please choose a valid day from your plan (1 through 7).");
         return;
      }
      
      currentPlan.displayRecipe(day - 1);
      
   }

   public static void replaceDay()
   {
      System.out.println("----- REPLACE A SINGLE DAY IN THE WEEK -----");
      
      //guard clause as before
      if(currentPlan == null)
      {
         System.out.println("Please generate a meal plan first (Option 3).");
         return;
      }
      //show current plan so they can see what to replace
      currentPlan.displayPlan();
      
      //Ask which day to replace
      System.out.print("\nWhich day would you like to replace? (1-7): ");
      int day = input.nextInt();
      input.nextLine();
      
      //validate the day is in the proper range
      if(day < 1 || day > currentPlan.getMeals().size())
      {
         System.out.println("Invalid day. Please choose a valid day from your plan (1 through 7).");
         return;
      }
      //replace the day using the MealPlanner make sure to subtract 1 for the index
      MealPlanner.replaceDay(day - 1, currentPlan, profile);
      
      System.out.println("\nDay " + day + " has been replaced!");
      currentPlan.displayPlan();
      
   }

}