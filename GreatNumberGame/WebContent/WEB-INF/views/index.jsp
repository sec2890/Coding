<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/cssone.css">
<title>Great Number Game</title>
</head>
<body>
	<div id="container">
		<h1>Welcome to the Great Number Game!</h1>
		<h3>I am thinking of a number between 1 and 100.</h3>
		<h3>Take a guess!</h3>
		<div id="indicator">
			<% String theResponse = (String) session.getAttribute("response");
				if(theResponse == "correct"){ %>
					<div id="correct">
						<h1 class="padding">Correct!</h1>
						<a href="Reset"><button>Play again!</button></a>
					</div>
			<% } else if(theResponse == "low"){%>
	
					<div id="low">
						<h1 class="padding">Too low!</h1>
					</div>
			<% } else if(theResponse == "high"){ %>
					<div id="high">
						<h1 class="padding">Too high!</h1>
					</div>
			<% } %>
		</div>
		<form action="/GreatNumberGame/Index" method="post">
			<p><input type="text" name="guess"></p>
			<p><input type="submit" value="Submit"></p>
		</form>	
	</div>
</body>
</html>