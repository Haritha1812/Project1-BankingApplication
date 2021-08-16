package com.banking.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.banking.model.Employee;
import com.banking.service.EmployeeService;
import com.banking.service.EmployeeServiceImplementation;

/**
 * Servlet implementation class EmployeeLoginController
 */
public class EmployeeLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empid = Integer.parseInt(request.getParameter("Ename"));
	  String pass = request.getParameter("Password");	
	  response.setContentType("text/html"); 

      PrintWriter out = response.getWriter(); 
      EmployeeService employeeService = new EmployeeServiceImplementation();
      Employee employee = new Employee();
      employee = employeeService.validateAccount(empid, pass);
      String p = employee.getEmployeePassword();
      if(p.equals(pass)) {
    		response.getWriter().println("You have successfully logged in.");
    		 HttpSession session = request.getSession();
  	        
  	         session.setAttribute("employeeid", empid);
  	       RequestDispatcher dispatcher = request.getRequestDispatcher("employeelogindetails.jsp");
  	       dispatcher.include(request, response);
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
