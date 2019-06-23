<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Welcome User</title>
	<style>
		*{
			margin: 0px;
			padding: 0px;
			font: inherit;
		}
		.container{
			margin: auto;
			text-align: center;
			margin-top: 100px;
		}
		fieldset{
			width: 320px;
			padding: 10px;
			height: 120px;
			margin: auto;
			text-align: center;
		}

		legend{
			font: 20pt, sans-serif;
			text-align: left;
			padding: 5px;
		
		}
		p{
			font: 15pt, sans-serif;
			padding-bottom: 20px;
		}
		.container a{
			margin-left: 100px;
			margin-right: 100px;
			font:8pt,  sans-serif;
		}
	</style>
	</head>
	<body>
		<div class="container">
			<fieldset>
			<legend>Counter</legend>
			<% Integer count = (Integer) session.getAttribute("count"); %>
			<p>You have visited the Home page <c:out value="${count}"/> times.</p>
			<a href="/reset">Reset</a>
			<a href="/two">+2</a>
			<a href="/">Test another visit?</a>
			</fieldset>
		</div>
	</body>
</html>