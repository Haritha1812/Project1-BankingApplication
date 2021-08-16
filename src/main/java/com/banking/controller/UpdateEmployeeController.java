package com.banking.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.banking.model.Customer;
import com.banking.model.Employee;
import com.banking.service.CustomerService;
import com.banking.service.CustomerServiceImplementation;
import com.banking.service.EmployeeService;
import com.banking.service.EmployeeServiceImplementation;

/**
 * Servlet implementation class UpdateEmployeeController
 */
public class UpdateEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession();
		 EmployeeService employeeService = new EmployeeServiceImplementation();
		 Employee employee1 ;
		 Employee emp;
		int empId = (int) session.getAttribute("employeeid");
		
		 String Name = request.getParameter("EmployeeName");
			String email = request.getParameter("Employeeemail");
			String mobile = request.getParameter("mobile");
			String password = request.getParameter("password");
		 
		 employee1 = new Employee();
		
		 employee1.setEmployeeId(empId);
		 employee1.setEmployeeName(Name);
		 employee1.setEmailId(email);
		 employee1.setEmployeePassword(password);
		 employee1.setEmployeePhoneNumber(password);
		 employee1.setSalary("500000");
		
		 employeeService.updateEmployeeAccount(employee1);
		 
		 

			response.setContentType("text/html");
			response.getWriter().println("<h1>"+Name + "Your account has been updated successfully.");
		 
		 
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
