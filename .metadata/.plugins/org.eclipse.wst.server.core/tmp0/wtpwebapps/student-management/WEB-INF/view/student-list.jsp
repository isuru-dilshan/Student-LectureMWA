<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/student-management/URLToResourcesFolder/css/my-style-sheet.css">
		
</head>
<body class="myFonts">

<div class="container">
    
    <h1 align="center">Student Management</h1>

   <form action="showAddStudentPage">
     
     <input type="submit" value="INSERT"  class="btn btn-outline-success">
   
   </form>
   
   <br/>
	
	<table  border="0" class="table table-striped">
	<thead>
	    <tr>
	    <td>id</td>
	    <td>name</td> 
	    <td>mobile</td>
	    <td>country</td>
	    </tr>  
	</thead>

 <c:forEach var="student" items="${students }">
   <tr>
	<td> ${student.id} </td>
	<td> ${student.name} </td>
	<td> ${student.mobile} </td>
	<td> ${student.country} </td>
	
	<td><a href="/student-management/updateStudent?userId=${student.id}"> Update </a></td>
	<td><a href="/student-management/deleteStuent?userId=${student.id}" onclick="if(!(confirm('Are you sure you want to delete this student?'))) return false"> Delete </a></td>
   </tr>
	
</c:forEach>
</table>

<img alt="fake students photo" src="/student-management/URLToReachImagesFolder/student.png">


</div>
</body>
</html>