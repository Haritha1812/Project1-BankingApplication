<%@page import="com.banking.model.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>

body  
{  
    margin: 0;  
    padding: 0;  
    background-image:url("https://image.shutterstock.com/image-photo/building-strong-team-wooden-blocks-600w-1742879351.jpg");
   background-size: 100% 100%;
   background-repeat :no-repeat;
   background-attachment:fixed;
    font-family: 'Arial';  
   
}  
td{

 color="blue";
}
</style>
<body>
<h1 color="blue">Customer Details</h1>
<% List<Customer> customers = (List<Customer>) session.getAttribute("allcustomers");
%>
<table border = "10" cellspacing = "10" cellpadding = "10">

<th>Customer Id</th>
<th>Customer Name</th>
<th>Customer Email</th>
<th>Customer Mobile</th>
<th>Balance</th>
<th>Customer Registration date</th>
<th>Customer Updated date</th>
<%
    for(int i=0;i<customers.size();i++) {
	Customer customer = customers.get(i);

%>
<tr>

   <td><%= customer.getCustomerId() %></td>
<td><%= customer.getCustomerName() %></td>
<td><%= customer.getEmailId() %></td>
<td><%= customer.getMobilenumber() %></td>
<td><%= customer.getBalance() %></td>
<td><%= customer.getRegistrationdate() %></td>
<td><%= customer.getUpdatedDate() %></td>
	<td><a href="DeleteCustomerController?customerId=<%= customer.getCustomerId() %>">Delete</a></td>
	
	<td><a href="EditCustomerController?customerId=<%= customer.getCustomerId() %>">Edit</a></td>


</tr>
<% } %>

<%= session.getAttribute("message") %>

<%= session.getAttribute("messageedit") %>

</table>
</body>
</html>