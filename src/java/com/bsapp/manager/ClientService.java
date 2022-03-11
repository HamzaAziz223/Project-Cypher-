/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bsapp.manager;


import com.bsapp.dao.ClientDAO;
import com.bsapp.model.Client;
import java.util.ArrayList;


/**
 *
 * @author be_me
 */
public class ClientService {
    
    public ArrayList<Client> getClients(){
        
        ClientDAO pDao = new ClientDAO();
        return pDao.getClients(6);
        
    }
        
    
}