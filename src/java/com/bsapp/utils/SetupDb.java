/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsapp.utils;

import com.bsapp.model.Project;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BEmerson
 */
public class SetupDb {

   
DBManager dmbgr = new DBManager();

        Connection con = dmbgr.getConnection();
        public List<Project> getData() {
            Statement stmt;

        
List<Project> projectList = new ArrayList<Project>();

        try {
            stmt = con.createStatement();
            ResultSet results = stmt.executeQuery("select * from PROJECT");
            /*
            1. Looping through all the rows within the results set
            2. Creating project instance with all the values from each row
            3. Adding all project instances to an empty list of projects
            4. Returning filled list of projects
            */     
            System.out.println(results);
                        while (results.next()) {
                
                Project newProject = new Project(results.getInt(1),results.getInt(2), results.getString(3), results.getString(4), results.getString(5));
               projectList.add(newProject);
             } 
                        return projectList;
            } catch (SQLException sqlExcept) {
            System.out.println(sqlExcept);
        }
        
        return null;
        }
}

