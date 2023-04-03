<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Date</title>
</head>
<body >
	<header >
	<!-- <h1><p>The time is: <%= new Date() %></p></h1>  this one one work too but i want a formatting one display only the date. here is the util for this code import="java.util.Date"-->
	<h1> <c:out value="${striDate}"/></h1>
		
	</header>
</body>
</html>