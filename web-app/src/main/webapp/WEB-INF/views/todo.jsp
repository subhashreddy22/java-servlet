<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<p style="color: blue;">Welcome</p>
	<div>
		Your todos
		<ol>
			<c:forEach items="${todos}" var="todo">
				<li>${todo.name}</li>
			</c:forEach>
		</ol>
	</div>
</body>
</html>