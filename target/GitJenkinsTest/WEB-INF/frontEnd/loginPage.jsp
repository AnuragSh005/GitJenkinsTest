<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Login page</title>
</head>

<body>
	<h2>Fill the form to enter another universe</h2>
<form:form method="POST" action="/GitJenkinsTest/loginVarification">
   <table>
    <tr>
        <td><form:label path="userName">Username</form:label></td>
        <td><form:input path="userName" /></td>
    </tr>
    <tr>
        <td><form:label path="password">Password</form:label></td>
        <td><form:input path="password" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Enter"/>
        </td>
    </tr>
</table>  
</form:form>


</body>
</html>