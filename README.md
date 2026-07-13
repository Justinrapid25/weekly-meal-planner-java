# Weekly Meal Planner

A command-line Java application that generates a personalized seven-day dinner plan based on user-selected cuisine categories and a custom food-allergy profile. The program filters its recipe database to exclude any recipe containing a flagged allergen, matches the remaining recipes to the user's chosen cuisines, and assembles a randomized weekly plan. Users can view full recipe details for any day and swap out individual days without regenerating the entire week.

Built as an object-oriented application across eight classes, with business logic fully separated from the user interface to support a future graphical interface.

---

## Features

- **Cuisine category selection** across nine categories (American, Italian, Mexican, Asian, Mediterranean, BBQ, Soul Food, Middle Eastern, Seafood)
- **Allergy profile management** supporting sixteen allergens
- **Allergy-aware filtering** that excludes any recipe containing a flagged allergen before suggestions are made
- **Randomized weekly plan generation** producing a unique seven-day plan
- **Full recipe display** including ingredients and step-by-step instructions
- **Single-day replacement** to swap one day's meal without regenerating the whole week
- **Full week regeneration** on demand
- **Case-insensitive input** for both categories and allergens
- **Graceful error handling** for invalid input and empty results

---

## How It Works

The user selects one or more cuisine categories and optionally builds an allergy profile. When generating a plan, the program:

1. Retrieves all recipes from the database
2. Filters out any recipe containing a flagged allergen
3. Keeps only recipes matching the selected categories
4. Shuffles the results and selects up to seven unique meals
5. Displays the weekly plan

From there the user can view the full recipe for any day, replace an individual day, or regenerate the entire week.

---

## Architecture

The application is divided into eight classes, each with a single, well-defined responsibility. The user interface class is the only class that handles input and output. All other classes are pure logic and data, which keeps the business logic independent of the interface and allows a future GUI to plug in without rewriting the core.

### The Eight Classes

| Class | Responsibility |
|---|---|
| `Ingredient` | Represents a single ingredient and the allergens it contains |
| `Recipe` | Represents a full recipe: name, category, ingredients, instructions, servings |
| `RecipeDatabase` | Holds all recipes in a static list; filters by category and by safety |
| `AllergyProfile` | Stores the user's allergens and checks whether a recipe is safe |
| `UserPreferences` | Stores the user's selected cuisine categories |
| `MealPlanner` | Core logic: generates the weekly plan and replaces individual days |
| `WeeklyMealPlan` | Stores the seven selected recipes and handles display |
| `MainMealPlanner` | Entry point; runs the CLI menu and coordinates all other classes |

### How the Classes Communicate

A helpful way to understand the design is to picture a restaurant. The user interface is the waiter taking the order, the recipe database is the recipe book, the allergy profile is the customer's allergy card, and the meal planner is the chef who assembles the week.

```
MainMealPlanner (the waiter / entry point)
   |-- collects input into UserPreferences and AllergyProfile
   |-- calls MealPlanner to build the plan
   |-- displays the result via WeeklyMealPlan

MealPlanner (the chef / coordinator)
   |-- queries RecipeDatabase for recipes
   |-- filters with AllergyProfile
   |-- reads UserPreferences for categories
   |-- produces a WeeklyMealPlan

RecipeDatabase --> holds List<Recipe>
Recipe --> holds List<Ingredient> and List<String> instructions
Ingredient --> holds Set<String> allergens
```

---

## Getting Started

Compile and run with the JDK:

```
javac *.java
java MainMealPlanner
```

---

## About

The allergy-aware filtering logic reflects a background in cybersecurity, where safety-first design and careful input handling are second nature.

**Author:** JustinRapid
