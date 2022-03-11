/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bsapp.model;

import com.bsapp.dao.RequirementsDAO;
import java.util.ArrayList;

/**
 *
 * @author docto
 */
public class Requirements {
    private String project_name;
     private int client_id;
    private String services;
    private String budget;
    private String client_req;     

   

    public Requirements(int client_id, String project_name, String services, String budget, String client_req) {
        this.project_name = project_name;
        this.client_id = client_id;
        this.services = services;
        this.budget = budget;
        this.client_req = client_req;
        
    }
    
    public Requirements() { 
        RequirementsDAO ReqDAO = new RequirementsDAO();
        client_id = ReqDAO.getAllRequirements().get(ReqDAO.getAllRequirements().size()-1).getClient_Id();
        client_id++;
        
    }
        
     
public String getProject_Name() {
        return project_name;
    }

    /**
     * @param email the email to set
     */
    public void setProject_Name(String project_name) {
        this.project_name = project_name;
    }

    /**
     * @return the id
     */
    

    /**
     * @return the email
     */
    public int getClient_Id() {
        return client_id;
    }

    /**
     * @param id the id to set
     */
    public void setClient_Id(int client_id) {
        this.client_id = client_id;
    }
    /**
     * @return the password
     */
   
    /**
     * @return the firstName
     */
    public String getServices() {
        return services;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setServices(String services) {
        this.services = services;
    }

    /**
     * @return the lastName
     */
     public String getBudget() {
        return budget;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setBudget(String budget) {
        this.budget = budget;
    }
    
public String getClient_Req() {
        return client_req;
    }

    /**
     * @param password the password to set
     */
    public void setClient_Req(String client_req) {
        this.client_req = client_req;
    }

    /**
     * @return the userType
     */
   
    

}
