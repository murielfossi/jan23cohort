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


		
<div class="intro">
    <div class="mask d-flex align-items-center h-100" style="background-color: #f5f5f5;;">
       <div class="container">
         <div class="row justify-content-center">
            <div class="col-12 col-md-8 col-lg-5 col-xl-5">
               <div class="my-md-5 pb-5">   
               
               <h1 class="fw-bold mb-5">Add a Burger:</h1>

		
		
		<form:form action="/update/${burger.id}" method="post" modelAttribute="burgerEditForm" >
		
			<section class="form-outline mb-4">
				<label for="burgerName">Burger Name: </label>
				<input type="text" name="burgerName" id="" value="${burger.burgerName}" class="form-control form-control-lg"/>
				<form:errors path="burgerName" class="text-warning"/>
			</section >
			<section class="form-outline mb-4">
				<form:label path="restaurantName">Restaurant Name: </form:label>
				<form:input path="restaurantName" type="text" value="${burger.restaurantName}" class="form-control form-control-lg"/>
				<form:errors path="restaurantName" class="text-warning" />
			</section>
			<section class="form-outline mb-4">
				<form:label path="rating">Rating :</form:label>
				<form:input path="rating" type="number" value="${burger.rating}" class="form-control form-control-lg"/>
				<form:errors path="rating" class="text-warning" />
			</section >
			<section class="form-outline mb-4">
				<form:label path="notes">Notes: </form:label>
				<form:input path="notes" type="text" value="${burger.notes}" class="form-control form-control-lg"/>
				<form:errors path="notes" class="text-warning" />
			</section>
			<button class="btn btn-primary mt-3">Update</button>
		</form:form><br><br>
		
		
		  </div>
       </div>
     </div>
    </div>	
   </div>	
</div>
</body>
</html>