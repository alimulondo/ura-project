package com.zaic.model;

import java.sql.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import java.text.SimpleDateFormat;
import java.util.Date;


public class HelpToInsert{
  HttpServletRequest request;
  ServletConfig config;
  Statement stmt;
  CallableStatement cstm;
  ResultSet rs;
  String data;
  String qqdata;
  String chkval = "salaam";
  boolean check = false;
  boolean ckkquery = true;
  public HelpToInsert(HttpServletRequest request, ServletConfig config){
    this.request=request;
    this.config = config;
  }
  
    public boolean callTheProcedure(){
     ServletContext cnx = config.getServletContext();
     
     /////// the strings sent in the requests are captured here..
     String  chassis_in  = request.getParameter("chassis");
     
     String make_in   = request.getParameter("make");
     
     String model_in  = request.getParameter("model");
     
     String grade_in   = request.getParameter("grade");
     
     String drive_in  = request.getParameter("drive");  
     
     String transmission_in = request.getParameter("trans");
     
     String body_in         =  request.getParameter("body");
     
     String engine_in   = request.getParameter("engine_num");
     
     String  year_in  = request.getParameter("year");
     
     String fuel_in  = request.getParameter("fuel");
     
     String mileage_in  = request.getParameter("mileage");              //   IN  number, i have to convert this string to numbers
     
     String  engin_size_in  = request.getParameter("engine_size");  //   IN  number, i have to convert this string to numbers
     
    String doors_in   = request.getParameter("doors");   //   IN  number, i have to convert this string to numbers

    String seats_in  = request.getParameter("seats");   //   IN  number, i have to convert this string to numbers

   String stearing_in  = request.getParameter("stearing");
     
     Connection con =(Connection) cnx.getAttribute("connect");
     
     try{
     
     boolean check = con.isValid(10);
     
     if(check) data = "yes connection is fine";
     else data = "you got it wrong.";
     }catch(Exception e){
       data = "you endee up in errors...";
     }
     
     try{
      // try{
     this.stmt = con.createStatement();
     
     rs = stmt.executeQuery("select * from car");
     //data = "rs is fine query executed......";
      rs.next();
        qqdata = rs.getString(1) + rs.getString(2) + rs.getString(3);
     
     // i use the connection  to call callablestatement..
     
     this.cstm = con.prepareCall("{call add_cars(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
     
      setStringVal(1,chassis_in);   //// setting chassis number.
      setStringVal(2,make_in);
      setStringVal(3,model_in);
      setStringVal(4,grade_in);
      setStringVal(5,drive_in);
      setStringVal(6,transmission_in);
      setStringVal(7,body_in);
      setStringVal(8,engine_in);
      setStringVal(9, year_in); // setting year at index 9.
      setStringVal(10,fuel_in);
      setStringVal(11, mileage_in); // setting mileage at index 11.
      setStringVal(12,engin_size_in);
      setStringVal(13,doors_in);
      setStringVal(14,seats_in);
      setStringVal(15,stearing_in);
      
   
          cstm.execute();
     
      /* }finally{
         if(cstm != null) cstm.close();
         if(con != null) con.close();
     } */
      
     // data = "You figured it out smart ma shaa Allah......";
     }catch(Exception e){
       //data = "Some thing is wrong......";
      // data = data + e.toString();
       ckkquery =false;
     } 
     
     
        //if(data.isEmpty()) data = "am empty...";
      /// if(ckkquery==true) return true; 
     //return fuel_in + " and "+transmission_in + "and con is "+ data+" these are the numbers: "+ chkval ;
       
      // else return false;
     
     return ckkquery;
     
    
  }
    public void setStringVal(int i, String setval){
      try{
      
        if(i != 9 | i != 11 | i != 12 | i != 13 | i != 14 ){
             cstm.setString(i,setval);
             chkval =chkval + " and " + setval;
        }
        
        else if(i == 9){
          //SimpleDateFormat formatter = new SimpleDateFormat("dd-mmm-yyyy");
          
          //Date mydate = formatter.parse(setval);
          cstm.setString(i,setval);  // i've got to complete the string to date conversion before setting this
          chkval =chkval + " and " + setval;
          
        }
      
        else if(i == 11 | i == 12 | i == 13 | i == 14 ){
          //Long numobj =(Long) setval; 
          
          long num =Long.parseLong(setval); 
          
          cstm.setLong(i,num);  // i've got to complete the string to long conversion before setting this
          chkval =chkval + " and " + num;
          
        }
      
      
      }catch(Exception e){}
    
    }
    
   
    
   synchronized public  boolean  workkOnClientput(){
      ServletContext cnx = config.getServletContext();
      Connection con =(Connection) cnx.getAttribute("connect");
      
       try{
     
      check = con.isValid(10);
     
     if(check) data = "yes connection is fine";
     else data = "you got it wrong.";
     }catch(Exception e){
       data = "you endee up in errors...";
     }
    
   
    
     String  fname_in  = request.getParameter("fname");
     
     String lname_in   = request.getParameter("lname");
     
     String dateob_in  = request.getParameter("dateob");
     
     String gender_in   = request.getParameter("gender");
     
     String location_in  = request.getParameter("location");  
     
     String phonenum_in = request.getParameter("phonenum");
     
     String status_in       =  request.getParameter("status");
     
     if(check){
       try{
     this.cstm = con.prepareCall("{call add_clients(?,?,?,?,?,?,?)}");
     
       setStringVal(1,fname_in );  
      setStringVal(2,lname_in);
      setStringVal(3,gender_in);
      setStringVal(4,dateob_in);
      setStringVal(5,location_in);
      setStringVal(6,phonenum_in);
      setStringVal(7,status_in);
      
      cstm.execute();
      
      return true;
      
        
     }catch(Exception e){return false;}
     }
     
     else return false;
     
     
      }
   
   // overload the function for populating the the procedures, third parameter is to indicate the servlet 
   // number it is supporting...in this case interger 3.
   
   public void setStringVal(int s,int i, String setval){
     
     try{
       if(!setval.isEmpty()){
         long num =Long.parseLong(setval); 
          
              cstm.setLong(i,num); 
       }  
       else ckkquery =false;
     }catch(Exception e){
       ckkquery =false;
     }
   
   }
   
    synchronized public  boolean  workkOnVehicleput(){
      ServletContext cnx = config.getServletContext();
      Connection con =(Connection) cnx.getAttribute("connect");
      
       try{
     
      check = con.isValid(10);
      
      if(check){
      String  chassis_in  = request.getParameter("chassisid");
     
     String client_in   = request.getParameter("clientid");
        try{
     this.cstm = con.prepareCall("{call do_reg_withm(?,?)}");
     
       setStringVal(1,chassis_in );  // first parameter of the procedure is a string variable...
      setStringVal(3,2,client_in);
      
       cstm.execute();
      
      ckkquery =true;
        }catch(Exception e){ ckkquery = false;} 
      
     
      }
              
     }catch(Exception e){
          ckkquery = false;
     }
    
       return ckkquery;
    }
    
     synchronized public  boolean  workkOnPlatenumput(){
      ServletContext cnx = config.getServletContext();
      Connection con =(Connection) cnx.getAttribute("connect");
      
       try{
     
      check = con.isValid(10);
      
      if(check){
      String  regid_in  = request.getParameter("regid");
     
     String platnum_in   = request.getParameter("platenum");
        try{
     this.cstm = con.prepareCall("{call do_plate(?,?)}");
     
       setStringVal(5,1,regid_in );  
       setStringVal(2,platnum_in); // because this takes string parameter i used the initail function...setStringVal
      
       cstm.execute();
      
      ckkquery =true;
        }catch(Exception e){ ckkquery = false;} 
      
     
      }
              
     }catch(Exception e){
          ckkquery = false;
     }
    
       return ckkquery;
    }
     
     synchronized public  boolean  workOnTransfer(){
      ServletContext cnx = config.getServletContext();
      Connection con =(Connection) cnx.getAttribute("connect");
      
       try{
     
      check = con.isValid(10);
      
      if(check){
      String  regid_in  = request.getParameter("regid");
     
      String oldclt_in   = request.getParameter("ocid");
     
      String newclt_in   = request.getParameter("ncid");
      
       String mileage_in   = request.getParameter("mileage");
       
        String chassis_in   = request.getParameter("chassis");
        try{
     this.cstm = con.prepareCall("{call do_trans(?,?,?,?,?)}");
     
       setStringVal(7,1,regid_in);  
       setStringVal(7,2,oldclt_in); // because this takes string parameter i used the initail function...setStringVal
       setStringVal(7,3,newclt_in);  
       setStringVal(4,chassis_in);
       setStringVal(7,5,mileage_in);
       
      
       cstm.execute();
      
      ckkquery =true;
        }catch(Exception e){ ckkquery = false;} 
      
     
      }
              
     }catch(Exception e){
          ckkquery = false;
     }
    
       return ckkquery;
    }

}