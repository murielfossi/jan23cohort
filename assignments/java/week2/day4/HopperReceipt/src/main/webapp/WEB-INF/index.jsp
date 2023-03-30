<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hopper Receipt</title>
</head>
<body>
	<header>
		<h1>Hoper Receipt infos</h1>
	</header>
	
	<main>
	   
	    <h3>Chef name: </h3> <c:out value="${name}"/> 
	    
	    <ul>
	       <h3> Item Name: </p> <c:out value="${itemName}"></c:out>
	       <h3> Price: </h3> <c:out value="${price}"> </c:out>
	       <h3> Description: </h3> <c:out value="${description}"> </c:out>
	       <h3> Vendor: </h3> <c:out value="${vendor}"> </c:out>
	        
	    </ul>
	    
	
	</main>
</body>
</html>