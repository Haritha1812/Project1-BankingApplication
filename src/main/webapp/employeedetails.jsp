
<%@page import="com.banking.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
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
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
    <h2>Employee details</h2>
    <%
    List<Employee> employees = (List<Employee>) session.getAttribute("employeebyid");
    %>
    <table border="5" cellpadding="4" cellspacing="7" bordercolor="rgb(201, 76, 76)">
        <th>Employee Id</th>
        <th>Employee Name</th>
        <th>Email</th>
        <th>Mobile Number</th>
        <th>Salary</th>
      
        <th>Edit</th>
        <%
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
        %>
        <tr>
            <td><%=employee.getEmployeeId() %></td>
            <td><%=employee.getEmployeeName() %></td>        
            <td><%=employee.getEmailId() %></td>
            <td><%=employee.getEmployeePhoneNumber()%></td>
            <td><%=employee.getSalary() %></td>
           
        </tr>
        <%
        }
        %>

 

    </table>
<br/>
<br/>
<%    
        session.getAttribute("message");

 

     %>

 

</body>
</html>
 