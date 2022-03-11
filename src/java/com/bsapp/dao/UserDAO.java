/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bsapp.dao;

import com.bsapp.utils.IConstants;
import com.bsapp.model.User;
import com.bsapp.utils.DBManager;
import java.sql.Connection;
import java.sql.SQLException;

public class UserDAO {

    public User getUserByEmail(String email) {
        
      
DBManager dmbgr = new DBManager();
Connection con = dmbgr.getConnection();

public User getUserByEmail(String email) {



DBManager dmbgr = new DBManager();
Connection con = dmbgr.getConnection();
int userId = 0;
String password = null;
String fName = null;
String lName = null;
String userType = null;
String stars = null;
String snumber = null;
String course = null;
User tempUser = new User();



String query = "SELECT * FROM USER WHERE NAME=" + "'" + name + "'";
try {
PreparedStatement stmt = con.prepareStatement(query);
ResultSet rs = stmt.executeQuery();
while (rs.next()) {
userId = (rs.getInt(1));
password = (rs.getString(3));
fName = (rs.getString(4));
lName = (rs.getString(5));
userType = (rs.getString(6));
stars = (rs.getString(7));
snumber = (rs.getString(8));
course = (rs.getString(9));
}



} catch (SQLException e) {
e.printStackTrace();
}



tempUser.setEmail(email);
tempUser.setId(userId);
tempUser.setFirstName(fName);
tempUser.setLastName(lName);
tempUser.setPassword(password);
tempUser.setUserType(userType);



return tempUser;



}



  
        User tempUser = new User();


        tempUser.setEmail("admin@admin.com");
        tempUser.setId(1);
        tempUser.setFirstName("Admin");
        tempUser.setLastName("Admin");
        tempUser.setPassword("Admin");
        tempUser.setUserType(IConstants.USER_TYPE_ADMIN);
        return tempUser;

    }

 
    public void insertUser(User newUser){
        
        
    }
            
        

}
