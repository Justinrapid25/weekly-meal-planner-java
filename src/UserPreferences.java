/*
Phase 5: UserPreferences.java | By: JustinRapid | Start Date: June 9th, 2026 |  Completion date: June 2026
--------------------------------------------------------------------------------------------------------------------------

This program holds a list of cuisine categories the user wants to eat from
Allow categories to be set all at once
Deliver the list of selected categories
*/
import java.util.List;
import java.util.ArrayList;

public class UserPreferences
{
    // TODO: Declare one private field
    // A List<String> called categories
    private List<String> categories;

    // TODO: Write a no-argument constructor
    // Initialize categories as a new empty ArrayList
    public UserPreferences()
    {
      this.categories = new ArrayList<>();
    }

    // TODO: Write setCategories(List<String> categories)
    // public void setCategories(List<String> categories)
    // Assigns the given list to the categories field
    public void setCategories(List<String> categories)
    {
      this.categories = categories;
    }
   
    // TODO: Write getCategories()
    // public List<String> getCategories()
    // Returns the categories list
    public List<String> getCategories()
    {
      return categories;
    }
}
