
package com.mycompany.restaurante.foods;

import com.mycompany.restaurante.values.DishTypes;
import com.mycompany.restaurante.values.DishVariation;

public class Dish {
   private  DishTypes type;
   private  int stock;
   private  int price;
   private String name;
   private  DishVariation variation;

    public Dish(String name,DishTypes type, int stock, int price, DishVariation variation) {
        this.type = type;
        this.stock = stock;
        this.price = price;
        this.name = name;
        this.variation = variation;
    }

    @Override
    public String toString() {
        return "Dish{" + "type=" + type + ", stock=" + stock + ", price=" + price + ", name=" + name + ", variation=" + variation + '}';
    }

    public DishTypes getType() {
        return type;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DishVariation getVariation() {
        return variation;
    }

    public void setVariation(DishVariation variation) {
        this.variation = variation;
    }

   


   
    
    
    
    
    
    
}
