<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/cssone.css">
<title>Dojo Survey Index</title>
</head>
<body>
	<div id="container">
		<form action="/result" method="post">
			<h2>Your Name: <input class="formfields" type="text" name="name"></h2>
			<h2>Dojo Location: <select class="formfields" name="location"></h2>
				  <option value="Berkley">Berkley</option>
				  <option value="San Jose">San Jose</option>
  				  <option value="Los Angeles">Los Angeles</option>
				  </select>
			<h2>Favorite Language: <select class="formfields" name="language"></h2>
				  <option value="Java">Java</option>
				  <option value="Python">Python</option>
				  <option value="MEAN">MEAN</option>
				  </select>
				<h2>Comment (optional):</h2>
			<h2><input class="formfieldscomment" type="textarea" name="comment"></h2>
			<h2><input class="formfieldsbutton" type="submit" value="Submit"></h2>
		</form>
	</div>
</body>
</html>