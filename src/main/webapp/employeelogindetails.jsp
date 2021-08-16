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
    background-image:url("https://image.shutterstock.com/image-photo/building-strong-team-wooden-blocks-600w-1742879351.jpg");
   background-size: 100% 100%;
   background-repeat :no-repeat;
   background-attachment:fixed;
    font-family: 'Arial';  
   
}  

</style>
<body>
<form>

<ul>
  <li><a class="active" href="Welcome.html">Home</a></li>
  <li><a href="ViewEmployeeAccountController">View Account</a></li>
  <li><a href="updateemployee.html">Update Details</a></li>
   <<li><a href="displaycustomers.jsp">View all customer details</a></li>
    <<li><a href="ViewStatementController">View Statement of Customers</a></li>
</ul>
</form>
</body>
</html>