<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover {
  background-color: #111;
}

body  
{  
    margin: 0;  
    padding: 0;  
    background-image:url(" https://image.shutterstock.com/image-photo/business-woman-drawing-global-structure-600w-1006041130.jpg");
   background-size: 100% 100%;
   background-repeat :no-repeat;
   background-attachment:fixed;
    font-family: 'Arial';  
   
}  

</style>
<script>
function add() {
	 
    //Create an input type dynamically.
    var element = document.createElement("input");
 
    //Assign different attributes to the element.
    element.setAttribute("type", "number");
    element.setAttribute("placeholder", "Enter the amount to withdraw");
    element.setAttribute("id", "amount");
    element.setAttribute("name", "amount");
    var result = document.createElement("input");
    
    //Assign different attributes to the element.
    result.setAttribute("type", "submit");
    result.setAttribute("value", "Submit");
    result.setAttribute("id", "submit");
    var divEl= document.getElementById("divEl");
 
    //Append the element in page (in span).
    divEl.appendChild(element);
    divEl.appendChild(result);
}

function deposit() {
	 
    //Create an input type dynamically.
    var sample = document.createElement("input");
 
    //Assign different attributes to the element.
    sample.setAttribute("type", "number");
    sample.setAttribute("placeholder", "Enter the amount to deposit");
    sample.setAttribute("id", "deposit");
    sample.setAttribute("name", "deposit");
    
    var damount = document.createElement("input");
    
    //Assign different attributes to the element.
    damount.setAttribute("type", "submit");
    damount.setAttribute("value", "Submit");
    damount.setAttribute("id", "submit");
    var child= document.getElementById("child");
 
    //Append the element in page (in span).
    child.appendChild(sample);
    child.appendChild(damount);
}

function transfer() {
	 
    //Create an input type dynamically.
    var transfer = document.createElement("input");
 
    //Assign different attributes to the element.
    transfer.setAttribute("type", "number");
    transfer.setAttribute("placeholder", "Enter the amount to transfer");
    transfer.setAttribute("id", "transferamount");
    transfer.setAttribute("name", "transferamount");
    
    var sender = document.createElement("input");
    
    sender.setAttribute("type", "number");
    sender.setAttribute("placeholder", "Enter the account number to transfer");
    sender.setAttribute("id", "senderid");
    sender.setAttribute("name", "senderid");
    
    
    
    var tamount = document.createElement("input");
    
    //Assign different attributes to the element.
    tamount.setAttribute("type", "submit");
    tamount.setAttribute("value", "Submit");
    tamount.setAttribute("id", "submit");
    var child2= document.getElementById("child2");
 
    //Append the element in page (in span).
    child2.appendChild(transfer);
    
    child2.appendChild(sender);
    child2.appendChild(tamount);
}



</script>
<body>
<div>

<form>

<ul>
  <li><a class="active" href="#home">Home</a></li>
  <li><a href="Viewbalancecontroller">ViewBalance</a></li>
  <li><a href="updatecustomer.html">Update account</a></li>
  <li><a href="customerDetailsById">View Details</a></li>
</ul>
</form>
<img src ="https://image.shutterstock.com/image-vector/money-transfer-ewallet-concept-financial-600w-1747505657.jpg"  width="100" 
     height="100">
 <br/>
  <form action ="WithdrawController" method="get">
<input type="button" value="Withdraw" onclick="add()" />

<div id="divEl"></div>
</form>
 <br/>
<img src ="https://image.shutterstock.com/image-photo/man-passes-another-money-through-260nw-336586193.jpg"  width="100" 
     height="100">
  <br/>   
   <form action ="DepositController" method="get">
<input type="button" value="Deposit" onclick="deposit()" />
<div id="child"></div>
</form>
 <br/>
<img src ="https://image.shutterstock.com/image-photo/people-withdrawal-saving-finance-concept-600w-537353566.jpg"  width="100" 
     height="100">
<br/>  
<form action ="TransferAmountController" method="get">
<input type="button" value="Transfer Amount" onclick="transfer()" />
<div id="child2"></div>
</form>

<br/>

</div>


</body>
</html>