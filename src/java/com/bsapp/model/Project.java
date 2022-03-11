/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bsapp.model;

/**
 *
 * @author BEmerson
 */
public class Project {
    
   private int project_id;
     private int client_id;
    private String project_title;
    private String project_descrip;
    private String project_obj;     

   

    public Project(int project_id, int client_id, String project_title, String project_descrip, String project_obj) {
        this.project_id = project_id;
        this.client_id = client_id;
        this.project_title = project_title;
        this.project_descrip = project_descrip;
        this.project_obj = project_obj;
        
    }
    
    public Project() {
        
    }
        
     
public int getProject_Id() {
        return project_id;
    }

    /**
     * @param email the email to set
     */
    public void setProject_ID(int project_id) {
        this.project_id = project_id;
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
    public String getProject_Title() {
        return project_title;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setProject_Title(String project_title) {
        this.project_title = project_title;
    }

    /**
     * @return the lastName
     */
     public String getProject_Descrip() {
        return project_descrip;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setProject_Descrip(String project_descrip) {
        this.project_descrip = project_descrip;
    }
    
public String getProject_Obj() {
        return project_obj;
    }

    /**
     * @param password the password to set
     */
    public void setProject_Obj(String project_obj) {
        this.project_obj = project_obj;
    }

    /**
     * @return the userType
     */
   
    

}
