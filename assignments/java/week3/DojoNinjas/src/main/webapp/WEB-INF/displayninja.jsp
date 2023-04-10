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
               
               <h1 class="fw-bold mb-5">New Ninja:</h1>

		
		
		    	<form:form action="/createninja" method="post" modelAttribute="ninjaForm">
			<section class="form-outline mb-4">
				<label for="firstName">First Name</label>
				<input type="text" name="firstName"  class="form-control form-control-lg"/>
				<form:errors path="firstName" class="text-warning"/>
			</section>
			<section class="form-outline mb-4">
				<label for="lastName">Last Name</label>
				<input type="text" name="lastName" class="form-control form-control-lg"/>
				<form:errors path="lastName" class="text-warning"/>
			</section>
			<section class="form-outline mb-4">
				<label for="age">Age</label>
				<input type="number" name="age" class="form-control form-control-lg"/>
				<form:errors path="age" class="text-warning"/>
			</section>
			
			<section class="form-outline mb-4">
				<label for="dojoName">Dojo Name</label>
				<select name="dojoName"  class="form-control form-control-lg">
					<c:forEach var="d" items="${ allDojos }">
						<option value="${ d.id }">${ d.dojoName }</option>
					</c:forEach>
				</select>
			</section>
			<button  class="btn btn-primary mt-3">Submit</button><br><br>
		</form:form>
		
			<button class="btn btn-outline-primary"><a href="/showdojoninja/${d.id}">Show dojo  ninja</a></button>
		  </div>
       </div>
     </div>
    </div>	
   </div>	
</div>
</body>
</html>