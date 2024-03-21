/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.restaurante;

import com.mycompany.restaurante.foods.Dish;
import com.mycompany.restaurante.foods.Menu;
import com.mycompany.restaurante.people.User;
import com.mycompany.restaurante.values.DishTypes;
import com.mycompany.restaurante.values.DishVariation;
import com.mycompany.restaurante.values.UserTypes;

/**
 *
 * @author SCIS2PC17
 */
public class Restaurante {

    public static void main(String[] args) {
        User student = new User(UserTypes.STUDENT, "Fulanito", "1234");

        Menu menu = new Menu();
        Dish dish1 = new Dish("huevos pericos  ", DishTypes.BREAKFAST, 20, 2400, DishVariation.OPTION1);
        Dish dish2 = new Dish("arepa ", DishTypes.BREAKFAST, 20, 2400, DishVariation.OPTION1);
        Dish dish3 = new Dish("arroz chinese ", DishTypes.LUNCH, 20, 2400, DishVariation.OPTION2);

        menu.addDish(dish1);
        menu.addDish(dish2);
        menu.addDish(dish3);

        menu.showMenu();

    }
}
