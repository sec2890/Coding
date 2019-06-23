<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><c:out value="${language.name}"/></title>
</head>
<body>
	<div id="container">
	<div id="top">
		<a href="/languages"><h1>Dashboard</h1></a>
	</div>
		<h1><c:out value="${language.name}"/></h1>
		<h1><c:out value="${language.creator}"/></h1>
		<h1><c:out value="${language.currentVersion}"/></h1>
		<a href="/languages/edit/<c:out value="${language.id}"/>"><h1>Edit</h1></a>
		<a href="/languages/delete/<c:out value="${language.id}"/>"><h1>Delete</h1></a>
	</div>
</body>
</html>