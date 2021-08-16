package com.banking.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.banking.service.CustomerService;
import com.banking.service.CustomerServiceImplementation;

/**
 * Servlet implementation class Viewbalancecontroller
 */
public class Viewbalancecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Viewbalancecontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession();
	     int id = (int)session.getAttribute("userid");
	    
	       CustomerService customerService = new CustomerServiceImplementation();
		    int bal = customerService.viewBalance(id);
		
	       session.setAttribute("balance", bal);
			
	    	response.setContentType("text/html");
	    	PrintWriter out = response.getWriter();
	    	out.println(id);
	    	out.println("<body style='background-color:green;background-image: url('https://images.all-free-download.com/images/graphicthumb/wood_background_hd_picture_4_169843.jpg');'>");
	    	 out.println("<body style='background-color:blue;'>");
	    	out.println("<h2>Your AccountBalance is :</h2>" +bal);
	    	  out.println("<br/>");
	    	  out.println("<br/>");
	    	  out.println("<br/>");
	    	  out.println("<br/>");
	    	  out.println("<br/>");
	    	  out.println("<br/>");
	    	  
	    	  out.print("<a style='background-color:green;'href='logindetails.jsp'>Back</a>");
	          
	    	out.println("</body><html>");
	    	
	       
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
