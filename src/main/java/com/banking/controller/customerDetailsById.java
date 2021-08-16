package com.banking.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
 * Servlet implementation class customerDetailsById
 */
public class customerDetailsById extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public customerDetailsById() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 CustomerService customerService = new CustomerServiceImplementation();
		 HttpSession session = request.getSession();
		int id = (int)session.getAttribute("userid");     
		Customer customer = new Customer();
	    customer=	customerService.getCustomerById(id);
	    List<Customer> customers = new ArrayList<Customer>();
	    customers.add(customer);
	    session.setAttribute("customerbyid", customers);
	   response.getWriter().println(customers);
	   
	   RequestDispatcher dispatcher = request.getRequestDispatcher("customerbyid.jsp");
       dispatcher.forward(request, response);
       PrintWriter out = response.getWriter();
		 
		  out.println("<br/>");
 	  out.println("<br/>");
    out.print("<a href='Welcome.html'>Home</a>");
    out.println("<br/>");
 	  out.println("<br/>");
		out.println("<body style='background-color:green;'>");
		  out.print("<a style='background-color:red;'href='employeelogindetails.jsp'>Back</a>");
	
	   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
