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
<title>Read Share</title>
</head>
<body>


		
<div class="intro">
    <div class="mask d-flex align-items-center h-100" style="background-color: #f5f5f5;;">
       <div class="container">
         <div class="row justify-content-center">
            <div class="col-12 col-md-8 col-lg-5 col-xl-5">
               <div class="my-md-5 pb-5">   
               
            
         <div class="fw-bold mb-5">
            <h1>${ theCourse.coursename }</h1>
            
           <c:if test="${ user_id == theCourse.user.id }">
	    	    <h4><span>(added ${ theCourse.user.username }) </span> 
	             </c:if>
	    
	              <p>Gender: ${ theCourse.gender }</p>
	              <p>Origin: ${theCourse.origin }</p>
	    
	              <p>Meaning: ${ theCourse.meaning }</p>
	              
	             <button class="btn btn-outline-primary"><a href="/course/${ theCourse.id }/editcourse">edit</a></button>
		         <button class="btn btn-outline-primary"><a href="/course/${ theCourse.id }/delete">delete</a></button>
        </div>
		
		<nav class="end">
            <a href="/dashboard">back to the dashboard</a>
        </nav>
        
        
           
        		
        		
        	
		
		         
		  </div>
       </div>
     </div>
    </div>	
   </div>	
</div>
</body>
</html>