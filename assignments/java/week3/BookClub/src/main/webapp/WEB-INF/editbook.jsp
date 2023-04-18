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
               
               <h1 class="fw-bold mb-5">Change your Entry</h1>

		
		
		<form:form action="/book/${theBook.id}/update" method="post" modelAttribute="bookEditForm" >
		 <input type="hidden" name="_method" value="put "/>i want my book infos to be update in the database (the PUT)
		<input type="hidden" name="user" value="${user_id}" > give me back the user infos stored in session
			<section class="form-outline mb-4">
				<label for="title">Title </label>
				<input type="text" name="title" id="" value="${theBook.title}" class="form-control form-control-lg"/>
				<form:errors path="title" class="text-warning"/>
			</section >
			<section class="form-outline mb-4">
				<form:label path="author">Author</form:label>
				<form:input path="author" type="text" value="${theBook.author}" class="form-control form-control-lg"/>
				<form:errors path="author" class="text-warning" />
			</section>
			<section class="form-outline mb-4">
				<form:label path="thoughts">My Thoughts</form:label>
				<form:input path="thoughts" type="text" value="${theBook.thoughts}" class="form-control form-control-lg"/>
				<form:errors path="thoughts" class="text-warning" />
			</section >
			
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