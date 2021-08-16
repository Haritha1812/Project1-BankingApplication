package com.banking.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
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
 * Servlet implementation class EditCustomerController
 */
public class EditCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditCustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int customerid = Integer.parseInt(request.getParameter("customerId"));

        PrintWriter out = response.getWriter(); 
 
		session.setAttribute("cusempid", customerid);
		
		//RequestDispatcher dispatcher = request.getRequestDispatcher("customerSearch.jsp");
		RequestDispatcher dispatcher = request.getRequestDispatcher("empupdcus.html");

		dispatcher.forward(request, response);
		 
		  out.println("<br/>");
  	  out.println("<br/>");
     out.print("<a href='Welcome.html'>Home</a>");
     out.println("<br/>");
  	  out.println("<br/>");
		out.println("<body style='background-color:green;background-image: url('https://images.all-free-download.com/images/graphicthumb/wood_background_hd_picture_4_169843.jpg');'>");
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
