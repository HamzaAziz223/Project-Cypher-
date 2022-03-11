/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bsapp.manager;

import com.bsapp.dao.ProjectDAO;
import com.bsapp.dao.RequirementsDAO;
import java.util.ArrayList;
import com.bsapp.model.Project;
import com.bsapp.model.Requirements;
import com.bsapp.utils.IConstants;
import java.util.Vector;
/**
 *
 * @author docto
 */
public class RequirementsService {
  
    ////Connection to the DAO
////Declares tDao at the top of the page
//TrackDAO tDao = new TrackDAO();
    
    public ArrayList<Requirements> getRequirements(String project_name, int client_id){
        
       RequirementsDAO RequirementsDAO = new RequirementsDAO();
        ArrayList<Requirements> requirements = RequirementsDAO.getRequirementsByproject_name(project_name);
        for ( int i=0; i < requirements.size(); i++) {
        if (requirements.get(i).getClient_Id()!=(client_id)){
            return null;
        }
        }
        return requirements;
    }
     
     ////Get it by ID
//public Track getTrack(long trackId){
//Track track = tDao.getTrackById(trackId);
//return track;
//}
     
    
    public ArrayList<Requirements> getAllRequirements(){
       
        RequirementsDAO uDao = new RequirementsDAO();
        ArrayList<Requirements> requirementsList = uDao.getAllRequirements();
        return requirementsList;
        
    }
    
    ////Gets all items in the table
//public ArrayList<Track> getAllTracks(){
//ArrayList<Track> trackList = tDao.getAllTracks();
//return trackList;
    
    public void insertRequirements(Requirements nRequirements){
        RequirementsDAO uDao = new RequirementsDAO();
        uDao.insertRequirements(nRequirements);
    }
    ////inserts into table
//public void insertTrack(Track nTrack){
//tDao.insertTrack(nTrack);
//return;
    
    public void deleteRequirements(String project_name){
        RequirementsDAO uDao = new RequirementsDAO();
        uDao.deleteRequirements(project_name);
        return;}
}
        
    ////Deletes a row
//public void deleteTrack(long trackId){
//tDao.deleteTrack(trackId);
//return;    
    

//    public class TrackService {

//

//

//
//}
//

//
//}
//
////Updates items in a row
//public void updateTrack(Track nTrack){
//tDao.updateTrack(nTrack);
//return;
//
//}
//

//
//}
//
//
//
//
//}
    
    
    

