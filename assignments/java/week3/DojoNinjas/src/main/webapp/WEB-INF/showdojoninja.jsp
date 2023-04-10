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
			<h1>${ viewDojo.dojoName } Location Ninjas</h1>
		<nav>
			<a href="/">Home</a>
			<a href="/displaydojo">Add Dojo</a>
			<a href="/displayninja">Add Ninja</a>
		</nav>
	</header>
    <main>
    	<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
			</tr>
			<c:forEach var="n" items="${viewDojo.ninjas}" >
				<tr>
					<td>${ n.firstName }</td>
					<td> ${ n.lastName }</td>
					<td>${ n.age }</td>
				</tr>
			</c:forEach>
		</table>
	
    </main>
	</div>
</body>
</html>