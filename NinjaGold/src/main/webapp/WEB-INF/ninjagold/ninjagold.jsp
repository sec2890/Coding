<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collections"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/ninjagoldcss.css">
<title>Ninja Gold</title>
</head>
<body>
	<div id="container">
        <div id="header">
            <h2 id="counter">Your Gold: <c:out value="${gold}"/></h2>
        </div>
        <div id="forms">
            <form class="form" action="/goldprocess" method="post">
                <h2 id="location">Farm</h2>
                <h3 id="desc">(earns 10-20 golds)</h3>
                <input type="hidden" name="building" value="farm">
                <button type="submit" class="btn btn-warning">Find Gold!</button>
            </form>
            <form class="form" action="/goldprocess" method="post">
                <h2 id="location">Cave</h2>
                <h3 id="desc">(earns 5-10 golds)</h3>
                <input type="hidden" name="building" value="cave">
                <a href='/process_money'><button type="submit" class="btn btn-warning">Find Gold!</button></a>
            </form>
            <form class="form" action="/goldprocess" method="post">
                <h2 id="location">House</h2>
                <h3 id="desc">(earns 2-5 golds)</h3>
                <input type="hidden" name="building" value="house">
                <a href='/process_money'><button type="submit" class="btn btn-warning">Find Gold!</button></a>
            </form>
            <form class="form" action="/goldprocess" method="post">
                <h2 id="location">Casino</h2>
                <h3 id="desc">(earns/takes 0-50 golds)</h3>
                <input type="hidden" name="building" value="casino">
                <a href='/process_money'><button type="submit" class="btn btn-warning">Find Gold!</button></a>
            </form>
        </div>
        <div id="output">
  			<ul>
		        <% if(session.getAttribute("activities") != null){ %>
       			<% ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities"); %>
       			<% for(int i = 0; i < activities.size(); i++) { %>
       			<% if(activities.get(i).contains("lost")) { %>
       				<li style = "color: red;"><%= activities.get(i) %></li>
       			<% } else { %>
       				<li style = "color: green;"><%= activities.get(i) %></li>
       			<% } %>
       			<% } %>
       			<% } %>
        	</ul>
        </div>
    </div>
</body>
</html>