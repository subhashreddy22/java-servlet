<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p style="color: red;">${errorMessage}</p>
<form action="/login.do" method="post">
		Name:<input name="name" type="text"> Password:<input
			name="password" type="password"><input type="submit" value="Login">
</form>
</body>
</html>