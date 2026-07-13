/* 
Phase 1: Ingredient.java | By: JustinRapid | Start Date: June 9th, 2026 | Completion date: June  2026
--------------------------------------------------------------------------------------------------------------------------
This class will
- Hold the name of an ingredient, for example, "chicken" or "oats".
- Hold a set of allergen tags that apply to the ingredients, for example, "peanuts" or "soy beans".
- Be able to answer the question : "does this ingredient contain a specific allergen?"
*/
//Key methods: getName(), getAllergens(), containsAllergen(String)
import java.util.Set;
import java.util.HashSet;

public class Ingredient
{
//TODO: Declare two private fields
//1. A string to hold the ingredient name
//2. A set<string> to hold the allergen tags
   private String name;
   private Set<String> allergens;


//TODO: Write a constructor that takes a name and a Set<String> of allergens and assigns them 
//      to your fields
   public Ingredient(String name, Set<String> allergens) //Set<String> is used to hold a collection of multiple string values; no duplicate and no guaranteed order
   {
      this.name = name;
      this.allergens = allergens;
   }


//TODO: Write a getName() method that returns the ingredient name
   public String getName()
   {
      return this.name;
   }

//TODO: Write an getAllergens() method that returns the Set of allergens
   public Set<String> getAllergens()
   {
      return this.allergens;
   }

//TODO: Write a containsAllergen(String allergen) method
//      That returns true if the allergen set contains the given allergen
//      and false if it does not
   public boolean containsAllergen(String allergen) //boolean method allows for if-else / true or false statements
   {
      for(String a : allergens) //returns true or fals because of the Set class, which has the built in method contains()
      {
         if(a.equalsIgnoreCase(allergen)) //ignoring cases for bugs
            return true;
      } 
      return false;
   }

}