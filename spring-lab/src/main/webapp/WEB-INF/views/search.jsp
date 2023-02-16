<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hotel Search</title>
</head>
<body>
	<h1>Search for Hotels</h1>
	<form action="search" method="post">
		<label for="city">City:</label>
		<select name="city">
			<c:forEach items="${cities}" var="city">
				<option value="${city}">${city}</option>
			</c:forEach>
		</select>
		<br><br>
		<input type="submit" value="Search">
	</form>
</body>
</html>