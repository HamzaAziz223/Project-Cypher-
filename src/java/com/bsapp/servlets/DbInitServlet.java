/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsapp.servlets;

import com.bsapp.manager.RequirementsService;
import com.bsapp.model.Project;
import com.bsapp.model.Requirements;
import com.bsapp.utils.SetupDb;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hamza
 */
public class DbInitServlet extends HttpServlet {
 @Override
    public void init()
            
            throws ServletException {
          SetupDb sdb = new SetupDb();
        List<Project> projectList = sdb.getData();
         getServletContext().setAttribute("Projects", projectList);
         System.out.println();
        //DBManager mngr = new DBManager();
        //mngr.checkConnection();
        
        

       
        
//        sdb.createTables();
//        sdb.insertSetupData();; //To change body of generated methods, choose Tools | Templates.
//        sdb.showData();
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         SetupDb sdb = new SetupDb();
        List<Project> projectList = sdb.getData();
        RequirementsService tServ = new RequirementsService();
        ArrayList<Requirements> requirements = tServ.getAllRequirements();
            request.getSession(true).setAttribute("requirements", requirements);
         request.getSession(true).setAttribute("Projects", projectList);
         System.out.println();
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
