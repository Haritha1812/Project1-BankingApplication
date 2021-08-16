package com.banking.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.banking.service.CustomerService;
import com.banking.service.CustomerServiceImplementation;

/**
 * Servlet implementation class WithdrawController
 */
public class WithdrawController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WithdrawController() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	HttpSession session = request.getSession();

    	PrintWriter out = response.getWriter();
	      int id = (int)session.getAttribute("userid");
	    
	      int amount = Integer.parseInt(request.getParameter("amount"));
	     
	      int balance = (int)session.getAttribute("balance");
	  
	      
	       CustomerService customerService = new CustomerServiceImplementation();
	      
	       if(amount<balance) {
	    	 int bal=    customerService.withdraw(amount,id);
		   out.println("<h1 style='color:orange;font-family:verdana;' >You have withdrawn successfully");
		
		   out.println("<h2 style='color:orange;font-family:verdana;'  >Your balance is"+bal);
	       }
	       else {
	    	   out.println("You have very low balance");
	       }
	       out.println("<br/>");
	    	  out.println("<br/>");
	       out.print("<a href='Welcome.html'>Home</a>");
	       out.println("<br/>");
	    	  out.println("<br/>");
			out.println("<body style='background-color:green;'>");
			  out.print("<a style='background-color:red;'href='logindetails.jsp'>Back</a>");
	}
    
    
}
