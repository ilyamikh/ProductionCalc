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
public class Ingredient {
    private String name;
    private double weight;
    private String description;
    private double packageSize;
    
    public Ingredient() {
        name = "none";
        weight = 0;
        description = "none";
        packageSize = 0;
    }
    
    public Ingredient(String inName, double inWeight) {
        name = inName;
        weight = inWeight;
        description = "none";
        packageSize = 0;
    }
    
    public Ingredient(String inName, double inWeight, String inDescription, double inPackageSize) {
        name = inName;
        weight = inWeight;
        description = inDescription;
        packageSize = inPackageSize;
    }
    
    public void setIngredient(String inName, double inWeight, String inDescription, double inPackageSize) {
        name = inName;
        weight = inWeight;
        description = inDescription;
        packageSize = inPackageSize;
    }
    
    public void setIngredient(String inName, double inWeight) {
        name = inName;
        weight = inWeight;
        description = "none";
        packageSize = 0;
    }
    
    public String getName() {
        return name;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public String getDescription() {
        return description;
    }
    
    public double getPackageSize() {
        return packageSize;
    }
        
}
