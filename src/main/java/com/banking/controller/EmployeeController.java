package com.banking.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.banking.model.Employee;
import com.banking.service.CustomerService;
import com.banking.service.CustomerServiceImplementation;
import com.banking.service.EmployeeService;
import com.banking.service.EmployeeServiceImplementation;

/**
 * Servlet implementation class EmployeeController
 */
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(ServletConfig config) throws ServletException {
  		// TODO Auto-generated method stub
  	}

  	/**
  	 * @see Servlet#destroy()
  	 */
  	public void destroy() {
  		// TODO Auto-generated method stub
  	}

  	/**
  	 * @see Servlet#getServletConfig()
  	 */
  	public ServletConfig getServletConfig() {
  		// TODO Auto-generated method stub
  		return null;
  	}

  	/**
  	 * @see Servlet#getServletInfo()
  	 */
  	public String getServletInfo() {
  		// TODO Auto-generated method stub
  		return null; 
  	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int Id = Integer.parseInt(request.getParameter("EmployeeId"));
	String Name = request.getParameter("EmployeeName");
	String email = request.getParameter("Employeeemail");
	String mobile = request.getParameter("mobile");
	String password = request.getParameter("password");
	String salary = request.getParameter("salary");
		PrintWriter out = response.getWriter();
		Employee employee = new Employee(Id, Name,mobile, password, email, salary);
		EmployeeService employeeService = new EmployeeServiceImplementation();
		employeeService.addEmployeeAccount(employee);
		response.setContentType("text/html");

	   	 out.println("<body style='background-color:orange;'>");
		response.getWriter().println("<h1>"+Name + ", congrats you have successfully registered in our bank as an employee with salary category "+salary);
		 HttpSession session = request.getSession();
		 session.setAttribute("employeeid", Id);
		 out.print("<a href='/Welcome.html'>Home");
	        out.print("</a>");
		 out.println("<h4>Login to your account<h4>");
	        out.print("<a href='/employeelogin.html'>Login");
	        out.print("</a>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
