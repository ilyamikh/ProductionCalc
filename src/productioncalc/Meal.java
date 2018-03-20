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
public class Meal {
    private List<MenuItem> components = new ArrayList<MenuItem>();
    
    public void addComponent(MenuItem newComponent) {
        components.add(newComponent);
    }
    
    public boolean isEmpty() {
        return components.isEmpty();
    }
    
    public int getNumberOfComponents() {
        return components.size();
    }
    public void reset() {
        components.clear();
    }
    public String getComponentName(int index) {
        MenuItem temp = components.get(index);
        return temp.getName();
    }
    public MenuItem getComponent(int index) {
        return components.get(index);
    }
    public String[] getMenuList() {
        String[] menu;
        switch(getNumberOfComponents()) {
            case 0:
                menu = new String[1];
                menu[0] = "<empty>";
                return menu;
            default:
                menu = new String[getNumberOfComponents()];
                for(int i = 0; i < getNumberOfComponents(); i++)
                    menu[i] = getComponentName(i);
                return menu;
        }

    }
}
