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
import com.zaic.model.HelpToInsert;

public class UraServletSix extends HttpServlet{

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HelpToInsert inserObj = new HelpToInsert(request, getServletConfig());
        
        if(inserObj.workkOnPlatenumput()){
  
   RequestDispatcher view = request.getRequestDispatcher("success.jsp");
         
         // the forward the request and response to the jsp using the dispatcher object..
         
            view.forward(request,response);
        }
        else{
          out.append("<h1>"+ "Check all your fields "+" this is the issue "  + "<h1>");
        }



}

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


}


}