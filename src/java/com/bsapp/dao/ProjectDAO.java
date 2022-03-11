package com.bsapp.dao;


import com.bsapp.model.Project;
import com.bsapp.utils.IConstants;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import com.bsapp.manager.ProjectService;
import com.bsapp.utils.DBManager;

/**
 *
 * @author bemerson
 */
public class ProjectDAO {
    
    public Project getProjectByproject_id(int project_id) {

        DBManager dmbgr = new DBManager();
        Connection con = dmbgr.getConnection();
        /** */
        int client_id  = 0;
        String project_title = null;
        String project_descrip = null;
        String project_obj = null;
        Project tempProject = new Project();

        String query = "SELECT * FROM PROJECTS WHERE PROJECT_ID=" + "'" + client_id + "'";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                project_id = (rs.getInt(1));
                client_id = (rs.getInt(2));
                project_title = (rs.getString(3));
                project_descrip = (rs.getString(4));
                project_obj = (rs.getString(5));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        tempProject.setProject_ID(project_id);
        tempProject.setClient_Id(client_id);
        tempProject.setProject_Title(project_title);
        tempProject.setProject_Descrip(project_descrip);
        tempProject.setProject_Obj(project_obj);
        
        return tempProject;

    }

    public Vector<Project> getAllProjects() {

        DBManager dm = new DBManager();
        Connection con = dm.getConnection();
        int project_id = 0;
        int client_id = 0;
          String project_title = null;
        String project_descrip = null;
        String project_obj = null;
        Project tempProject = new Project();
        
        Vector<Project> projectData = new Vector();

        String query = "SELECT * FROM PROJECTS";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                 project_id = (rs.getInt(1));
                client_id = (rs.getInt(2));
                project_title = (rs.getString(3));
                project_descrip = (rs.getString(4));
                project_obj = (rs.getString(5));
                
        tempProject.setProject_ID(project_id);
        tempProject.setClient_Id(client_id);
        tempProject.setProject_Title(project_title);
        tempProject.setProject_Descrip(project_descrip);
        tempProject.setProject_Obj(project_obj);
                   }

        } catch (SQLException e) {
            e.printStackTrace();
        }

      
        return projectData;

    }

    public void insertProject(Project nProject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void deleteProject(long project_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}
