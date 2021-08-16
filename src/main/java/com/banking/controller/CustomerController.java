package com.banking.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.banking.model.Customer;
import com.banking.service.CustomerService;
import com.banking.service.CustomerServiceImplementation;

/**
 * Servlet implementation class CustomerController
 */
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
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
		int id = Integer.parseInt(request.getParameter("CustomerId"));
		int balance = Integer.parseInt(request.getParameter("balance"));
		String mobilenumber = request.getParameter("mobile");
		String emailId = request.getParameter("Customeremail");
	    String customerName = request.getParameter("CustomerName");
	    String acctype = request.getParameter("accounts");
	    String password = request.getParameter("password");
		

        PrintWriter out = response.getWriter(); 
	Customer customer = new Customer(id, password, customerName, balance, mobilenumber, emailId, new Date(), new Date());
		CustomerService customerService = new CustomerServiceImplementation();
		boolean check = customerService.isCustomerExists(id);
		if(check == false) {
		customerService.addAccount(customer);
		response.setContentType("text/html");

   	 out.println("<body style='background-color:orange;'>");
		response.getWriter().println("<h1>"+customerName + ", congrats you have successfully opened an account in our bank with balance of INR "+balance);
        out.println("<h2>Please note your" +id+"for future reference");
        out.println("<h4>Login to your account<h4>");
        out.print("<a href='/Welcome.html'>Home");
        out.print("</a>");
        out.print("<a href='/login.html'>Login to your account");
        out.print("</a>");
        
		}
		else {
			out.println("Customer Id already exists.Try with different customer id");
		}
		HttpSession session = request.getSession();
		session.setAttribute("date", new Date());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
