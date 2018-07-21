package com.zaic.model;

import java.sql.*;  

public class  WorkonConnection{
  Connection con;
  
  public  WorkonConnection(){
    }
    
 public  Connection createConnection(String user, String pass, String dbclass, String drivers){
      
      //Connection con;
      try{
      //step1 load the driver class  
        Class.forName(dbclass);
        
        
        //step2 create  the connection object  
        con = DriverManager.getConnection(drivers,user,pass); 
       
     }catch(Exception e){
      }
     
     return con;
     
    
    }
    

}