<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Admin!!!!</title>
</head>
<%@ page isELIgnored="false" %>
<body>
	<center>
		<h2></h2>
		<h2>
			Hi ${user.userName} , Ur role is ${user.role}
		</h2>
	</center>
</body>
</html>