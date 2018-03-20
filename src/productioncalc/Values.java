/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package productioncalc;

import java.util.ArrayList;
import java.util.List;

public class Values {
 /**
 *  The master values and calculation for all MenuItems go here
 *  Change the final variables to adjust the values if needed
 */
    //first number is grams/ml per serving, the second is size of pack
    private static final Ingredient APPLE_SAUCE = new Ingredient("apple sauce", 113, "113g packs", 113);
    private static final Ingredient APPLE_SLICE = new Ingredient("apple slice", 50, "approx. 4 slices per apple", 200);
    private static final Ingredient BANANA_HALF = new Ingredient("banana half", 50, "approx. 2 servings per banana", 240);
    private static final Ingredient FRUIT_KEFIR = new Ingredient("fruit kefir", 70, "944ml bottle", 944);
    private static final Ingredient COOKIES = new Ingredient("vanilla wafers", 45, "340 gram box", 340);
    private static final Ingredient FRENCH_TOAST = new Ingredient("french toast", 100, "1.81 kg box", 1810);
    private static final Ingredient SYRUP_ON_TOAST = new Ingredient("syrup", 20, "624g bottle", 624);
    private static final Ingredient KIWI_SLICE = new Ingredient("kiwi slice", 40, "approx. 150g per unit", 150);
    private static final Ingredient BOILED_EGG = new Ingredient("half of egg", 20, "approx 40g eggs", 40);
    private static final Ingredient CRACKERS_SINGLE_TYPE = new Ingredient("crackers, single type", 50, "Savoritz original crackers, 428g box", 428); //check
    private static final Ingredient CEREAL_SINGLE_TYPE = new Ingredient("cereal, single type", 40, "approx. 330g box", 330);//check
    private static final Ingredient CEREAL_MILK_2PERCENT = new Ingredient("milk, 2%", 75, "half-gallon containers (1892ml)", 1892);//check
    //milk vermicelli
    private static final Ingredient VERMICELLI_BREAKFAST = new Ingredient("vermicelli", 40, "500g bags", 500);
    private static final Ingredient MILK_IN_VERMICELLI = new Ingredient("milk", 40, "1 gallon", 3780);
    private static final Ingredient CANNED_PEACHES = new Ingredient("canned peaches", 135, "2.72kg(6lb) cans", 2721.55);//check
    private static final Ingredient CANNED_PINEAPPLES = new Ingredient("canned pineapples", 135, "3.3kg(6lb) cans", 3300);
    //barley
    private static final Ingredient PEARLED_BARLEY = new Ingredient("pearled barley", 33, "1lb bag", 454);
    private static final Ingredient MILK_IN_BARLEY = new Ingredient("milk", 30, "1 gallon", 3780);
    //salad
    private static final Ingredient TOMATO_IN_SALAD = new Ingredient("tomato", 25, "approx. 250 gram per unit", 250);
    private static final Ingredient LETTUCE_IN_SALAD = new Ingredient("lettuce", 25, "510 gram bags", 510);//grams per serving
    private static final Ingredient CUCUMBER_IN_SALAD = new Ingredient("cucumber", 25, "approx. 250 gram per unit", 250);//grams per serving
    private static final Ingredient BELL_PEPPER_IN_SALAD = new Ingredient("bell pepper", 15, "approx. 250 gram per unit", 250);//grams per serving
    private static final Ingredient OIL_IN_SALAD = new Ingredient("oil/dressing", 0.15, "1.06L bottles", 1060);//ml per serving
    //vegetables, single
    private static final Ingredient CUCUMBER_SINGLE = new Ingredient("cucumber", 35, "approx. 250 gram per unit", 250);
    private static final Ingredient PICKLE_SINGLE = new Ingredient("pickle", 40, "approx. 4l bottle", 4000);
    private static final Ingredient LETTUCE_SINGLE = new Ingredient("lettuce", 40, "510 gram bag", 510);
    private static final Ingredient PEPER_SINGLE = new Ingredient("bell pepper", 20, "approx. 250 gram per unit", 250);
    private static final Ingredient BABY_CORN_SINGLE = new Ingredient("baby corn", 35, "1.5 kg can dry weight", 1500);
    private static final Ingredient TOMATO_SINGLE = new Ingredient("tomato", 35, "approx. 250 gram per unit", 250);
    private static final Ingredient CABBAGE_SINGLE = new Ingredient("cabbage", 35, "approx 1kg unit", 1000);
    //hot dogs
    private static final Ingredient HOT_DOG = new Ingredient("hot dog", 56.7, "pack of 8, 434g (1lb)", 434);//weight of one hot dog
    private static final Ingredient HOT_DOG_BUN = new Ingredient("hot dog bun", 39, "pack of 16, 624g(1lb 6oz)", 624);//weight of one bun
    //Buckwheat and Vermicelli Soup
    private static final Ingredient BUCKWHEAT_IN_SOUP = new Ingredient("buckwheat", 30, "700g bags", 700);//grams per serving
    private static final Ingredient VERMICELLI_IN_SOUP = new Ingredient("vermicelli", 30, "500g bags", 500);//grams per serving
    private static final Ingredient PEA_IN_SOUP = new Ingredient("peas", 7, "425g (15oz) can", 425);//grams per serving
    private static final Ingredient POTATO_IN_SOUP = new Ingredient("potatoes", 8, "approx. 500g per unit", 500);//grams per serving
    private static final Ingredient CHICKEN_IN_SOUP = new Ingredient("chicken", 20, "approx. 1kg per unit", 1000);//grams per serving
    private static final Ingredient ONION_IN_SOUP = new Ingredient("onions", 12, "approx. 300 grams per unit", 300);//grams per serving
    private static final Ingredient CARROT_IN_SOUP = new Ingredient("carrots", 12, "approx. 300 grams per unit", 300);//grams per serving
    //Split Pea
    private static final Ingredient PEA_IN_SPLIT_PEA = new Ingredient("peas", 16, "15oz can, 425 gram", 425);
    private static final Ingredient POTATO_IN_SPLIT_PEA = new Ingredient("potatos", 16, "approx. 500g per unit", 500);
    private static final Ingredient ONION_IN_SPLIT_PEA = new Ingredient("onions", 8, "approx. 300g per unit", 300);
    private static final Ingredient CARROT_IN_SPLIT_PEA = new Ingredient("carrots", 16, "approx. 300 grams per unit", 300);
    private static final Ingredient CHICKEN_IN_SPLIT_PEA = new Ingredient("chicken", 12, "approx. 1kg per unit", 1000);
    //borsch
    private static final Ingredient POTATO_IN_BORSCH = new Ingredient("potatoes", 10, "approx. 500g per unit", 500);
    private static final Ingredient BEET_IN_BORSCH = new Ingredient("beets", 12, "approx. 500g per unit", 500);
    private static final Ingredient CABBAGE_IN_BORSCH = new Ingredient("cabbage", 11, "1kg cabbages", 1000);
    private static final Ingredient CARROT_IN_BORSCH =  new Ingredient("carrots", 12, "approx. 300 grams per unit", 300);
    private static final Ingredient ONION_IN_BORSCH = new Ingredient("onions", 8, "approx. 300 grams per unit", 300);
    private static final Ingredient TOMATO_IN_BORSCH = new Ingredient("tomatoes", 13, "approx 250g each", 250);
    private static final Ingredient CHICKEN_IN_BORSCH = new Ingredient("chicken", 12, "approx. 1kg per unit", 1000);
    private static final Ingredient BEANS_IN_BORSCH = new Ingredient("pinto beans", 13, "850g cans", 850);
    //back to misc
    private static final Ingredient CROUTONS = new Ingredient("croutons", 30, "453g (1lb) bags", 453);//grams per serving <--------CHECK
    private static final Ingredient BREAD = new Ingredient("bread", 50, "approx. 453g (1lb) per loaf", 453);//grams per serving <----------CHECK
    private static final Ingredient CHICKEN_NUGGET = new Ingredient("chicken nuggets", 72, "1.7kg bag", 1700);
    private static final Ingredient BABY_CARROT = new Ingredient("baby carrot", 20, "1lb packs, 454gram", 454);
    private static final Ingredient BAGEL = new Ingredient("bagel, half", 47.25, "bags of 6, 567 gram", 567);
    private static final Ingredient CREAM_CHEESE_ON_BAGEL = new Ingredient("cream cheese", 15, "227 gram pack", 227);
    private static final Ingredient CHOCOLATE_ON_BAGEL = new Ingredient("chocolate", 15, "368 gram bottle", 368);
    private static final Ingredient CHEESE_PACK = new Ingredient("american cheese, individual slice", 21.25, "pack of 16, 340 gram", 340);
    private static final Ingredient KETCHUP = new Ingredient("ketchup", 9, "1.25 kg bottle", 1250);
    private static final Ingredient SOUR_CREAM = new Ingredient("sour cream", 9, "454 gram can", 454);//<------- check
    private static final Ingredient MEATBALL = new Ingredient("meatball", 75, "4lb bag, 1.8kg", 1814);
    private static final Ingredient BREADCRUMBS = new Ingredient("crumbs", 5, "unknown", 1);//<------------check
    private static final Ingredient PELMENI = new Ingredient("pelmeni", 80, "1lb bag, 454g", 454);
    private static final Ingredient FRENCH_FRY = new Ingredient ("french fries", 80, "3.62 kg bag", 3620);
    private static final Ingredient BUCKWHEAT = new Ingredient("buckwheat", 80, "700g bags", 700);
    
    //those delightful instant mashed potatoes
    private static final Ingredient MASHED_POTATO = new Ingredient("mashed potatoes", 15, "Chef's Cupboard 369 gram box", 369);
    private static final Ingredient MILK_IN_MASHED_POTATO = new Ingredient("milk", 41, "gallon containers", 3785);
    private static final Ingredient BUTTER_IN_MASHED_POTATO = new Ingredient("butter", 1, "453.6 gram pack", 453.6);
    //vegetable soup
    private static final Ingredient CHICKEN_IN_VEGETABLE_SOUP = new Ingredient("chicken", 3.5, "1/4 pound legs", 116);
    private static final Ingredient CABBAGE_IN_VEGETABLE_SOUP = new Ingredient("cabbage", 11, "cabbages, 1kg", 1000);
    private static final Ingredient CAULIFLOWER_IN_VEGETABLE_SOUP = new Ingredient("cauliflower", 5.5, "cauliflower", 1);
    private static final Ingredient TOMATO_IN_VEGETABLE_SOUP = new Ingredient("tomato", 13, "approx. 250 gram each", 250);
    private static final Ingredient ONION_IN_VEGETABLE_SOUP = new Ingredient("onion", 3, "approx. 250 gram each", 250);
    private static final Ingredient CORN_IN_VEGETABLE_SOUP = new Ingredient("corn", 16.1, "large can of 6lb(3.01kg)", 3010);
    private static final Ingredient PEA_IN_VEGETABLE_SOUP = new Ingredient("peas", 16.1, "large can of 6lb(3.01kg)", 3010);
    //potato soup with cauliflower :/
    private static final Ingredient CHICKEN_IN_POTATO_SOUP = new Ingredient("chicken", 5, "1 pound units", 454);
    private static final Ingredient CABBAGE_IN_POTATO_SOUP = new Ingredient("cabbage", 25, "1 pound units", 454);
    private static final Ingredient CAULIFLOWER_IN_POTATO_SOUP = new Ingredient("cauliflower", 25, "1 pound units", 454);
    private static final Ingredient POTATO_IN_POTATO_SOUP = new Ingredient("potato", 15, "1 pound units", 454);
    //pilaf
    private static final Ingredient RICE_IN_PILAF = new Ingredient("white rice", 100, "800g bag", 800); 
    private static final Ingredient CHICKEN_IN_PILAF = new Ingredient("chicken", 80, "1/4 lb legs, 113g", 113);
    private static final Ingredient ONION_IN_PILAF = new Ingredient("onions", 10, "approx. 250 per unit", 250);
    private static final Ingredient CARROT_IN_PILAF = new Ingredient("carrots", 10, "approx. 250 per unit", 250);
    private static final Ingredient PEPPER_IN_PILAF = new Ingredient("peppers", 7, "approx. 250 per unit", 250);
    private static final Ingredient GARLIC_IN_PILAF = new Ingredient("garlic", 0.25, "apprix. 100 per unit", 100);
    //macaroni and chicken
    private static final Ingredient MACARONI = new Ingredient("elbow macaroni", 100, "Barilla Elbows, 454g(1lb) box", 454); 
    private static final Ingredient CHICKEN_IN_MACARONI = new Ingredient("chicken", 80, "1/4 lb legs, 113g", 113);
    private static final Ingredient ONION_IN_MACARONI = new Ingredient("onions", 10, "approx. 250 per unit", 250);
    private static final Ingredient CARROT_IN_MACARONI = new Ingredient("carrots", 10, "approx. 250 per unit", 250);
    private static final Ingredient PEPPER_IN_MACARONI = new Ingredient("peppers", 7, "approx. 250 per unit", 250);
    private static final Ingredient GARLIC_IN_MACARONI = new Ingredient("garlic", 0.25, "apprix. 100 per unit", 100);
    //fish/chicken cutlets
    private static final Ingredient CHICKEN_IN_CUTLET = new Ingredient("chicken", 80, "1/4lb legs, 113g", 113);
    private static final Ingredient FISH_IN_CUTLET = new Ingredient("fish", 80, "unknown", 1);
    private static final Ingredient ONION_IN_CUTLET = new Ingredient("onion", 5, "approx. 250 gram per unit", 250);
    private static final Ingredient EGG_IN_CUTLET = new Ingredient("eggs", 2, "dozen eggs, approx 57g per egg", 684);
    private static final Ingredient BREAD_IN_CUTLET = new Ingredient("bread", 2, "approx. 1lb loaf (454g)", 454);
    private static final Ingredient OATMEAL_IN_PORRIDGE = new Ingredient("oats", 45, "Oats, 2lb 10oz container (1.19kg)", 1190);
    private static final Ingredient MILK_IN_PORRIDGE = new Ingredient("milk", 45, "Milk, 1 gallon container (3.78L)", 3780);
    
    //drinks
    private static final Ingredient APPLE_JUICE = new Ingredient("apple juice", 80, "1.9 Liter containers", 1900);
    private static final Ingredient TEA_IN_TEA = new Ingredient("tea", 0.6, "100 Teabags box, 226 grams", 226);
    private static final Ingredient LEMON_IN_TEA = new Ingredient("lemons", 3, "approx. 150g lemon", 150);
    private static final Ingredient SUGAR_IN_TEA = new Ingredient("sugar", 1, "by weight", 1);
    private static final Ingredient MILK_AS_DRINK = new Ingredient("milk 2%", 75, "1 gallon containers", 3785);
    private static final Ingredient SUGAR_IN_COMPOTE = new Ingredient("sugar", 1, "by weight", 1);//check
    private static final Ingredient CURRANT_IN_COMPOTE = new Ingredient("currant", 10, "by weight", 1);//check
    private static final Ingredient TURKEY_IN_SANDWICH = new Ingredient("turkey ham", 40, "567g packs", 567);
    private static final Ingredient BREAD_IN_SANDWICH = new Ingredient("bread slice", 40, "454g loaf", 454);
    
    public static List<MenuItem> itemList = new ArrayList<MenuItem>();
    /**
     * MenuItem declarations, initialized with ingredient variables from above inside the method using setIngredient calls
     */
    private static final MenuItem apple_sauce = new MenuItem("Apple Sauce", 1);
    private static final MenuItem apple_slice = new MenuItem("Apple", 1);
    private static final MenuItem kefir = new MenuItem("Kefir", 1);
    private static final MenuItem egg_item = new MenuItem("Boiled Egg", 1);
    private static final MenuItem cookies_item = new MenuItem("Cookies", 1);
    private static final MenuItem banana_half = new MenuItem("Banana", 1);
    private static final MenuItem crackers_single_type = new MenuItem("Crackers, one type", 1);
    private static final MenuItem cereal_single_type = new MenuItem("Cereal with Milk, single type", 2);
    private static final MenuItem canned_peaches = new MenuItem("Canned Peaches", 1);
    private static final MenuItem canned_pineapples = new MenuItem("Canned Pineapples", 1);
    private static final MenuItem vegetable_salad = new MenuItem("Vegetable Salad, Tomato Lettuce Cucumber Bell Pepper", 5);
    private static final MenuItem hot_dog_single = new MenuItem("Hot Dog, no bun", 1);
    private static final MenuItem hot_dog_with_bun = new MenuItem("Hot Dog with Bun", 2);
    private static final MenuItem buckwheat_soup = new MenuItem("Buckwheat Soup", 6);
    private static final MenuItem vermicelli_bullion = new MenuItem("Vermicelli Bullion", 6);
    private static final MenuItem croutons = new MenuItem("Croutons", 1);
    private static final MenuItem bread = new MenuItem("Bread", 1);
    private static final MenuItem chicken_nuggets = new MenuItem("Chicken Nuggets", 1);
    private static final MenuItem mashed_potatoes = new MenuItem("Mashed Potatoes", 3);
    private static final MenuItem baby_carrots = new MenuItem("Baby Carrots", 1);
    private static final MenuItem vegetable_soup = new MenuItem("Vegetable Soup", 7);
    private static final MenuItem apple_juice = new MenuItem("Apple Juice", 1);
    private static final MenuItem pilaf = new MenuItem("Pilaf", 6);
    private static final MenuItem buckwheat_item = new MenuItem("Buckwheat", 1);
    private static final MenuItem macaroni_and_chicken = new MenuItem("Macaroni and Chicken", 6);
    private static final MenuItem macaroni_item = new MenuItem("Macaroni", 1);
    private static final MenuItem fish_cutlet = new MenuItem("Fish Cutlet", 4);
    private static final MenuItem chicken_cutlet = new MenuItem("Chicken Cutlet", 4);
    private static final MenuItem bagel_with_cream_cheese = new MenuItem("Bagel with Cream Cheese", 2);
    private static final MenuItem cheese_sandwich = new MenuItem("Cheese Sandwich", 2);
    private static final MenuItem oatmeal_porridge = new MenuItem("Oatmeal Porridge", 2);
    private static final MenuItem milk_vermicelli = new MenuItem("Milk vermicelli", 2);
    private static final MenuItem tea = new MenuItem("Tea", 3);
    private static final MenuItem bagel_with_chocolate = new MenuItem("Bagel with Chocolate", 2);
    private static final MenuItem borsch = new MenuItem("Borsch", 8);
    private static final MenuItem milk = new MenuItem("Milk", 1);
    private static final MenuItem split_pea_soup = new MenuItem("Split Pea Soup", 5);
    private static final MenuItem potato_and_cauliflower = new MenuItem("Potato and Cauliflower Soup", 4);
    private static final MenuItem cucumber_single = new MenuItem("Cucumber Single",1);
    private static final MenuItem pepper_single = new MenuItem("Pepper, Single", 1);
    private static final MenuItem corn_single = new MenuItem("Baby Corn, single", 1);
    private static final MenuItem tomato_single = new MenuItem("Tomato single", 1);
    private static final MenuItem cabbage_single = new MenuItem("Cabbage single", 1);
    private static final MenuItem ketchup_item = new MenuItem("Ketchup", 1);
    private static final MenuItem sour_cream_item = new MenuItem("Sour Cream", 1);
    private static final MenuItem chicken_meatballs = new MenuItem("Chicken Meatballs", 2);
    private static final MenuItem kiwi = new MenuItem("Kiwi", 1);
    private static final MenuItem pelmeni_item = new MenuItem("Pelmeni", 1);
    private static final MenuItem compote = new MenuItem("Compote", 2);
    private static final MenuItem pickle = new MenuItem("Pickle,", 1);
    private static final MenuItem lettuce = new MenuItem("Lettuce",1);
    private static final MenuItem french_fry_item = new MenuItem("French Fries", 1);
    private static final MenuItem barley_item = new MenuItem("Barley", 2);
    private static final MenuItem french_toast_item = new MenuItem("French Toast", 2);
    private static final MenuItem ham_sandwich = new MenuItem("Ham Sandwich", 2);
    
    public static Meal breakfast = new Meal();
    public static Meal lunch = new Meal();
    public static Meal snack = new Meal();
    
    public static void Initialize() {
        
        System.out.println("Initializing variables...");
        
        apple_sauce.setIngredient(0, APPLE_SAUCE);
        itemList.add(apple_sauce);
        
        apple_slice.setIngredient(0, APPLE_SLICE);
        itemList.add(apple_slice);
        
        banana_half.setIngredient(0, BANANA_HALF);
        itemList.add(banana_half);
        
        kiwi.setIngredient(0, KIWI_SLICE);
        itemList.add(kiwi);
        
        crackers_single_type.setIngredient(0, CRACKERS_SINGLE_TYPE);
        itemList.add(crackers_single_type);
        
        cereal_single_type.setIngredient(0, CEREAL_SINGLE_TYPE);
        cereal_single_type.setIngredient(1, CEREAL_MILK_2PERCENT);
        itemList.add(cereal_single_type);
        
        kefir.setIngredient(0, FRUIT_KEFIR);
        itemList.add(kefir);
        
        cookies_item.setIngredient(0, COOKIES);
        itemList.add(cookies_item);
        
        egg_item.setIngredient(0, BOILED_EGG);
        itemList.add(egg_item);
        
        french_toast_item.setIngredient(0, FRENCH_TOAST);
        french_toast_item.setIngredient(1, SYRUP_ON_TOAST);
        itemList.add(french_toast_item);
        
        milk_vermicelli.setIngredient(0, VERMICELLI_BREAKFAST);
        milk_vermicelli.setIngredient(1, MILK_IN_VERMICELLI);
        itemList.add(milk_vermicelli);
        
        canned_peaches.setIngredient(0, CANNED_PEACHES);
        itemList.add(canned_peaches);
        
        canned_pineapples.setIngredient(0, CANNED_PINEAPPLES);
        itemList.add(canned_pineapples);
        
        vegetable_salad.setIngredient(0, TOMATO_IN_SALAD);
        vegetable_salad.setIngredient(1, LETTUCE_IN_SALAD);
        vegetable_salad.setIngredient(2, CUCUMBER_IN_SALAD);
        vegetable_salad.setIngredient(3, BELL_PEPPER_IN_SALAD);
        vegetable_salad.setIngredient(4, OIL_IN_SALAD);
        itemList.add(vegetable_salad);
        
        lettuce.setIngredient(0, LETTUCE_SINGLE);
        itemList.add(lettuce);
        
        pickle.setIngredient(0, PICKLE_SINGLE);
        itemList.add(pickle);
        
        cucumber_single.setIngredient(0, CUCUMBER_SINGLE);
        itemList.add(cucumber_single);
        
        tomato_single.setIngredient(0, TOMATO_SINGLE);
        itemList.add(tomato_single);
        
        corn_single.setIngredient(0, BABY_CORN_SINGLE);
        itemList.add(corn_single);
        
        pepper_single.setIngredient(0, PEPER_SINGLE);
        itemList.add(pepper_single);
        
        cabbage_single.setIngredient(0, CABBAGE_SINGLE);
        itemList.add(cabbage_single);
        
        hot_dog_single.setIngredient(0, HOT_DOG);
        itemList.add(hot_dog_single);
        
        hot_dog_with_bun.setIngredient(0,HOT_DOG);
        hot_dog_with_bun.setIngredient(1, HOT_DOG_BUN);
        itemList.add(hot_dog_with_bun);
        
        pelmeni_item.setIngredient(0, PELMENI);
        itemList.add(pelmeni_item);
        
        buckwheat_item.setIngredient(0, BUCKWHEAT);
        itemList.add(buckwheat_item);
        
        chicken_meatballs.setIngredient(0, MEATBALL);
        chicken_meatballs.setIngredient(1, BREADCRUMBS);
        itemList.add(chicken_meatballs);
        
        ketchup_item.setIngredient(0, KETCHUP);
        itemList.add(ketchup_item);
        
        sour_cream_item.setIngredient(0, SOUR_CREAM);
        itemList.add(sour_cream_item);
        
        buckwheat_soup.setIngredient(0, BUCKWHEAT_IN_SOUP);
        buckwheat_soup.setIngredient(1, PEA_IN_SOUP);
        buckwheat_soup.setIngredient(2, POTATO_IN_SOUP);
        buckwheat_soup.setIngredient(3, CHICKEN_IN_SOUP);
        buckwheat_soup.setIngredient(4, ONION_IN_SOUP);
        buckwheat_soup.setIngredient(5, CARROT_IN_SOUP);
        itemList.add(buckwheat_soup);
        
        potato_and_cauliflower.setIngredient(0, POTATO_IN_POTATO_SOUP);
        potato_and_cauliflower.setIngredient(1, CAULIFLOWER_IN_POTATO_SOUP);
        potato_and_cauliflower.setIngredient(2, CHICKEN_IN_POTATO_SOUP);
        potato_and_cauliflower.setIngredient(3, CABBAGE_IN_POTATO_SOUP);
        itemList.add(potato_and_cauliflower);
        
        vermicelli_bullion.setIngredient(0, VERMICELLI_IN_SOUP);
        vermicelli_bullion.setIngredient(1, PEA_IN_SOUP);
        vermicelli_bullion.setIngredient(2, POTATO_IN_SOUP);
        vermicelli_bullion.setIngredient(3, CHICKEN_IN_SOUP);
        vermicelli_bullion.setIngredient(4, ONION_IN_SOUP);
        vermicelli_bullion.setIngredient(5, CARROT_IN_SOUP);
        itemList.add(vermicelli_bullion);
        
        croutons.setIngredient(0, CROUTONS);
        itemList.add(croutons);
        
        bread.setIngredient(0, BREAD);
        itemList.add(bread);
        
        chicken_nuggets.setIngredient(0, CHICKEN_NUGGET);
        itemList.add(chicken_nuggets);
        
        mashed_potatoes.setIngredient(0, MASHED_POTATO);
        mashed_potatoes.setIngredient(1, MILK_IN_MASHED_POTATO);
        mashed_potatoes.setIngredient(2, BUTTER_IN_MASHED_POTATO);
        itemList.add(mashed_potatoes);
        
        french_fry_item.setIngredient(0, FRENCH_FRY);
        itemList.add(french_fry_item);
        
        baby_carrots.setIngredient(0, BABY_CARROT);
        itemList.add(baby_carrots);
        
        vegetable_soup.setIngredient(0, CHICKEN_IN_VEGETABLE_SOUP);
        vegetable_soup.setIngredient(1, CABBAGE_IN_VEGETABLE_SOUP);
        vegetable_soup.setIngredient(2, CORN_IN_VEGETABLE_SOUP);
        vegetable_soup.setIngredient(3, PEA_IN_VEGETABLE_SOUP);
        vegetable_soup.setIngredient(4, TOMATO_IN_VEGETABLE_SOUP);
        vegetable_soup.setIngredient(5, ONION_IN_VEGETABLE_SOUP);
        vegetable_soup.setIngredient(6, CAULIFLOWER_IN_VEGETABLE_SOUP);
        itemList.add(vegetable_soup);
        
        split_pea_soup.setIngredient(0, PEA_IN_SPLIT_PEA);
        split_pea_soup.setIngredient(1, CARROT_IN_SPLIT_PEA);
        split_pea_soup.setIngredient(2, ONION_IN_SPLIT_PEA);
        split_pea_soup.setIngredient(3, POTATO_IN_SPLIT_PEA);
        split_pea_soup.setIngredient(4, CHICKEN_IN_SPLIT_PEA);
        itemList.add(split_pea_soup);
        
        borsch.setIngredient(0, POTATO_IN_BORSCH);
        borsch.setIngredient(1, CHICKEN_IN_BORSCH);
        borsch.setIngredient(2, CARROT_IN_BORSCH);
        borsch.setIngredient(3, ONION_IN_BORSCH);
        borsch.setIngredient(4, TOMATO_IN_BORSCH);
        borsch.setIngredient(5, BEANS_IN_BORSCH);
        borsch.setIngredient(6, CABBAGE_IN_BORSCH);
        borsch.setIngredient(7, BEET_IN_BORSCH);
        itemList.add(borsch);
        
        apple_juice.setIngredient(0, APPLE_JUICE);
        itemList.add(apple_juice);
        
        pilaf.setIngredient(0, RICE_IN_PILAF);
        pilaf.setIngredient(1, CHICKEN_IN_PILAF);
        pilaf.setIngredient(2, ONION_IN_PILAF);
        pilaf.setIngredient(3, CARROT_IN_PILAF);
        pilaf.setIngredient(4, GARLIC_IN_PILAF);
        pilaf.setIngredient(5, PEPPER_IN_PILAF);
        itemList.add(pilaf);
        
        macaroni_and_chicken.setIngredient(0, MACARONI);
        macaroni_and_chicken.setIngredient(1, CHICKEN_IN_MACARONI);
        macaroni_and_chicken.setIngredient(2, ONION_IN_MACARONI);
        macaroni_and_chicken.setIngredient(3, CARROT_IN_MACARONI);
        macaroni_and_chicken.setIngredient(4, GARLIC_IN_MACARONI);
        macaroni_and_chicken.setIngredient(5, PEPPER_IN_MACARONI);
        itemList.add(macaroni_and_chicken);
        
        macaroni_item.setIngredient(0, MACARONI);
        itemList.add(macaroni_item);
        
        fish_cutlet.setIngredient(0, FISH_IN_CUTLET);
        fish_cutlet.setIngredient(1, EGG_IN_CUTLET);
        fish_cutlet.setIngredient(2, ONION_IN_CUTLET);
        fish_cutlet.setIngredient(3, BREAD_IN_CUTLET);
        itemList.add(fish_cutlet);
        
        chicken_cutlet.setIngredient(0, CHICKEN_IN_CUTLET);
        chicken_cutlet.setIngredient(1, EGG_IN_CUTLET);
        chicken_cutlet.setIngredient(2, ONION_IN_CUTLET);
        chicken_cutlet.setIngredient(3, BREAD_IN_CUTLET);
        itemList.add(chicken_cutlet);
        
        bagel_with_cream_cheese.setIngredient(0, BAGEL);
        bagel_with_cream_cheese.setIngredient(1, CREAM_CHEESE_ON_BAGEL);
        itemList.add(bagel_with_cream_cheese);
        
        bagel_with_chocolate.setIngredient(0, BAGEL);
        bagel_with_chocolate.setIngredient(1, CHOCOLATE_ON_BAGEL);
        itemList.add(bagel_with_chocolate);
        
        cheese_sandwich.setIngredient(0, BREAD);
        cheese_sandwich.setIngredient(1, CHEESE_PACK);
        itemList.add(cheese_sandwich);
        
        oatmeal_porridge.setIngredient(0, OATMEAL_IN_PORRIDGE);
        oatmeal_porridge.setIngredient(1, MILK_IN_PORRIDGE);
        itemList.add(oatmeal_porridge);
        
        tea.setIngredient(0, TEA_IN_TEA);
        tea.setIngredient(1, LEMON_IN_TEA);
        tea.setIngredient(2, SUGAR_IN_TEA);
        itemList.add(tea);
        
        milk.setIngredient(0, MILK_AS_DRINK);
        itemList.add(milk);
        
        compote.setIngredient(0, CURRANT_IN_COMPOTE);
        compote.setIngredient(1, SUGAR_IN_COMPOTE);
        itemList.add(compote);
        
        barley_item.setIngredient(0, PEARLED_BARLEY);
        barley_item.setIngredient(1, MILK_IN_BARLEY);
        itemList.add(barley_item);
        
        ham_sandwich.setIngredient(0, TURKEY_IN_SANDWICH);
        ham_sandwich.setIngredient(1, BREAD_IN_SANDWICH);
        itemList.add(ham_sandwich);
        
        System.out.println("Done");
       
    }
        
        
}
