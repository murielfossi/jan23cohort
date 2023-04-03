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
	<header>
		<h1>Fruit Store</h1>
		<table class="table">
		<tbody>
			<tr>
				<th>Name</th>
				<th>Price</th>
			</tr>
			<tr>
				<td>
				     <c:forEach var="fruit" items="${allFruits}">
	       			 <p><c:out value="${fruit.name}"></c:out></p>
	   			     </c:forEach>
	   			 </td>
	   			 <td>
	   			     <c:forEach var="fruit" items="${allFruits}">
	       			 <p><c:out value="${fruit.price}"></c:out></p>
	   			     </c:forEach>
	   			 </td>
			</tr>
		</tbody>
		</table>
	</header>
</body>
</html>