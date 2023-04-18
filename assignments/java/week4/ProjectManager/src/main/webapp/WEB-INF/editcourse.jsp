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
<title>Create a Task</title>
</head>
<body>


		
<div class="intro">
    <div class="mask d-flex align-items-center h-100" style="background-color: #f5f5f5;;">
       <div class="container">
         <div class="row justify-content-center">
            <div class="col-12 col-md-8 col-lg-5 col-xl-5">
               <div class="my-md-5 pb-5">   
               
               <h1 class="fw-bold mb-5">Change ${ theCourse.coursename }</h1>

		
	            <form:form action="/course/${theCourse.id}/update" method="post" modelAttribute="courseEditForm" >
		 <input type="hidden" name="_method" value="put"/>i want my book infos to be update in the database (the PUT)
		<input type="hidden" name="user" value="${user_id}" > give me back the user infos stored in session
		 
		<!--le input type hidden me permet detablir une relation entre le user et le book ,je vais pull le nom du ser qui est store en session pour que posted by ai une valeur qui est le nom de celui qui est en ligne
		le input ci permet d'appeler facilement  ${ b.user.username }qui se troube dansle dashbord.jsp-->
		
		
			<section class="form-outline mb-4">
				<form:label path="coursename">New Name: </form:label>
				<form:input path="coursename" type="text"  id="" value="${theCourse.coursename}" class="form-control form-control-lg"/>
				<form:errors path="coursename" class="text-warning"/>
			</section >
		
		
		
		
			
			
			<section  class="form-outline mb-4">
			     
			      <form:label for="gender" path="gender">Typical Gender:</form:label>
			      
                       <form:select path="gender" class="form-select" value="${theCourse.gender}">
                       
                       <form:option value="neutral" label="neutral" />
                       <form:option value="Female" label="Female" />
                       <form:option value="male" label="Male" />
                       </form:select>
			      <form:errors path="origin" class="text-warning" />
                   
      
			</section>
			


			
			
			
			<section class="form-outline mb-4">
				<form:label path="origin">Origin: </form:label>
				<form:input path="origin" type="text" value="${theCourse.origin}" class="form-control form-control-lg"/>
				<form:errors path="origin" class="text-warning" />
			</section>
			
			
			<section class="form-outline mb-4">
				<form:label path="meaning">Meaning: </form:label>
				<form:input path="meaning" type="decimal" value="${theCourse.meaning}" class="form-control form-control-lg"/>
				<form:errors path="meaning" class="text-warning" />
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