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
public class Client {
    
   private long client_id;
    private String f_name;
    private String l_name;
    private String email;
    private int number;
    private String comp_name;
    /**
     * @return the id
     */
    public long getClient_Id() {
        return client_id;
    }

    /**
     * @param id the id to set
     */
    public void setClient_Id(long id) {
        this.client_id = client_id;
    }

    /**
     * @return the name
     */
    public String getF_Name() {
        return f_name;
    }

    /**
     * @param First_Name the name to set
     */
    public void setF_Name(String name) {
        this.f_name = f_name;
    }

    /**
     * @return the Last Name
     */
    public String getL_Name() {
        return l_name;
    }

    /**
     * @param  the description to set
     */
    public void setL_Name(String l_name) {
        this.l_name = l_name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }
     /**
     * @return the comp_name
     */
    public String getComp_Name() {
        return comp_name;
    }

    /**
     * @param comp_name the company name to set
     */
    public void setComp_Name(String comp_name) {
        this.comp_name = comp_name;
    }
    
}
