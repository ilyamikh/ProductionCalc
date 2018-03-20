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
public class MenuItem {
    
    private final String name;
    private final int numberOfIngredients;
    private final Ingredient[] ingredientList;
    
    public MenuItem(String inName, int num) {
        name = inName;
        numberOfIngredients = num;
        ingredientList = new Ingredient[num];
        for(int i = 0; i < numberOfIngredients; i++)
            ingredientList[i] = new Ingredient();
    }
    
    
    public void setIngredient(int index, String name, double servingWeight) {
        ingredientList[index].setIngredient(name, servingWeight);
    }
    
    public void setIngredient(int index, Ingredient newIngredient) {
        ingredientList[index] = newIngredient;
    }
    
    public String getName() {
        return name;
    }
    
    public int getNumberOfIngredients() {
        return numberOfIngredients;
    }
    public String getIngredientName(int index) {
        return ingredientList[index].getName();
    }
    
    public double getIngredientWeight(int index) {
        return ingredientList[index].getWeight();
    }
    
    public String getIngredientDescription(int index) {
        return ingredientList[index].getDescription();
    }
    
    public double getIngredientPackageSize(int index) {
        return ingredientList[index].getPackageSize();
    }
       
}
