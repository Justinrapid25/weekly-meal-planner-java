/* Phase 4: AllergyProfile.java | By: JustinRapid | Start Date: June 9th, 2026 | Original Completion date: June 2026
--------------------------------------------------------------------------------------------------------------------------
*/
import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class AllergyProfile
{
    // TODO: Declare one private field
    // A Set<String> called allergens to hold the user's flagged allergens
    private Set<String> allergens;


    // TODO: Write a no-argument constructor
    // It should initialize the allergens Set as a new empty HashSet
    // Hint: this is different from before — no parameters needed
    public AllergyProfile()
    {
      this.allergens = new HashSet<>();
    }

    // TODO: Write addAllergen(String allergen)
    // public void addAllergen(String allergen)
    // Adds the given allergen to the set
    public void addAllergen(String allergen)
    {
      allergens.add(allergen);
    }

    // TODO: Write removeAllergen(String allergen)
    // public void removeAllergen(String allergen)
    // Removes the given allergen from the set
    public void removeAllergen(String allergen)
    {
      allergens.remove(allergen);
    }

    // TODO: Write getAllergens()
    // public Set<String> getAllergens()
    // Returns the full allergen set
    public Set<String> getAllergens()
    {
      return allergens;
    }

    // TODO: Write isSafe(Recipe recipe)
    // public boolean isSafe(Recipe recipe)
    // Returns true if the recipe contains NO flagged allergens
    // Returns false if ANY ingredient contains ANY flagged allergen
    // Hint: loop through the recipe's ingredients,
    //       then check each ingredient using containsAllergen()
    public boolean isSafe(Recipe recipe)
    {
      for(Ingredient ingredient : recipe.getIngredients())
      {
         for(String allergen : allergens)
         {
            if(ingredient.containsAllergen(allergen))
               return false;
         }
       
      }
      return true;
    }
}