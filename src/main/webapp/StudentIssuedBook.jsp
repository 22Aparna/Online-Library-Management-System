<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Issued Books</title>
<link rel="stylesheet" href="css/bootstrap.min.css"/>
</head>
<body>
<div class='container'>
<h3>Student Issued Books</h3>
<table class='table table-bordered table-striped'>
<tr>
<th>Book Id</th>
<th>Student Id</th>
<th>Issue Date</th>
<th>Return Status</th>
</tr>
<c:forEach var="issueBook" items="${IssueBook}">
<tr>
<td>${issueBook.bookid}</td>
<td>${issueBook.studentid}</td>
<td>${issueBook.issuedate}</td>
<td>${issueBook.returnstatus}</td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>