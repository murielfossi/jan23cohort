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
<title>Edit Expense</title>
</head>
<body>


		
<div class="intro">
    <div class="mask d-flex align-items-center h-100" style="background-color: #f5f5f5;;">
       <div class="container">
         <div class="row justify-content-center">
            <div class="col-12 col-md-8 col-lg-5 col-xl-5">
               <div class="my-md-5 pb-5">   
               
               <h1 class="fw-bold mb-5">Edit your Expense here:</h1>

		
		
		<form:form action="/update/${expense.id}" method="post" modelAttribute="expenseEditForm" >
		<input type="hidden" name="_method" value="put"/>
		
				<section class="form-outline mb-4">
				<label for="expenseName">Expense Name: </label>
				<input type="text" name="expenseName" id="" value="${expense.expenseName}" class="form-control form-control-lg"/>
				<form:errors path="expenseName" class="text-warning"/>
			</section >
			<section class="form-outline mb-4">
				<form:label path="vendor">vendor: </form:label>
				<form:input path="vendor" type="text"  value="${expense.vendor}" class="form-control form-control-lg"/>
				<form:errors path="vendor" class="text-warning" />
			</section>
			<section class="form-outline mb-4">
				<form:label path="amount">amount :</form:label>
				<form:input path="amount" type="decimal" value="${ expense.amount}" class="form-control form-control-lg"/>
				<form:errors path="amount" class="text-warning" />
			</section >
			<section class="form-outline mb-4">
				<form:label path="description">Description: </form:label>
				<form:input path="description" type="text" value="${ expense.description}"  class="form-control form-control-lg"/>
				<form:errors path="description" class="text-warning" />
			</section>
			<button class="btn btn-primary mt-3">Update</button>
		</form:form><br><br>
		
		<button class="btn btn-outline-primary"><a href="/showexpense"> Go Back</a></button>
		
		  </div>
       </div>
     </div>
    </div>	
   </div>	
</div>
</body>
</html>