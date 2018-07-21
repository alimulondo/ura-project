package com.zaic.model;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.*;


public class TheContextListen implements ServletContextListener {

  @Override
 public void contextDestroyed(ServletContextEvent event) {
  
  
 }

 @Override
 public void contextInitialized(ServletContextEvent event) {
  ServletContext con = event.getServletContext();
  String user = con.getInitParameter("username");
  String pass = con.getInitParameter("password");
  String dbclassstr = con.getInitParameter("dbclass");
  String driver = con.getInitParameter("dbdrivers");
  
  WorkonConnection obj = new WorkonConnection();
  
  Connection setmycon = obj.createConnection(user,pass,dbclassstr,driver);
  
  con.setAttribute("connect", setmycon);
  
    
  
 }
}