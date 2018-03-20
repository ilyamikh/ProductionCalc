/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package productioncalc;

import java.io.File;
import java.io.PrintWriter;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author BZeal
 */
public class SaveData {
    
    public static void saveAll(int servings) {
     Date date = new Date();
     SimpleDateFormat sdf = new SimpleDateFormat("MM_dd_yyy h_mm_ss_a");
     String filename = sdf.format(date) + " Production.txt";
     
     try {
        PrintWriter saveTxt = new PrintWriter(new File(filename));
      
        saveTxt.println("=================");
        saveTxt.println("Current menu: ");
        saveTxt.println("-----------------");
        
        save(saveTxt, Values.breakfast, "Breakfast");
        save(saveTxt, Values.lunch, "Lunch");
        save(saveTxt, Values.snack, "Snack");
        
        saveTxt.println("=================");
        
        saveTxt.println("Estimated production data for " + servings + " servings");
        saveProduction(saveTxt);
        saveTxt.close();
        System.out.println("Output saved to " + filename);
        
        }catch(Exception cantOpen) {
         System.out.println("Can't create file.");
     }
     
    }
    
    public static void save(PrintWriter saver, Meal foodMenu, String type) {
        saver.println(type + ": ");
        String[] componentList = foodMenu.getMenuList();
        for(int i = 0; i < componentList.length; i++) {
            saver.println(componentList[i]);
        }
        saver.println("-----------------");
    }
    
    public static void saveProduction(PrintWriter saver) {
        if(!Calculation.foodSpent.isEmpty()) {
        saver.println("********************");
        saver.println("All values in G and ML, check package weight of individual item for number of packages");
        saver.println("--------------------");
        saver.printf("%-15s %-40s %-11s    %-11s    %-5s", "NAME", "UNIT DESCRIPTION", "SERVING SIZE", "TOTAL WEIGHT", "UNITS");
        saver.println();
        for(int i = 0; i < Calculation.foodSpent.size(); i++) {
            Servings temp = Calculation.foodSpent.get(i);
            
            saver.printf("%-15s %-40s %-11.2f    %-11.2f    %-5.2f", temp.getName(), temp.getDescription(), temp.getWeight(), temp.getTotalWeight(), temp.getPackages());
            saver.println();
            //saver.println(temp.getName()+", " + temp.getDescription()+": " + temp.getTotalWeight()+ ", " + temp.getPackages() + " units.");
        }
        saver.println("********************");
         
      }
      else
            saver.println("Menu empty.");
    }
}
