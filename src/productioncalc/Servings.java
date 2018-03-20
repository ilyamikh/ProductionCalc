/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package productioncalc;

/**
 *
 * @author BZeal
 */
public class Servings extends Ingredient {
    private int numberServed;
    
    Servings(String newName, double newWeight, String newDescription, double newPackageSize, int servings) {
        super(newName, newWeight, newDescription, newPackageSize);
        numberServed = servings;
        
    }
    
    Servings(String newName, double newWeight, int servings) {
        super(newName, newWeight);
        numberServed = servings;
        
    }
    
    public int getServings() {
        return numberServed;
    }
    
    public double getTotalWeight() {
        return super.getWeight() * getServings();
    }
    
    public double getPackages() {
        return getTotalWeight() / super.getPackageSize();
    }
    
}
