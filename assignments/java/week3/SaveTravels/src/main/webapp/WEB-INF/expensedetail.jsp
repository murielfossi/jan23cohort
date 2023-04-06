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
<title>Save Travels</title>
</head>
<body>
	<header>
		<h1>Expense Details</h1>
		
	</header>
	<main>
		<table>
			<thead>
			<tr>
				<th>Expense Name &nbsp; &nbsp;</th>
				<th>Expense Description</th>
				<th>Vendor</th>
				<th>Amount Spent</th>
			</tr>
			</thead>
			
			<tbody>
			<tr>
				<td>${expense.expenseName}</td>
				<td>${expense.description}</td>
				<td>${expense.vendor}</td>
				<td>$${expense.amount}</td>
			</tr>
			</tbody>
		</table>
	</main>
	
	<a href="/showexpense"> Go Back</a>
</body>
</html>