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
<title>Stickers and Categories</title>
</head>
<body>
	<header>
		<h1>Our Stickers and Categories</h1>
		<nav>
			<a href="/">Home</a>
			<a href="/addCategory">Add Category</a>
			<a href="/addSticker">Add Sticker</a>
			<a href="/chooseCat">Choose Category</a>
		</nav>
	</header>
	<main>
		<form:form action="/createCat" method="post" modelAttribute="catForm">
			<section>
				<label for="name">Category Name</label>
				<input type="text" name="name" />
				<form:errors path="name" class="text-warning"/>
			</section>
			<button>Add Category</button>
		</form:form>
	</main>
	<footer>
		<h3>Stickers and Categories</h3>
	</footer>
</body>
</html>