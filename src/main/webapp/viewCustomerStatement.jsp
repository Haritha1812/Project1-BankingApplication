
<%@page import="com.banking.model.CustomerTransaction"%>
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
    <h2>Customer details</h2>
    <%
    List<CustomerTransaction> customerTransaction= (List<CustomerTransaction>) session.getAttribute("customerTransactionDetails");
    %>
    <table border="5" cellpadding="4" cellspacing="7" bordercolor="rgb(201, 76, 76)">
        <th>Customer Id</th>
        <th>Balance</th>
        <th>Deposit</th>
        <th>Withdraw</th>
        <th>Transferred Amount</th>
        <th>From Account No</th>
        <th>To Account No</th>
        <th>Transaction Date</th>
        <%
      for(int i=0 ; i<customerTransaction.size();i++){
    	  CustomerTransaction customerTransactions= customerTransaction.get(i);
        %>
        <tr>
            <td><%=customerTransactions.getCustomerId()%></td>
            <td><%=customerTransactions.getBalance()%></td>
            <td><%=customerTransactions.getDeposit()%></td>
            <td><%=customerTransactions.getWithdrawn()%></td>
            <td><%=customerTransactions.getTransferredAmount()%></td>
            <td><%=customerTransactions.getToAccount()%></td>
            <td><%=customerTransactions.getFromAccount() %></td>
            <td><%=customerTransactions.getTransactionDate()%></td>
        </tr>
       <% } %>

    </table>
<br/>
<br/>



</body>
</html>
 