/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package productioncalc;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author BZeal
 */
public class Interface {
    private static int getChoice(int totalChoices) {
        int choice = 0;
        Scanner keyboard = new Scanner(System.in);
        try{
            System.out.print("Enter choice: ");
            choice = keyboard.nextInt();
            if(choice < 1 || choice > totalChoices)
                throw new Exception("Invalid choice");
        }
        catch(InputMismatchException wrongInput) {
            System.out.println("Invalid input, try again.");
            return getChoice(totalChoices);
        }
        catch(Exception wrongNumber) {
            System.out.println("Invalid choice, try again.");
            return getChoice(totalChoices);
        }
        return choice;
        
    }
    
    private static int getNumber() {
        int choice = 0;
        Scanner keyboard = new Scanner(System.in);
        try{
            System.out.print("Enter number: ");
            choice = keyboard.nextInt();
            if(choice < 1)
                throw new Exception("Invalid number");
        }
        catch(InputMismatchException wrongInput) {
            System.out.println("Invalid input, try again.");
            return getNumber();
        }
        catch(Exception wrongNumber) {
            System.out.println("Invalid number, try again.");
            return getNumber();
        }
        return choice;
        
    }
    
    public static void runMenu() {
        
        int selection = 0;
        do{
            showMenu(Values.breakfast, Values.lunch, Values.snack);
            displayMainOptions();
            selection = getChoice(7);
            processMain(selection);
        }while(selection != 7);
    }
    private static void processMain(int selection) {

        switch (selection) {
            case 1:
                showAllItems();                
                Values.breakfast.addComponent(pickMenuItem());
                break;
            case 2:
                showAllItems();                
                Values.lunch.addComponent(pickMenuItem());
                break;
            case 3:
                showAllItems();                
                Values.snack.addComponent(pickMenuItem());
                break;
            case 4:
                System.out.println("-----------------");
                System.out.println("Servings?");
                int servings = getNumber();
                Calculation.calculateProduction(createMenu(), servings);
                System.out.println("Estimated production data for " + servings + " servings.");
                showMenu(Values.breakfast, Values.lunch, Values.snack);
                Calculation.showProduction();
                SaveData.saveAll(servings);
                break;
            case 5:
                Values.breakfast.reset();
                Values.lunch.reset();
                Values.snack.reset();
                System.out.println("All data reset.");
                break;
            case 6:
                ShowMenuData.PrintMenuData();
                break;
            default:
                System.out.println("Done.");
                break;
        }
    }
    
    private static MenuItem pickMenuItem() {
        int selection = getChoice(Values.itemList.size());
        return Values.itemList.get(selection-1);
       
    }
    
    private static Meal createMenu() {
        Meal menu = new Meal();
        if(!Values.breakfast.isEmpty()) {
        for(int i = 0; i < Values.breakfast.getNumberOfComponents(); i++) 
            menu.addComponent(Values.breakfast.getComponent(i));
        }
        
        if(!Values.lunch.isEmpty()) {
        for(int i = 0; i < Values.lunch.getNumberOfComponents(); i++) 
            menu.addComponent(Values.lunch.getComponent(i));
        }
        
        if(!Values.snack.isEmpty()) {
        for(int i = 0; i < Values.snack.getNumberOfComponents(); i++) 
            menu.addComponent(Values.snack.getComponent(i));
        }
        
        return menu;
        
    }
    
    private static void showAllItems() {
        MenuItem temp;
        System.out.println("-----------------");
        System.out.println("All menu items: ");
        for(int i = 0; i < Values.itemList.size(); i++) {
            temp = Values.itemList.get(i);
            System.out.println((i+1) + ": " + temp.getName());
        }
    }
    private static void displayMainOptions() {
        System.out.println("=================");
        System.out.println("1: Add Breakfast Component...");
        System.out.println("2: Add Lunch Component...");
        System.out.println("3: Add Snack Component...");
        System.out.println("4: Calculate Production...");
        System.out.println("5: Reset All");
        System.out.println("6: Print Menu Data");
        System.out.println("7: Exit");
        System.out.println("=================");
    }
    private static void showMenu(Meal Breakfast, Meal Lunch, Meal Snack) {
        System.out.println("=================");
        System.out.println("Current menu: ");
        System.out.println("-----------------");
        show(Breakfast, "Breakfast");
        show(Lunch, "Lunch");
        show(Snack, "Snack");
        System.out.println("=================");
    }
    private static void show(Meal foodMenu, String type) {
        System.out.println(type + ": ");
        String[] componentList = foodMenu.getMenuList();
        for(int i = 0; i < componentList.length; i++) {
            System.out.println(componentList[i]);
        }
        System.out.println("-----------------");
    }
}
