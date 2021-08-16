package com.banking.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

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
 * Servlet implementation class UpdateCusEmpController
 */
public class UpdateCusEmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCusEmpController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int customerId = (int) session.getAttribute("cusempid");
		CustomerService customerService = new CustomerServiceImplementation();
		
		
		
		  Date date =   (Date) session.getAttribute("date");
			
	     int bal = customerService.viewBalance(customerId);
		String mobilenumber = request.getParameter("mobile");
		String emailId = request.getParameter("Customeremail");
	    String customerName = request.getParameter("CustomerName");
	   
	    String password = request.getParameter("password");
	Customer customer = new Customer();
	customer.setMobilenumber(mobilenumber);
	customer.setEmailId(emailId);
	customer.setCustomerName(customerName);
	customer.setPassword(password);
	customer.setCustomerId(customerId);
	customer.setBalance(bal);
	customer.setRegistrationdate(date);
	customer.setUpdatedDate(new Date());
	response.getWriter().println(password);
     customerService.updateAccount(customer);
		response.setContentType("text/html");
	
	
		session.setAttribute("messageedit", "Updation of : "+customerId+ " successful");
		RequestDispatcher dispatcher = request.getRequestDispatcher("employeelogindetails.jsp");
		PrintWriter out = response.getWriter();
		 
		  out.println("<br/>");
  	  out.println("<br/>");
     out.print("<a href='Welcome.html'>Home</a>");
     out.println("<br/>");
  	  out.println("<br/>");
		out.println("<body style='background-color:green;'>");
		  out.print("<a style='background-color:red;'href='employeelogindetails.jsp'>Back</a>");
	
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
