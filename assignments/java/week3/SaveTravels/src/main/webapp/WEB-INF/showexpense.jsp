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
		<h1>Save Travels</h1>
		
		<table class="table">
			<tr>
				<th>Expense</th>  
				<th>Vendor</th>
				<th>Amount </th>
				<th>Action</th>
			</tr>
			<c:forEach items="${allExpenses}" var="e">
		        <tr>
		            <td><a href="/expensedetail/${e.id}">${e.expenseName} </a></td>
		            <td> ${e.vendor}</td>
		            <td> $${e.amount}</td>
		            
		            <td><p><a href="/edit/${e.id}">edit</a> | <a href="/delete/${e.id}">delete</a></p></td>
		        </tr>
		    </c:forEach>
		</table>
		<a href="/"> Home</a>
	</div>
	
</body>
</html>