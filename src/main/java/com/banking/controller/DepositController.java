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
 * Servlet implementation class DepositController
 */
public class DepositController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepositController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

    	PrintWriter out = response.getWriter();
	      int id = (int)session.getAttribute("userid");
	    
	      int amount = Integer.parseInt(request.getParameter("deposit"));
	 
	      int balance = (int)session.getAttribute("balance");
	  
	      
	       CustomerService customerService = new CustomerServiceImplementation();

	       	 out.println("<body style='background-color:orange;'>");
	       if(amount>0) {
	    	 int bal=    customerService.deposit(amount,id);

		   out.println("<h1 style='color:orange;font-family:verdana;' >");
		     out.println("<h1>You have deposited the amount Rs:"+amount+" successfully");
		   out.println("Your balance is"+bal);
	       }
	       else {
	    	   out.println("You should deposit a valid amount");
	       }
	 	  out.println("<br/>");
    	  out.println("<br/>");
    	  out.println("<br/>");
    	  out.println("<br/>");
    	 
	       out.print("<a href='Welcome.html'>Home</a>");
	       out.println("<br/>");
	    	  out.println("<br/>");
			out.println("<body style='background-color:green;'>");
			  out.print("<a style='background-color:red;'href='logindetails.jsp'>Back</a>");
			
	       
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
