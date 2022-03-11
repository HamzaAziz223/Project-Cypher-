/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bsapp.manager;

import com.bsapp.dao.ProjectDAO;
import java.util.ArrayList;
import com.bsapp.model.Project;
import com.bsapp.utils.IConstants;
import java.util.Vector;

/**
 *
 * @author be_me
 */
public class ProjectService {
    
    public Project getProject(int project_id, int client_id){
        
       ProjectDAO ProjectDAO = new ProjectDAO();
        Project project = ProjectDAO.getProjectByproject_id(project_id);
        if (project.getClient_Id()==(client_id)){
            return project;
        }
        else return null;
    }
    
    public Vector<Project> getAllProjects(){
       
        ProjectDAO uDao = new ProjectDAO();
        Vector<Project> projectList = uDao.getAllProjects();
        return projectList;
        
    }
    
    public void insertProject(Project nProject){
        ProjectDAO uDao = new ProjectDAO();
        uDao.insertProject(nProject);
        return;
        
    }
    
    public void deleteProject(long project_id){
        ProjectDAO uDao = new ProjectDAO();
        uDao.deleteProject(project_id);
        return;
        
    }
    
}
