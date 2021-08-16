<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link type="text/css" rel="stylesheet" href="css/styles.css" />
<script type="text/javascript" src="js/validator.js"></script>
</head>
<body>
	<h1>
		You logged in at
		<%=new java.util.Date()%></h1>
	<h2 align="center">Customer Edit Details</h2>
	<form action="customerDetailsById" onsubmit="return validate()">
		<table cellpadding="10" cellspacing="10">
			<tr>
				<td>*Customer Id</td>
				<td><input type="text" name="customerId" id="customerId" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Search"
					class="alert alert-danger">
			</td>
				<td><input type="submit" value="Delete" formaction="DeleteCustomerController" class="alert alert-danger">
			</td>
				<td><input type="reset" value="Clear"
					class="alert alert-warning"></td>
			</tr>

		</table>
	</form>
<br/>
<%= session.getAttribute("message") %>
<br/>
	<a href="Home.html">Home</a>
</body>
</html>