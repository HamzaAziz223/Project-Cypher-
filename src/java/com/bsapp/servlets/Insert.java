/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.bsapp.servlets;

import com.bsapp.manager.RequirementsService;
import com.bsapp.model.Requirements;
import com.bsapp.utils.DBManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author docto
 */
@WebServlet(name = "Insert", urlPatterns = {"/Insert"})
public class Insert extends HttpServlet {

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

        String action = request.getParameter("action");
        RequirementsService tServ = new RequirementsService();
        String url = null;
        System.out.println(action);
        
        if (action == null)
                request.getRequestDispatcher("/index.html").forward(request, response);
        
        if (action.equals("add")){
            request.getRequestDispatcher("/Form.jsp").forward(request, response);
}
        if (action.equals("insertRequirements")){
            insertRequirements(request,response);
            ArrayList<Requirements> requirements = tServ.getAllRequirements();
            request.getSession(true).setAttribute("requirements", requirements);
            request.getRequestDispatcher("/Requirements.jsp").forward(request, response);
}
    }
    /**
     *
     * @param project_name
     * @param client_id
     * @param services
     * @param budget
     * @param client_req
     */
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    private void insertRequirements(HttpServletRequest request, HttpServletResponse response) {
     String project_name = request.getParameter("Project_Name");
//     int client_id = Integer.parseInt(request.getParameter("client_id"));
     String services = request.getParameter("Services");
     String budget = request.getParameter("Budget");
     String client_req = request.getParameter("Client_Req");
     
    Requirements newRequirements = new Requirements();
    newRequirements.setProject_Name(project_name);
//    newRequirements.setClient_Id(client_id);
    newRequirements.setServices(services);
    newRequirements.setBudget(budget);
    newRequirements.setClient_Req(client_req);
    

    RequirementsService tServ = new RequirementsService();
    tServ.insertRequirements(newRequirements);
}
//note to self on how to use Floats, integer and string for inserting data
//      float example = Float.parseFloat(request.getParameter("example"));
//
//      int example = Integer.parseInt(request.getParameter("example"));
//      String example = request.getParameter("example");


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
