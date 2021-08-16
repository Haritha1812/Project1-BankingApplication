<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Operations</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<style type="text/css">
h3{
    padding:10px;
    color:gray;
    font-family: cursive;
    font-style: italic;
    font-size: medium;    
    text-align: center;
}
</style>
</head>

 

<body>
    <nav class="navbar navbar-inverse navbar-fixed-left">
    <div>
        <div>
            <u1 class="nav navbar-nav">
                <li ><a href="PrintCustomerController">View / Edit Account</a></li>
                <li ><a href="ViewBalanceController">View Balance</a></li>
                <li ><a href="WithdrawMoneyController">Withdraw</a></li>
                <li ><a href="#">Deposit</a></li>
                <li ><a href="#">Transfer Amount</a></li>
            </u1>
        </div>
    </div>
    </nav>
    <h4 style="color:maroon;"> Customer Id: <%=session.getAttribute("customerId") %></h4>
    <h4 style="color:maroon;">Login Time: <%=session.getAttribute("loginTime") %></h4>
    <h3>
    <ul>A customer can apply for an account, view their balance, and make withdrawals and deposits.</ul>
    <ul> As a customer, U can apply for a new bank account with a starting balance. </ul>
    <ul>As a customer, U can view the balance of a specific account.</ul>
    <ul>As a customer, U can make a withdrawal or deposit to a specific account. </ul>
    <ul>As a customer, U can post a money transfer to another account. </ul>
    <ul>As a customer, U can accept a money transfer from another account.</ul>
    </h3>
                
</body>
</html>