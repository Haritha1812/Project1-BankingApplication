package com.banking.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.banking.service.CustomerService;
import com.banking.service.CustomerServiceImplementation;

/**
 * Servlet implementation class TransferAmountController
 */
public class TransferAmountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransferAmountController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

    	PrintWriter out = response.getWriter();
	      int id = (int)session.getAttribute("userid");
	 
		  int amount = Integer.parseInt(request.getParameter("transferamount"));
		  int senderid = Integer.parseInt(request.getParameter("senderid"));
		CustomerService customerService = new CustomerServiceImplementation();
	   
		customerService.transferAmount(id, senderid, amount);
		
	out.println("<h2 style='color:orange;font-family:verdana;'>");
	out.println("<h2>You have successfully transfered Rs: "+amount +" to the account number "+senderid);
	
	
		out.println("<body style='background-color:green;'>");
		 out.println("<br/>");
   	  out.println("<br/>");
	       out.print("<a href='Welcome.html'>Home</a>");
	       out.println("<br/>");
	    	  out.println("<br/>");
		  out.print("<a style='background-color:red;'href='logindetails.jsp'>Back</a>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
