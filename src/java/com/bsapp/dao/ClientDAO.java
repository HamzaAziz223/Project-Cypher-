/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bsapp.dao;

import com.bsapp.model.Client;
import com.bsapp.utils.DBManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author be_me
 */
public class ClientDAO {
    
    /* Gets number of top products specified */
    /* we are gonna fake this one */
    public ArrayList<Client> getClients(int numClients){
        
        
        DBManager dm = new DBManager();
        Connection con = dm.getConnection();
        int client_id = 0;
        String f_name = null;
        String l_name = null;
        String email = null;
        int number = 0;
        String comp_name = null;

        ArrayList<Client> clientData = new ArrayList();

        String query = "SELECT * FROM CLIENTS";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            int clientCount = 0;
            while (rs.next()) {
                if (clientCount >= numClients)
                    break;
                client_id = (rs.getInt(1));
                f_name = (rs.getString(2));
                l_name = (rs.getString(3));
                email = (rs.getString(4));
                number = (rs.getInt(5));
                comp_name = (rs.getString(6));
                Client client = new Client();
                client.setClient_Id(client_id);
                client.setF_Name(f_name);
                client.setL_Name(l_name);
              client.setEmail(email);
                client.setNumber(number);
                client.setComp_Name(comp_name);
                clientData.add(client);
                clientCount++;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

      
        return clientData;
        
         
        
    }
    
}
