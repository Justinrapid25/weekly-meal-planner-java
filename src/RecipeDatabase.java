/* Phase 3: RecipeDatabase.java | By: JustinRapid | Start Date: June 9th, 2026 | Completion date: June 2026
--------------------------------------------------------------------------------------------------------------------------
This class will
- Hold a list of all Recipe objects (The hard coded database for now)
- Populate that list with 10 to 20 real recipes when the program starts
- Be able to hand back all recipes when asked
- Be able to filter recipes by category when asked
- Be able to filter out unsafe recipes based on an allery profile
Lists and methods will be static because it's a shared list of recipes the WHOLE program uses.
   This means they belong to the class itself rather than any specific object.
*/
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class RecipeDatabase 
{

    // TODO: Declare one private static field
    // A List<Recipe> called recipes to hold all Recipe objects
   private static List<Recipe> recipes;


    // TODO: Write a static block to initialize the list and populate it
    // This is called a "static initializer block" — it runs once when the
    // class is first loaded.
    static 
    {
      recipes = new ArrayList<>();
      
      // Build ingredient list for all recipes. This is a static block
      Set<String> noAllergens = new HashSet<>(); // This is for ingredients that have no allergens
      
         //----- PROTEINS -----
         Ingredient chicken = new Ingredient("Chicken", noAllergens);
         Ingredient groundBeef = new Ingredient("Ground Beef", noAllergens);
         Ingredient salmon = new Ingredient("Salmon", noAllergens);
         Ingredient groundTurkey = new Ingredient("Ground Turkey", noAllergens);
         Ingredient eggs = new Ingredient("Eggs", noAllergens);
         Ingredient chickenThighs = new Ingredient("Chicken Thighs", noAllergens);
         Ingredient hotDogs = new Ingredient("Hot Dogs", noAllergens);
         Ingredient sausage = new Ingredient("Sausage", noAllergens);
         Ingredient steak = new Ingredient("Steak", noAllergens);
         
         //----- GRAINS & STARCHES -----
         Ingredient rice = new Ingredient("Rice", noAllergens);
         Ingredient homeMadeBread = new Ingredient("Home Made Bread", noAllergens);
         Ingredient riceNoodles = new Ingredient("Rice Noodles", noAllergens);
         Ingredient chickPeaNoodles = new Ingredient("Chickpea Noodles", noAllergens);
         Ingredient homeMadeTortillas = new Ingredient("Home Made Tortillas", noAllergens);
         Ingredient quinoa = new Ingredient("Quinoa", noAllergens);
         Ingredient homeMadeBuns = new Ingredient("Home Made Buns", noAllergens);
         
         //----- SEASONINGS & OILS -----
         Ingredient oliveOil = new Ingredient("Olive Oil", noAllergens);
         Ingredient salt = new Ingredient("Salt", noAllergens);
         Ingredient pepper = new Ingredient("Pepper", noAllergens);
         Ingredient garlicPowder = new Ingredient("Garlic Powder", noAllergens);
         Ingredient avocadoOil = new Ingredient("Avocado Oil", noAllergens);
         Ingredient mincedGarlic = new Ingredient("Minced Garlic", noAllergens);
         Ingredient garlicCloves = new Ingredient("Garlic Cloves", noAllergens);
         Ingredient italianSeasoning = new Ingredient("Italian Seasoning", noAllergens);
         Ingredient butter = new Ingredient("Butter", noAllergens);
         Ingredient cumin = new Ingredient("Cumin", noAllergens);
         Ingredient paprika = new Ingredient("Paprika", noAllergens);
         Ingredient sugar = new Ingredient("Sugar", noAllergens);
         Ingredient brownSugar = new Ingredient("Brown Sugar", noAllergens);
         Ingredient lime = new Ingredient("Lime", noAllergens);
         Ingredient lemon = new Ingredient("Lemon", noAllergens);
         Ingredient redPepperFlakes = new Ingredient("Red Pepper Flakes", noAllergens);
         Ingredient curryPowder = new Ingredient("Curry Powder", noAllergens);
         Ingredient smokedPaprika = new Ingredient("Smoked Paprika", noAllergens);
         Ingredient cilantro = new Ingredient("Cilantro", noAllergens);
         Ingredient oregano = new Ingredient("Oregano", noAllergens);
         Ingredient dill = new Ingredient("Dill", noAllergens);
         Ingredient mint = new Ingredient("Mint", noAllergens);
         Ingredient basil = new Ingredient("Basil", noAllergens);
         Ingredient chiliPowder = new Ingredient("Chili Powder", noAllergens);
         Ingredient coriander = new Ingredient("Ground Coriander", noAllergens);
         Ingredient ginger = new Ingredient("Ginger", noAllergens);
         Ingredient cayennePepper = new Ingredient("Cayenne Pepper", noAllergens);
         
         //----- SAUCES & LIQUIDS -----
         Ingredient chickenBroth = new Ingredient("Chicken Broth", noAllergens);
         Ingredient boneBroth = new Ingredient("Bone Broth", noAllergens);
         Ingredient water = new Ingredient("Water", noAllergens);
         Ingredient coconutAminos = new Ingredient("Coconut Aminos", noAllergens);
         Ingredient mustard = new Ingredient("Mustard", noAllergens);
         Ingredient dijonMustard = new Ingredient("Dijon Mustard", noAllergens);
         Ingredient honey = new Ingredient("Honey", noAllergens);
         Ingredient coconutMilk = new Ingredient("Coconut Milk", noAllergens);
         Ingredient lemonJuice = new Ingredient("Lemon Juice", noAllergens);
         Ingredient bbqSauce = new Ingredient("BBQ Sauce", noAllergens);
         Ingredient vinegar = new Ingredient("Vinegar", noAllergens);
         Ingredient dairyFreeYogurt = new Ingredient("Dairy Free Yogurt", noAllergens);
         Ingredient hummus = new Ingredient("Hummus", noAllergens);
         Ingredient soyFreeTeriyakiSauce = new Ingredient("Soy Free Teriyaki Sauce", noAllergens);
         Ingredient guacamole = new Ingredient("Guacamole", noAllergens);
         Ingredient appleCiderVinegar = new Ingredient("Apple Cider Vinegar", noAllergens);
         Ingredient greenSalsa = new Ingredient("Green Salsa", noAllergens);
         Ingredient hotSauce = new Ingredient("Hot Sauce", noAllergens);
         
         //----- VEGETABLES & FRUIT -----
         Ingredient zucchini = new Ingredient("Zucchini", noAllergens);
         Ingredient celery = new Ingredient("Celery", noAllergens);
         Ingredient squash = new Ingredient("Squash", noAllergens);
         Ingredient cucumber = new Ingredient("Cucumber", noAllergens);
         Ingredient englishCucumber = new Ingredient("English Cucumber", noAllergens);
         Ingredient peas = new Ingredient("Peas", noAllergens);
         Ingredient kale = new Ingredient("Kale", noAllergens);
         Ingredient romaineLettuce = new Ingredient("Romaine Lettuce", noAllergens);
         Ingredient kalamataOlives = new Ingredient("Kalamata Olives", noAllergens);
         Ingredient pineapple = new Ingredient("Pineapple", noAllergens);
         Ingredient bellPeppers = new Ingredient("Bell Peppers", noAllergens);
         Ingredient avocado = new Ingredient("Avocado", noAllergens);
         Ingredient jalapenoPeppers = new Ingredient("Jalapeno Peppers", noAllergens);
         Ingredient mushrooms = new Ingredient("Mushrooms", noAllergens);
         Ingredient snapPeas = new Ingredient("Snap Peas", noAllergens);
         Ingredient mixVeg = new Ingredient("Mixed Vegetables", noAllergens);
         Ingredient greenOnions = new Ingredient("Green Onions", noAllergens);
         
         
         //----- LEGUMES & LENTILS -----
         Ingredient blackBeans = new Ingredient("Black Beans", noAllergens);
         Ingredient kidneyBeans = new Ingredient("Kidney Beans", noAllergens);
         Ingredient lentils = new Ingredient("Lentils", noAllergens);
         Ingredient chickpeas = new Ingredient("Chickpeas", noAllergens);
         
      //----- ALLERGEN-TAGGED INGREDIENTS -----
      Set<String>onionAllergen = new HashSet<>();
         onionAllergen.add("Onions");
         Ingredient onion = new Ingredient("Onions", onionAllergen);
      Set<String>tomatoAllergen = new HashSet<>();
         tomatoAllergen.add("Tomatoes");
         Ingredient tomato = new Ingredient("Tomatoes", tomatoAllergen);
      
      //----- RECIPE NAME (CATEGORY) -----
      
      //creamy cucumber salad
      List<Ingredient> creamyCucumberSaladIngredients = new ArrayList<>(); //set array list for recipes with ingredients
         creamyCucumberSaladIngredients.add(englishCucumber);
         creamyCucumberSaladIngredients.add(dairyFreeYogurt);
         creamyCucumberSaladIngredients.add(appleCiderVinegar);
         creamyCucumberSaladIngredients.add(honey);
         creamyCucumberSaladIngredients.add(celery);
         creamyCucumberSaladIngredients.add(salt);
         creamyCucumberSaladIngredients.add(pepper);
         creamyCucumberSaladIngredients.add(garlicPowder);
         creamyCucumberSaladIngredients.add(dill);
         creamyCucumberSaladIngredients.add(tomato);
      
      List<String> creamyCucumberSaladInstructions = new ArrayList<>(); //set array list for the recipes cooking instructions
         creamyCucumberSaladInstructions.add("Step 1: Slice two cucumbers into very thin rounds.");
         creamyCucumberSaladInstructions.add("Step 2: Salt cucumbers, let them sit for 20min and prep other ingredients.");
         creamyCucumberSaladInstructions.add("Step 3: Make yogurt dressing (sub heavy cream), add honey, garlic powder, salt, pepper.");
         creamyCucumberSaladInstructions.add("Step 4: Dry out cucumbers, add dill and celery to cucumbers. Then add that to dressing bowl.");
         creamyCucumberSaladInstructions.add("Step 5: Add 2 table spoons of apple cider vinegar, toss, and let the salad chill for an hour or so before serving.");
      
      recipes.add(new Recipe("Creamy Cucumber Salad", "American",
         creamyCucumberSaladIngredients, creamyCucumberSaladInstructions, 7));
         
      //stuffed zuc boats
      List<Ingredient> stuffedZucBoatIngredients = new ArrayList<>();
         stuffedZucBoatIngredients.add(zucchini);
         stuffedZucBoatIngredients.add(sausage);
         stuffedZucBoatIngredients.add(groundBeef);
         stuffedZucBoatIngredients.add(garlicCloves);
         stuffedZucBoatIngredients.add(kale);
         stuffedZucBoatIngredients.add(italianSeasoning);
         stuffedZucBoatIngredients.add(salt);
         stuffedZucBoatIngredients.add(pepper);
         stuffedZucBoatIngredients.add(basil);
         stuffedZucBoatIngredients.add(oliveOil);
     
     List<String> stuffedZucBoatInstructions = new ArrayList<>();
        stuffedZucBoatInstructions.add("Step 1: preheat oven to 375F, wash and halve 4 medium zucchinis length wise, scoop insides out.");
        stuffedZucBoatInstructions.add("Step 2: Chop zucchini insides and set to the side for later.");
        stuffedZucBoatInstructions.add("Step 3: Place halves on baking sheet and mist with oil on both sides");
        stuffedZucBoatInstructions.add("Step 4: Ensure open side is up and bake for 6min in oven, then take them out of oven.");
        stuffedZucBoatInstructions.add("Step 5: Prepare sausage filling: cook 1/2lb sausage and 1/2lb ground beef on pan, add chopped zucchini and garlic.");
        stuffedZucBoatInstructions.add("Step 6: Cook meat for about 8-10min or until meat is cooked through.");
        stuffedZucBoatInstructions.add("Step 7: Add 2 handfuls of kale and seasonings, cook until the kale is wilted, stir occasionally.");
        stuffedZucBoatInstructions.add("Step 8: Stir in dairy free cheese if desired.");
        stuffedZucBoatInstructions.add("Step 9: Stuff the zucchini halves with the filling mixture.");
        stuffedZucBoatInstructions.add("Step 10: Add additional dairy free cheese if desired.");
        stuffedZucBoatInstructions.add("Step 11: Bake halves in oven for 12 to 15min, or until the zucchini is tender and cheese is melted");
        stuffedZucBoatInstructions.add("Step 12: Take out of oven, top with basil, and serve.");
     
     recipes.add(new Recipe("Stuffed Zucchini Boats", "Italian",
      stuffedZucBoatIngredients, stuffedZucBoatInstructions, 4));
      
     //Chicken stirfry
     List<Ingredient>chickenStirFryIngredients = new ArrayList<>();
      chickenStirFryIngredients.add(rice);
      chickenStirFryIngredients.add(chicken);
      chickenStirFryIngredients.add(oliveOil);
      chickenStirFryIngredients.add(bellPeppers);
      chickenStirFryIngredients.add(greenOnions);
      chickenStirFryIngredients.add(snapPeas);
      chickenStirFryIngredients.add(coconutAminos);
      chickenStirFryIngredients.add(honey);
      chickenStirFryIngredients.add(ginger);
      chickenStirFryIngredients.add(garlicCloves);
      chickenStirFryIngredients.add(salt);
      chickenStirFryIngredients.add(pepper);
      chickenStirFryIngredients.add(redPepperFlakes);
     
      
     List<String>chickenStirFryInstructions = new ArrayList<>();
      chickenStirFryInstructions.add("Step 1: Grab a large skillet and heat to medium high.");
      chickenStirFryInstructions.add("Step 2: Add 1 tbsp of olive oil and wait for it to shimmer.");
      chickenStirFryInstructions.add("Step 3: While skillet heats, grab chicken and slice.");
      chickenStirFryInstructions.add("Step 4: Add salt and pepper to chicken.");
      chickenStirFryInstructions.add("Step 5: Cook chicken until it's lightly browned on one side.");
      chickenStirFryInstructions.add("Step 6: flip chicken and cook through, then set aside.");
      chickenStirFryInstructions.add("Step 7: Add 1tbsp of olive oil into the skillet");
      chickenStirFryInstructions.add("Step 8: Add in peppers, peas, and green onion - cook till tender");
      chickenStirFryInstructions.add("Step 9: Stir veggies frequently");
      chickenStirFryInstructions.add("Step 10: In a bowl, mix  1/2 cupt of coconut aminos, 1 tbsp honey,2 garlic cloves, ginger"
         + "1/4 tspn red pepper flakes, pepper, and sesame oil subsitute.");
      chickenStirFryInstructions.add("Step 11: Once veggies are crispy, add chicken back into skillet");
      chickenStirFryInstructions.add("Step 12: Pour sauce over chicken and veggies, mix well");
      chickenStirFryInstructions.add("Step 13: Bring sauce to a boil, then reduce heat and simmer");
      chickenStirFryInstructions.add("serve with or without rice");
     
     recipes.add(new Recipe("Chicken Stir Fry", "Asian", chickenStirFryIngredients,
      chickenStirFryInstructions, 4));
      
     //Crockpot chicken
     List<Ingredient> chickenTacoIngredients = new ArrayList<>();
      chickenTacoIngredients.add(chicken);
      chickenTacoIngredients.add(water);
      chickenTacoIngredients.add(chiliPowder);
      chickenTacoIngredients.add(garlicPowder);
      chickenTacoIngredients.add(coriander);
      chickenTacoIngredients.add(salt);
      chickenTacoIngredients.add(cayennePepper);
      chickenTacoIngredients.add(pepper);
      chickenTacoIngredients.add(rice);
      chickenTacoIngredients.add(blackBeans);
      chickenTacoIngredients.add(cilantro);
      chickenTacoIngredients.add(jalapenoPeppers);
      chickenTacoIngredients.add(hotSauce);
      chickenTacoIngredients.add(greenSalsa);
      chickenTacoIngredients.add(bellPeppers);
      chickenTacoIngredients.add(dairyFreeYogurt);
      chickenTacoIngredients.add(guacamole);
      
      
     List<String> chickenTacoInstructions = new ArrayList<>();
      chickenTacoInstructions.add("Step 1: Place 2lbs of chicken, 1 cup of salsa, water, and spiced in slow cooker.");
      chickenTacoInstructions.add("Step 2: Cook on high for 4-5 hours.");
      chickenTacoInstructions.add("Step 3: Remove chicken and shred.");
      chickenTacoInstructions.add("Step 4: Return chicken to slow cooker for 30 more minutes.");
      chickenTacoInstructions.add("Step 5: Prepare toppings");
      chickenTacoInstructions.add("Step 6: Serve.");
      
     recipes.add(new Recipe("Slow Cooker Chicken Tacos", "Mexican", chickenTacoIngredients,
      chickenTacoInstructions, 8));
     
     //Teriyaki chicken pineapple kebabs
     List<Ingredient> teriyakiChickenIngredients = new ArrayList<>();
      teriyakiChickenIngredients.add(chicken);
      teriyakiChickenIngredients.add(pineapple);
      teriyakiChickenIngredients.add(bellPeppers);
      teriyakiChickenIngredients.add(zucchini);
      teriyakiChickenIngredients.add(avocadoOil);
      teriyakiChickenIngredients.add(pepper);
      teriyakiChickenIngredients.add(coconutAminos);
      teriyakiChickenIngredients.add(soyFreeTeriyakiSauce);
      teriyakiChickenIngredients.add(salt);
      
      
     List<String> teriyakiChickenInstructions = new ArrayList<>();
      teriyakiChickenInstructions.add("Step 1: Add 1/2 cup of soy free sauce to a bowl.");
      teriyakiChickenInstructions.add("Step 2: Add 2 tbsp coconut aminos and 1 tbspn of oil to bowl.");
      teriyakiChickenInstructions.add("Step 3: Cut 1 1/4lbs chicken into cubes, add into bowl and marinate.");
      teriyakiChickenInstructions.add("Step 4: Cut pineapple and veggies, toss with oil.");
      teriyakiChickenInstructions.add("Step 5: Get grill to about 450.");
      teriyakiChickenInstructions.add("Step 6: Prepare skewers - chicken, pineapple, zucchini.");
      teriyakiChickenInstructions.add("Step 7: Prepare a 1/4 cup of sauce for serving.");
      teriyakiChickenInstructions.add("Step 8: use the remaining sauce to brush kebabs.");
      teriyakiChickenInstructions.add("Step 9: Grill for 8min one side, flip, and cook for 5-7min.");
      teriyakiChickenInstructions.add("Step 10: Leave on grill until fully cooked.");
      teriyakiChickenInstructions.add("Step 11: Serve.");
      
     recipes.add(new Recipe("Teriyaki Chicken Kebabs", "Asian", teriyakiChickenIngredients,
      teriyakiChickenInstructions, 4));
      
     //Mediterranean Steak Bowl
     List<Ingredient> steakBowlIngredients = new ArrayList<>();
      steakBowlIngredients.add(steak);
      steakBowlIngredients.add(greenOnions);
      steakBowlIngredients.add(zucchini);
      steakBowlIngredients.add(kale);
      steakBowlIngredients.add(romaineLettuce);
      steakBowlIngredients.add(kalamataOlives);
      steakBowlIngredients.add(cucumber);
      steakBowlIngredients.add(oliveOil);
      steakBowlIngredients.add(lemonJuice);
      steakBowlIngredients.add(oregano);
      steakBowlIngredients.add(salt);
      steakBowlIngredients.add(dill);
      steakBowlIngredients.add(dairyFreeYogurt);
      steakBowlIngredients.add(hummus);
      steakBowlIngredients.add(mint);
      
      
     List<String> steakBowlInstructions = new ArrayList<>();
      steakBowlInstructions.add("Step 1: Combine 1 cup yogurt, 1 tbsp of oil, juice of 1/2 lemon"
         + "1 large garlic clove, 1/2 tsp oregano, 1/2 tspn of dill, 1/2 tspn salt, 2 tsp mint"
         + " chopped into a bowl and whisk.");
      steakBowlInstructions.add("Step 2: Place bowl in fridge to cool.");
      steakBowlInstructions.add("Step 3: Preheat grill to 450.");
      steakBowlInstructions.add("Step 4: Pat dry 1lb flank steak, add salt to both sides.");
      steakBowlInstructions.add("Step 5: Thread steak and zucchini on skewers.");
      steakBowlInstructions.add("Step 6: Add to grill and cook until steak is done.");
      steakBowlInstructions.add("Step 7: Add oil to steak and let it rest for 10min.");
      steakBowlInstructions.add("Step 8: Chop romaine and kale, add to serving bowls.");
      steakBowlInstructions.add("Step 9: Add skewers to bowls.");
      steakBowlInstructions.add("Step 10: Top with hummus, chopped cucumbers, and olives.");
      steakBowlInstructions.add("Step 11: Drizzle yogurt dressing, garnish with lemon wedges and mint.");
      steakBowlInstructions.add("Step 12: Serve.");
      
     recipes.add(new Recipe("Mediterranean Steak Bowl", "Mediterranean", steakBowlIngredients,
      steakBowlInstructions, 4));
     
     //Salmon Kebabs
     List<Ingredient> salmonKebabIngredients = new ArrayList<>();
      salmonKebabIngredients.add(lemon);
      salmonKebabIngredients.add(lemonJuice);
      salmonKebabIngredients.add(honey);
      salmonKebabIngredients.add(avocadoOil);
      salmonKebabIngredients.add(salt);
      salmonKebabIngredients.add(pepper);
      salmonKebabIngredients.add(salmon);
      salmonKebabIngredients.add(dairyFreeYogurt);
      salmonKebabIngredients.add(cilantro);
      salmonKebabIngredients.add(curryPowder);
      salmonKebabIngredients.add(paprika);
      salmonKebabIngredients.add(onion);
     
     List<String> salmonKebabInstructions = new ArrayList<>();
      salmonKebabInstructions.add("Step 1: Combine 2 tbsp lemon juice, 1/2 cup yogurt, 2 tbsp cilantro "
         + ", 1/2 tsp curry powder, 1/4 tsp of salt, pinch of paprika, and lemon zest into a bowl and mix.");
      salmonKebabInstructions.add("Step 2: Pat dry 3-4 salmon fillets.");
      salmonKebabInstructions.add("Step 3: Cut salmon into 5-6 equal sized pieces.");
      salmonKebabInstructions.add("Step 4: In another bowl, combine lemon juice, lemon zest, oil, honey,"
         + " garlic powder, salt, and pepper, mix together.");
      salmonKebabInstructions.add("Step 5: Preheat grill to 400.");
      salmonKebabInstructions.add("Step 6: Toss salmon with lemon juice sauce, marinate in fridge for 15min.");
      salmonKebabInstructions.add("Step 7: Thread salmon slices and lemon slices onto skewers.");
      salmonKebabInstructions.add("Step 8: Cook kebabs until salmon flakes easily.");
      salmonKebabInstructions.add("Step 9: Drizzle each kabab with yogurt sauce.");
      salmonKebabInstructions.add("Step 10: Serve.");
      
     recipes.add(new Recipe("Salmon Kebabs with Cream Curry Yogurt Sauce", "Seafood",
      salmonKebabIngredients, salmonKebabInstructions, 4));
     //Turkey Burgers
     List<Ingredient> turkeyBurgIngredients = new ArrayList<>();
      turkeyBurgIngredients.add(groundTurkey);
      turkeyBurgIngredients.add(oliveOil);
      turkeyBurgIngredients.add(kale);
      turkeyBurgIngredients.add(garlicCloves);
      turkeyBurgIngredients.add(italianSeasoning);
      turkeyBurgIngredients.add(salt);
      turkeyBurgIngredients.add(pepper);
      turkeyBurgIngredients.add(redPepperFlakes);
      turkeyBurgIngredients.add(cucumber);
      turkeyBurgIngredients.add(dairyFreeYogurt);
      turkeyBurgIngredients.add(lemonJuice);
      turkeyBurgIngredients.add(dill);
     
      
     List<String> turkeyBurgInstructions = new ArrayList<>();
      turkeyBurgInstructions.add("Step 1: Preheat grill to 425 or medium high on stove.");
      turkeyBurgInstructions.add("Step 2: Add oil, once hot, add chopped kale and 3minced garlic cloves.");
      turkeyBurgInstructions.add("Step 3: In a bowl add the following: 1/2tsp salt, 1/4tsp pepper,"
         + "1/4tsp crushed red pepper, 1lb ground turkey, dairy free feta cheese, mix well.");
      turkeyBurgInstructions.add("Step 4: Make patties (about 4-5), from contents in bowl.");
      turkeyBurgInstructions.add("Step 5: Tzatziki sauce: 1/2 cup grated cucumber,"
         + " 1/2 cup dairy free yogurt, 2 cloves of garlic, 1 1/2tbsp of lemon juice,"
         + " 1tbsp of olive oil, 1tbsp of dill, salt, and pepper in a bowl.");
      turkeyBurgInstructions.add("Step 6: Cook patties 160 internal temp.");
      turkeyBurgInstructions.add("Step 7: Serve on buns/lettuce wraps, top patties with sauce.");
      
      recipes.add(new Recipe("Feta Kale Turkey Burgers", "Mediterranean", turkeyBurgIngredients,
         turkeyBurgInstructions, 4));
         
      //Stuffed peppers
      List<Ingredient> stuffPepperIngredients = new ArrayList<>();
         stuffPepperIngredients.add(bellPeppers);
         stuffPepperIngredients.add(quinoa);
         stuffPepperIngredients.add(chickenBroth);
         stuffPepperIngredients.add(oliveOil);
         stuffPepperIngredients.add(garlicCloves);
         stuffPepperIngredients.add(blackBeans);
         stuffPepperIngredients.add(cumin);
         stuffPepperIngredients.add(chiliPowder);
         stuffPepperIngredients.add(paprika);
         stuffPepperIngredients.add(salt);
         stuffPepperIngredients.add(pepper);
         stuffPepperIngredients.add(greenSalsa);
         stuffPepperIngredients.add(cilantro);
         stuffPepperIngredients.add(lime);
         
      
      List<String> stuffPepperInstructions = new ArrayList<>();
         stuffPepperInstructions.add("Step 1: Preheat oven to 375.");
         stuffPepperInstructions.add("Step 2: cut and gut 6 large peppers.");
         stuffPepperInstructions.add("Step 3: Cook quinoa.");
         stuffPepperInstructions.add("Step 4: Saute garlic cloves and green onions until soft.");
         stuffPepperInstructions.add("Step 5: Add black beans, cumin, chili powder, paprika, "
            + "salt, and pepper to the pan.");
         stuffPepperInstructions.add("Step 6: Add cooked quinoa and green salsa to pan. Mix together.");
         stuffPepperInstructions.add("Step 7: Once cooked through, add filling to peppers.");
         stuffPepperInstructions.add("Step 8: Bake peppers in oven for 30min or until peppers are soft.");
         stuffPepperInstructions.add("Step 9: Top with dairy free cheese and serve.");
         
      recipes.add(new Recipe("Stuffed Peppers", "Mexican", stuffPepperIngredients, 
         stuffPepperInstructions, 5));
         
      List<Ingredient> bbqChickenIngredients = new ArrayList<>();
         bbqChickenIngredients.add(chickenThighs);
         bbqChickenIngredients.add(rice);
         bbqChickenIngredients.add(celery);
         bbqChickenIngredients.add(bbqSauce);
         bbqChickenIngredients.add(oliveOil);
         bbqChickenIngredients.add(salt);
         bbqChickenIngredients.add(pepper);
         bbqChickenIngredients.add(chickenBroth);
         bbqChickenIngredients.add(garlicPowder);
         bbqChickenIngredients.add(onion);
         
      List<String> bbqChickenInstructions = new ArrayList<>();
         bbqChickenInstructions.add("Step 1:Preheat grill to 375.");
         bbqChickenInstructions.add("Step 2: Brush chicken with olive oil, season both sides with salt and pepper.");
         bbqChickenInstructions.add("Step 3: Grill chicken (internal temp 165).");
         bbqChickenInstructions.add("Step 4: During last 2min of grilling, brush chicken with bbq sauce, both sides.");
         bbqChickenInstructions.add("Step 5: Cook rice while chicken finishes.");
         bbqChickenInstructions.add("Step 6: Cook celery with oil in pan util soft.");
         bbqChickenInstructions.add("Step 7: Stir in rice with chicken broth, garlic powder, and salt into pan.");
         bbqChickenInstructions.add("Step 8: Cook for 45min, resist stirring often. Cover pan.");
         bbqChickenInstructions.add("Step 9: Serve.");
         
      recipes.add(new Recipe("BBQ Chicken and Rice", "BBQ", bbqChickenIngredients, bbqChickenInstructions,
         4));
      }         


    // TODO: Write getAllRecipes()
    public static List<Recipe> getAllRecipes()
    {
      return recipes;
    }
    
    // public static List<Recipe> getAllRecipes()
    public static List<Recipe> getByCategory(String category)
    {
      List<Recipe> recipeMatch = new ArrayList<>();
      
      for(Recipe recipe : recipes) //looks for categories in the recipe and places them in the recipeMatch bucket
      {
         if(recipe.getCategory().equals(category))
            recipeMatch.add(recipe);
      }
      //returns full recipe list
      return recipeMatch;
      
    }
    
    public static List<Recipe> filterSafe(AllergyProfile profile)
    {
      List<Recipe> allergenMatch = new ArrayList<>();
      
      for(Recipe recipe : recipes)
      {
         if(profile.isSafe(recipe))
            allergenMatch.add(recipe);
      }
      
     return allergenMatch;
    }

}
