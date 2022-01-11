<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Student</title>
<link rel="stylesheet" href="css/bootstrap.min.css"/>
</head>
<body>
<div class="container">
<h3>List Of Student</h3>
<table class='table table-bordered table-striped'>
<tr>
<th>Student Id</th>
<th>Enrollment Number</th>
<th>Name</th>
<th>Email</th>
<th>Password</th>
<th>Contact</th>
<th>Edit</th>
</tr>
<c:forEach var="student" items="${studentinfo}">
<tr>
<td>${student.studentid}</td>
<td>${student.studenrollment}</td>
<td>${student.studname}</td>
<td>${student.studemail}</td>
<td>${student.studpassword}</td>
<td>${student.studcontact}</td>
<td><a href='EditStudent.jsp?sid="${student.studentid}"'>Edit</a></td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>