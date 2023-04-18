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
<title>Project Manager Dashboard</title>
</head>
<body>


		
<div class="intro">
    <div class="mask d-flex align-items-center h-100" style="background-color: #f5f5f5;;">
       <div class="container">
         <div class="row justify-content-center">
            <div class="col-12 col-md-8 col-lg-5 col-xl-5">
               <div class="my-md-5 pb-5">   
               
               <!-- <h1 class="fw-bold mb-5">Welcome,${ user.username } </h1>   <td>${ c.user.username }</td> -->
         <div class="fw-bold mb-5">
            <h1>Hello, ${theUser.username}. Here are some suggestions..</h1>
            
        </div>
		
		<nav class="d-flex flex-column justify-content-around align-items-end">
            <a href="/logout">Logout</a>
        </nav>
        
        
        		<table class="table">
			<tr>
				<th>Coursename</th>
				<th>Gender</th>
				<th>Origin</th>
				<th>Meaning</th>
			</tr>
			<c:forEach items="${allCourses}" var="c">
		        <tr>
		            <td> <a href="/course/${ c.id }/viewcourse">${c.coursename} </td></a>
		            <td>  ${ c.gender }</td>
		            <td>${ c.origin }</td>
		            <td>${ c.meaning }</td>
					
		        </tr>
		        
		       
		    </c:forEach>
		</table>
		         
		         <button class="btn btn-outline-primary"><a href="/addcourse"> < new name</a></button>
		  </div>
       </div>
     </div>
    </div>	
   </div>	
</div>
</body>
</html>