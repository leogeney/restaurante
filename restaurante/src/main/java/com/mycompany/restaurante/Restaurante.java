/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restaurante;

import com.mycompany.restaurante.people.User;
import values.UserTypes;

/**
 *
 * @author SCIS2PC17
 */
public class Restaurante {

    public static void main(String[] args) {
        User student = new User(UserTypes.STUDENT,"Fulanito","1234");
        student.sell();
    }
}
