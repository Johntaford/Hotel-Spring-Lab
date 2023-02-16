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
	<h1>Search Results</h1>
	<c:if test="${not empty hotels}">
		<p>Hotels in ${city}:</p>
		<table>
			<tr>
				<th>Name</th>
				<th>City</th>
				<th>Price per Night</th>
				<th>Max Capacity</th>
				<th>Available</th>
			</tr>
			<c:forEach items="${hotels}" var="hotel">
				<tr>
					<td>${hotel.name}</td>
					<td>${hotel.city}</td>
					<td>${hotel.pricePerNight}</td>
					<td>${hotel.maxCapacity}</td>
					<td>${hotel.available ? 'Yes' : 'No'}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	<c:if test="${empty hotels}">
		<p>No hotels found in ${city}.</p>
	</c:if>
	<a href="/">Back to Home</a>

</body>
</html>