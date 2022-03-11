
package com.bsapp.dao;

import com.bsapp.model.Client;
import com.bsapp.model.Requirements;
import com.bsapp.utils.DBManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
/**
 *
 * @author docto
 */
public class RequirementsDAO {
    
     public ArrayList<Requirements> getRequirementsByproject_name(String project_name){
        
        
        DBManager dm = new DBManager();
        Connection con = dm.getConnection();
        int client_id = 0;
        String services = null;
        String budget = null;
        String client_req = null;
        

        ArrayList<Requirements> requirementsData = new ArrayList();

        String query = "SELECT SERVICES, BUDGET, CLIENT_REQ FROM REQUIREMENTS WHERE PROJECT_NAME= " + "'" + project_name + "' AND CLIENT_ID" + client_id;
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            String project_nameCount = null;
            while (rs.next()) {
                services = (rs.getString(1));
                budget = (rs.getString(2));
                client_req = (rs.getString(3));
               
                Requirements requirements = new Requirements(project_name, client_id, services, budget, client_req);
                
                requirementsData.add(requirements);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

      
        return requirementsData;
        
         
        
    }
     
     public ArrayList<Requirements>  getAllRequirements() {
         DBManager dm = new DBManager();
        Connection con = dm.getConnection();
        String project_name=null;
        int client_id = 0;
        String services = null;
        String budget = null;
        String client_req = null;
        

        ArrayList<Requirements> requirementsData = new ArrayList();

        String query = "SELECT * FROM REQUIREMENTS";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                
                client_id = rs.getInt(1);
                project_name = rs.getString(2);
                services = (rs.getString(3));
                budget = (rs.getString(4));
                client_req = (rs.getString(5));
               
                Requirements requirements = new Requirements(client_id, project_name, services, budget, client_req);
                
                requirementsData.add(requirements);
            }
        } catch (SQLException e) {
            e.printStackTrace();
     }
        return requirementsData;
}
     public void insertRequirements(Requirements newRequirements) {
         DBManager dm = new DBManager();
        Connection con = dm.getConnection();
        Statement stmt = null;
        
        try {
            stmt = con.createStatement();
                    String query = String.format("INSERT INTO REQUIREMENTS(CLIENT_ID, PROJECT_NAME, SERVICES, BUDGET, CLIENT_REQ) VALUES(" + newRequirements.getClient_Id() + ", '" + newRequirements.getProject_Name() + "', '" + newRequirements.getServices() + "', '" + newRequirements.getBudget() + "', '" + newRequirements.getClient_Req() + "')");

//            PreparedStatement st = con.prepareStatement(query);
//            stmt.executeQuery();
                stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
        try {
stmt.close();
con.close();
} catch (Exception e) {
e.printStackTrace();
}
}
        
     }
         
     public void deleteRequirements(String project_name) {
          DBManager dm = new DBManager();
        Connection con = dm.getConnection();
        String query = "DELETE FROM REQUIREMENTS WHERE PROJECT_NAME = " + project_name;
        
        try {
            PreparedStatement st = con.prepareStatement(query);
            st.executeQuery();
        } catch (SQLException e) {
            
        }
     } 
     
     }
     
