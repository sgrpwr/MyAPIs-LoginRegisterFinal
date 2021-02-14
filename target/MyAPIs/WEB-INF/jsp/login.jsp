<%--
  Created by IntelliJ IDEA.
  User: sagar.p202178
  Date: 1/31/2021
  Time: 3:52 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
    <title>Superman's APIs</title>
    <link href='<spring:url value="/resources/css/Style.css"/>' rel="stylesheet">
    <link href='<spring:url value="/resources/css/bootstrap.min.css"/>' rel="stylesheet">
</head>

<body>
<div style="margin: 90px auto">
    <form action="login-panel" modelAttribute="objUser">
        <h2 align="center">Login Here ...</h2>
        <div id="box">
            <input type="text" placeholder="Username" name="userName" class="form-control"/><br>
            <input type="password" placeholder="Password" name="userPasswd" class="form-control"/><br>
            <input type="submit" value="Login" class="btn btn-info login" name="action"/>
            <input type="submit" value="Register Now" class="btn btn-info login" name="action"/>
            Forgot <a href="#"> password? </a>
        </div>
        </form>
</div>
    <div align="center">
        <div class="alert alert-danger">
            <strong>${msg}</strong>
        </div>
    </div>
</body>
</html>
