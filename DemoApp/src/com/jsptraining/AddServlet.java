package com.jsptraining;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
   public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
   {
	   int one = Integer.parseInt(req.getParameter("num1"));
	   int two = Integer.parseInt(req.getParameter("num2"));
	   int result = one + two;
	   
	   
	   //Session Management
	    req.setAttribute("k", result);
	    
	    
	   //Request Dispatcher and Redirect
	   RequestDispatcher rd = req.getRequestDispatcher("sq");
       rd.forward(req, res);
	   
   } 
}