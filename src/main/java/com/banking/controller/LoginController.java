package com.banking.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.banking.model.Customer;
import com.banking.service.CustomerService;
import com.banking.service.CustomerServiceImplementation;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("Uname"));
		  String password = request.getParameter("Pass");
		  response.setContentType("text/html"); 

          PrintWriter out = response.getWriter(); 
		CustomerService customerService = new CustomerServiceImplementation();
	      Customer customer = new Customer();
	      customer = customerService.validateAccount(id, password);
	   //   response.getWriter().println(customer.getCustomerId());
	    //  response.getWriter().println(customer.getPassword());
  		String s = customer.getPassword();
	       if(customer.getCustomerId()== id) {
	    	   response.getWriter().println(customer.getPassword());
	    		response.getWriter().println("You have successfully logged in");
	    		
	    		int bal = customerService.viewBalance(id);
	    		 HttpSession session = request.getSession();
	  	         session.setAttribute("balance", bal);
	  	         session.setAttribute("userid", id);

	  	       RequestDispatcher dispatcher = request.getRequestDispatcher("logindetails.jsp");
	  	       dispatcher.forward(request, response);
	        
	     
	}
	       else {
	    	   response.getWriter().println("Incorrect login.please try again");
	    	   
	       }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
