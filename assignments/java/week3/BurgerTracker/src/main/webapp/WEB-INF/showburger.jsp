<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- for forms -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!-- for validation -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" type="text/css" href="/css/style.css">
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="top-container">
		<h1>Burger Tracker</h1>
		
		<table class="table">
			<tr>
				<th>Burger Name</th>
				<th>Restaurant Name</th>
				<th>Rating (out of 5)</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${allBurgers}" var="b">
		        <tr>
		            <td>${b.burgerName}</td>
		            <td>${b.restaurantName}</td>
		            <td>${b.rating}</td>
		            <td><p><a href="/edit/${b.id}">edit</a> | <a href="/delete/${b.id}">delete</a></p></td>
		        </tr>
		    </c:forEach>
		</table>
	</div>
</body>
</html>