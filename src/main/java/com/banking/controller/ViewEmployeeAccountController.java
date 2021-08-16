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

import com.banking.model.Employee;
import com.banking.service.EmployeeService;
import com.banking.service.EmployeeServiceImplementation;

/**
 * Servlet implementation class ViewEmployeeAccountController
 */
public class ViewEmployeeAccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewEmployeeAccountController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		Employee employee = new Employee();
		 
		int empId = (int) session.getAttribute("employeeid");
		EmployeeService employeeService = new EmployeeServiceImplementation();
	  employee=	employeeService.viewEmployeeAccount(empId);
		
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(employee);
		 session.setAttribute("employeebyid", emp);
		
		 RequestDispatcher dispatcher = request.getRequestDispatcher("employeedetails.jsp");
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
