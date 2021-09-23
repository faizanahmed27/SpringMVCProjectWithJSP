<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./css.jsp"%>
<meta charset="ISO-8859-1">
<title>Login Page!!!</title>
</head>
<body>
<div class="container mt-3">

<form action="login" method="POST">
<table>
<tr>
<td>User Name</td>
<td><input type="text" name="mail"  value=""></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="confirm_password" value=""></td>
</tr>
</table>
<input type="submit" value="login"/>
<a href="index.jsp">Back</a>
</form>

</div>
</body>
</html>