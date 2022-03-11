/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsapp.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BEmerson
 */
public class DBManager {

    Logger logger = Logger.getLogger(DBManager.class.getName());

    public DBManager() {
        
        try {
            Class.forName("org.postgresql.Driver");
        } catch (Exception ex) {
            logger.log(Level.SEVERE, null, ex);
        }
        
    }
    
   

    public Connection getConnection() {


        Connection dbConnection = null;
        //String strUrl = "jdbc:derby:bills-product-db;create=true";
        //String strUrl = "jdbc:derby://localhost:1527/acme-products;create=true";
        String strUrl = "jdbc:postgresql://localhost:5432/postgres";
        try {
            dbConnection = DriverManager.getConnection(strUrl,"postgres", "Pakistan21");
        } catch (SQLException sqle) {
            logger.log(Level.SEVERE, null, sqle.getStackTrace());
        }

        return dbConnection;

    }

}
