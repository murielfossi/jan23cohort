<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header>
		<h1>Hello, ${name}</h1>
	</header>
	
	<main>
	   
	    <h3>your IceCream flavor is: </h3> <c:out value="${flavor}"/> 
	    
	    <ul>
	      <h3> your favorite destinations are:</h3> <c:forEach var="loc" items="${ allCities }">
	         <li>${ loc } </li>
	      </c:forEach>
	    </ul>
	    
	    <h1> Thank you <c:out value="${name}"/> for your visit</h1>
	
	</main>
</body>
</html>