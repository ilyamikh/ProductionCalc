/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package productioncalc;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author BZeal
 */
public class Calculation {
    
    public static List<Servings> foodSpent = new ArrayList<Servings>();
    
    private static void createIngredientList(Meal menu, int servings) {
        if(!foodSpent.isEmpty()) foodSpent.clear();
        
        for(int i = 0; i < menu.getNumberOfComponents(); i++) {
            MenuItem tempItem = menu.getComponent(i);
            for(int j = 0; j < tempItem.getNumberOfIngredients(); j++) {
                Servings tempIngredient = new Servings(tempItem.getIngredientName(j), 
                                                       tempItem.getIngredientWeight(j),
                                                       tempItem.getIngredientDescription(j),
                                                       tempItem.getIngredientPackageSize(j),
                                                       servings);
                foodSpent.add(tempIngredient);
            }
        }
    }
   
    public static void showProduction() {
        if(!foodSpent.isEmpty()) {
        System.out.println("********************");
        System.out.println("All values in G and ML, check package weight of individual items for number of packages");
        System.out.println("--------------------");
        System.out.printf("%-15s %-40s %-11s\t%-11s\t%-5s\n", "NAME", "UNIT DESCRIPTION", "SERVING SIZE", "TOTAL WEIGHT", "UNITS");
        for(int i = 0; i < foodSpent.size(); i++) {
            Servings temp = foodSpent.get(i);
            System.out.printf("%-15s %-40s %-11.2f\t%-11.2f\t%-5.2f\n", temp.getName(), temp.getDescription(), temp.getWeight(), temp.getTotalWeight(), temp.getPackages());
            //System.out.println(temp.getName()+", " + temp.getDescription()+": " + temp.getTotalWeight()+ ", " + temp.getPackages() + " units.");
        }
        System.out.println("********************");
         
      }
      else
            System.out.println("Menu empty.");
    }
    
    public static void calculateProduction(Meal menu, int servings) {
        createIngredientList(menu, servings);
    }
}
