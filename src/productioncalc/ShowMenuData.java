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
 * @author Ella
 */
public class ShowMenuData {
    public static void PrintMenuData() {
     Date date = new Date();
     SimpleDateFormat sdf = new SimpleDateFormat("MM_dd_yyy h_mm_ss_a");
     String filename = sdf.format(date) + " Menu Data.txt";
     try {
        PrintWriter saveTxt = new PrintWriter(new File(filename));
        saveTxt.println("Data for " + Values.itemList.size() + " menu items.");
        saveTxt.println("==========================");
        saveTxt.println();
        for(int i = 0; i < Values.itemList.size(); i++) 
            PrintItemData(i+1, Values.itemList.get(i), saveTxt);
        
        saveTxt.close();
        System.out.println("Output saved to " + filename);
     }
     catch(Exception cantOpen) {
        System.out.println("Can't create file");
         }
    }
    
    public static void PrintItemData(int index, MenuItem current, PrintWriter saver) {
            saver.println("=========================");
        saver.println(current.getName());
        saver.println("Item Code: " + index);
        saver.println("Ingredients:");
        saver.println();
        for(int j = 0; j < current.getNumberOfIngredients(); j++){
            saver.println((j+1) + ". "+ current.getIngredientName(j));
            saver.println("Serving Size: " + current.getIngredientWeight(j));
            saver.println("Package Description: " + current.getIngredientDescription(j));
            saver.println("Package Size: " + current.getIngredientPackageSize(j));
            saver.println();
        }
            
    }
}
