/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author nhattruong
 */
public class DatabaseManagement {

    public boolean checkUser(String username, String password) {
        if (username.equalsIgnoreCase("nhattruong") && password.equalsIgnoreCase("123456")) {
            return true;
        } else {
            return false;
        }
    }
}
