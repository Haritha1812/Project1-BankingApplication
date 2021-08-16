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

import com.banking.dao.CustomerTransactionDAO;
import com.banking.dao.CustomerTransactionImplementation;
import com.banking.model.CustomerTransaction;

/**
 * Servlet implementation class ViewStatementController
 */
public class ViewStatementController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewStatementController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession httpSession=request.getSession();
		CustomerTransactionDAO customerTransactionDAO=new CustomerTransactionImplementation();
		List<CustomerTransaction> customerTransaction=customerTransactionDAO.getAllCustomerTransaction();
		httpSession.setAttribute("customerTransactionDetails", customerTransaction);
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("viewCustomerStatement.jsp");
		requestDispatcher.forward(request, response);
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
