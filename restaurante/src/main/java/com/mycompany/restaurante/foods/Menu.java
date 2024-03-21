
package com.mycompany.restaurante.foods;

import com.mycompany.restaurante.values.DishTypes;
import java.util.ArrayList;


public class Menu {
    private ArrayList<Dish> dishList;
    
    public Menu(){
    this.dishList = new ArrayList<>();
    
    
    }
    public void addDish(Dish dish){
        this.dishList.add(dish);
    
    }
    
    public void showMenu(){
        System.out.println("menu");
        for (DishTypes dishType : DishTypes.values()) {
            
            System.out.println("---" + dishType + "---");
            
         
     
    for(Dish dish : dishList){
        if(dish.getType() == dishType){
        System.out.println(dish.getName());
        }
        
    }}
        
        
    }
    
}
