package com.zaic.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.zaic.model.HelpToInsert;
import javax.servlet.http.*;
import javax.servlet.*;
  
  
  
public  class UraServletOne extends HttpServlet{

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
   response.setContentType("text/html");
   
   
}

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
   response.setContentType("text/html");
   
   //PrintWriter out = response.getWriter();
   
   //out.append("<h1>"+ "Assalam alaikum.... "+ "<h1>");
   
    RequestDispatcher view = request.getRequestDispatcher("clientreg.jsp");
         
         // the forward the request and response to the jsp using the dispatcher object..
         
            view.forward(request,response);
   
}


}  
  