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
               
               <!-- <h1 class="fw-bold mb-5">Welcome,${ user.username } </h1> -->
         <div class="fw-bold mb-5">
            <h1>Welcome, ${theUser.username}</h1>
            <p>Books from everyone's shelves:</p>
        </div>
		
		<nav class="d-flex flex-column justify-content-around align-items-end">
            <a href="/logout">Logout</a>
            <a href="/addbook">+ Add to my shelf!</a>
        </nav>
        
        
        		<table class="table">
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Author Name</th>
				<th>Posted By</th>
			</tr>
			<c:forEach items="${allBooks}" var="b">
		        <tr>
		            <td>${b.id}</td>
		            <td> <a href="/book/${ b.id }/viewbook">${ b.title }</a></td>
		            <td>${ b.author }</td>
					<td>${ b.user.username }</td>
		        </tr>
		        
		       
		    </c:forEach>
		</table>
		
		         <!--  <td><p><a href="/edit/${b.id}">edit</a> | <a href="/delete/${b.id}">delete</a></p></td> this one work but i prefer the one with he button-->
		  </div>
       </div>
     </div>
    </div>	
   </div>	
</div>
</body>
</html>