
package com.mycompany.restaurante.foods;

import com.mycompany.restaurante.values.DishTypes;
import com.mycompany.restaurante.values.DishVariation;

public class Dish {
    DishTypes type;
    int stock;
    int price;
    String name;
    DishVariation variation;

    public Dish(DishTypes type, int stock, int price, String name, DishVariation variation) {
        this.type = type;
        this.stock = stock;
        this.price = price;
        this.name = name;
        this.variation = variation;
    }
    
    
    
}
