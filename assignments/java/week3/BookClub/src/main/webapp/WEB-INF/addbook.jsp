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
               
               <h1 class="fw-bold mb-5">Add a Book to Your Shelf!</h1>
               
               		
		<nav class="d-flex flex-column justify-content-around align-items-end">
             <a href="/dashboard">back to the shelves</a>
        </nav>
        
          
               
            <form:form action="/createbook" method="post" modelAttribute="addbookForm" >
		<input type="hidden" name="user" value="${user_id}" > 
		 
		<!--le input type hidden me permet detablir une relation entre le user et le book ,je vais pull le nom du ser qui est store en session pour que posted by ai une valeur qui est le nom de celui qui est en ligne
		le input ci permet d'appeler facilement  ${ b.user.username }qui se troube dansle dashbord.jsp-->
		
			<section class="form-outline mb-4">
				<label for="title">Title </label>
				<input type="text" name="title" id="" class="form-control form-control-lg"/>
				<form:errors path="title" class="text-warning"/>
			</section >
			<section class="form-outline mb-4">
				<form:label path="author">Author </form:label>
				<form:input path="author" type="text" class="form-control form-control-lg"/>
				<form:errors path="author" class="text-warning" />
			</section>
			<section class="form-outline mb-4">
				<form:label path="thoughts">My thoughts</form:label>
				<form:input path="thoughts" type="decimal" class="form-control form-control-lg"/>
				<form:errors path="thoughts" class="text-warning" />
			</section >
			
			<button class="btn btn-primary mt-3">Submit</button>
		</form:form><br><br>
		
	
		  </div>
       </div>
     </div>
    </div>	
   </div>	
</div>
</body>
</html>