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
               
               <h1 class="fw-bold mb-5">Welcome</h1>
               <h3> Register Here !!!!</h3>

		
		
	
    	<form:form action="/register" method="POST" modelAttribute="newUser">
				<section  class="form-outline mb-4">
					<form:label path="username"> Username </form:label>
					<form:input type="text"  path="username" class="input form-control form-control-lg"/>
					<form:errors path="username" class="text-danger" />
				</section>
				<section  class="form-outline mb-4">
					<form:label path="email">Email</form:label>
					<form:input type="email"  path="email"  class=" input form-control form-control-lg"/>
					<form:errors path="email" class="text-danger" />
				</section>
				<section  class="form-outline mb-4">
					<form:label path="password">Password</form:label>
					<form:input type="password" path="password"  class=" input form-control form-control-lg"/>
					<form:errors path="password" class="text-danger" />
				</section>
				<section  class="form-outline mb-4">
					<form:label path="confirmPassword">Confirm Password</form:label>
					<form:input type="password"  path="confirmPassword"  class=" input form-control form-control-lg"/>
					<form:errors path="confirmPassword" class="text-danger" />
				</section>
				<button class="btn btn-primary">Register and Login</button><br><br>
			</form:form>
			
			
			<form:form action="/login" method="POST" modelAttribute="newLogin">
				<section  class="form-outline mb-4">
					<form:label path="email">Email</form:label>
					<form:input type="email"  path="email" class=" input form-control form-control-lg"/>
					<form:errors path="email" class="text-danger" />
				</section>
				<section  class="form-outline mb-4">
					<form:label path="password">Password</form:label>
					<form:input type="password" path="password" class=" input form-control form-control-lg" />
					<form:errors path="password" class="text-danger" />
				</section>
				<button class="btn btn-primary">Login</button>
			</form:form>
		
		
		
		  </div>
       </div>
     </div>
    </div>	
   </div>	
</div>
</body>
</html>