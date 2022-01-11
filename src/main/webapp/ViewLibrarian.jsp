<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view Librarian</title>
<link rel="stylesheet" href="css/bootstrap.min.css"/>
</head>

<body>
<div class='container'>
<h3>List Of Librarian</h3>
<table class='table table-bordered table-striped'>
<tr>
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Password</th>
<th>Contact</th>
<th>Edit</th>
</tr>
<c:forEach var="user" items="${librarianinfo}">
<tr>
<td>${user.libid}</td>
<td>${user.libname}</td>
<td>${user.libemail}</td>
<td>${user.libpassword}</td>
<td>${user.libcontact}</td>
<td><a href='EditLibrarianForm.jsp?lid="${user.libid}"'>Edit</a></td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>