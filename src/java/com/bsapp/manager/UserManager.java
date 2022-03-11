/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bsapp.manager;

import com.bsapp.dao.UserDAO;
import com.bsapp.model.User;
/**
 *
 * @author docto
 */
public class UserManager {
    
    /** This will take a username and select from user table
     * This will return three possible statuses, login correct, 
     * unknown user or password incorrect
     * @param inUser 
     */
    public User loginUser(String email, String passWord){
        
        UserDAO userDAO = new UserDAO();
        User user = userDAO.getUserByEmail(email);
        if (user.getPassword().equals(passWord)){
            return user;
        }
        else return null;
    }
    
}
