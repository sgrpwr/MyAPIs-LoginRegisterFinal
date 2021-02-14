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
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Superman's APIs</title>
    <link href='<spring:url value="/resources/css/Style.css"/>' rel="stylesheet">
    <link href='<spring:url value="/resources/css/bootstrap.min.css"/>' rel="stylesheet">
</head>

<body>
<div class="row">
    <div class="col-sm-4"></div>
    <div class="col-sm-4">
        <form:form action="processRegistration" modelAttribute="objReg">
            <h2 align="center"> User Registration ...</h2>
            <div class="form-group">
                <input:label path="userEmail">Email </input:label>
                <form:input path="userEmail" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <input:label path="userName">User Name  </input:label>
                <form:input path="userName" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <input:label path="password">Password  </input:label>
                <form:password path="password" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <input:label path="country">Country  </input:label>
                <form:select path="country" cssClass="form-control">
                    <form:option value="None" label="--Select--"></form:option>
                    <form:options items="${countryList}"/>
                </form:select>
            </div>
            <div class="form-group">
                <form:label path="gender">Gender </form:label>
                <form:radiobutton path="gender" value="M" label="Male"/>
                <form:radiobutton path="gender" value="F" label="Female"/>
            </div>
            <div class="form-group">
                <input type="submit" value="Register Now" class="form-control btn btn-info login"/>
            </div>
        </form:form>
        <h2>${objReg.msg}</h2>
    </div>
    <div class="col-sm-4"></div>
</div>
    <div align="center">
        <h3>${msg}</h3>
    </div>
</body>
</html>
