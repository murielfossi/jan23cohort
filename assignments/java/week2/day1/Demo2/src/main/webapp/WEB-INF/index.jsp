<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<header>
		<h1>Hello</h1>
	</header>
	<main>
	<h4>Here is the number of time me, <c:out value="${OwnerName}"/> the owner of this Website will offer you a trip</h4>
	 <% for(int i = 0; i < 5; i++) { %>
        <h1><%= i %></h1>
    <% } %>
 
	
	</main>
</body>
</html>