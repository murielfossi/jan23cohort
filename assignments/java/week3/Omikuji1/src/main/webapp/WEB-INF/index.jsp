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
<title>Omikuji Form</title>
</head>
<body>
	<div class="container">
		<header>
			<h1>Send an Omikuji!</h1>
		</header>
		<main>
			<form action="/send" method="post">
			
				<div class="one">
					<label>Pick any number from 5 to 25:</label><br>
					<input type="number" name="year" >
				</div><br>
				
				<div class="one">
					<label >Enter the name of any city:</label><br>
					<input type="text" name="city" >
				</div> <br>
				<div class="one" >
					<label >Enter the name of any real person:</label><br>
					<input type="text" name="person" >
				</div><br>
				<div class="one">
					<label >Enter professional endeavor or hobby:</label><br>
					<input type="text" name="hobby" >
				</div><br>
				<div class="one">
					<label >Enter any type of living thing:</label><br>
					<input type="text" name="animal" >
				</div><br>
				<div class="one">
					<label >Say something nice to someone:</label><br>
					<textarea name="compliment"  rows="3"></textarea>
				</div><br>
				<p >Send and show to a friend</p>
				<button class="">Submit</button>
			</form>
		</main>
	</div>
</body>
</body>
</html>