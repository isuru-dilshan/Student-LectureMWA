<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/student-management/URLToResourcesFolder/css/add-student.css">
<link rel="stylesheet" type="text/css" href="/student-management/URLToResourcesFolder/css/my-style-sheet.css">

</head>
<body >

<div align="center">

<h1>Add Student</h1>
<br/>
 <!-- create a html form where the user can enter data -->

<form:form action="save-student" modelAttribute="student" method="POST">
    
    <form:hidden path="id"/>
    
    <label>Name :</label>
    <form:input path="name"/>
    
    <br/>
    <br>
    <label>Mobile :</label>
    <form:input path="mobile"/>
    
    <br/>
    <br>
    <label>Country :</label>
    <form:input path="country"/>
    
    <br/>
    <br/>
    <br/>
    <input type="submit" value="Submit" class="btn btn-outline-warning">
    

</form:form>
</div>



</body>
</html>