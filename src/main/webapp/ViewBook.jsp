<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Books</title>
<link rel="stylesheet" href="css/bootstrap.min.css"/>
</head>

<body>
<div class='container'>
<h3>List Of Books</h3>
<table class='table table-bordered table-striped'>
<tr>
<th>Book Id</th>
<th>call Number</th>
<th>Name</th>
<th>Author</th>
<th>Publisher</th>
<th>Copies</th>
<th>Issued</th>
</tr>
<c:forEach var="book" items="${bookinfo}">
<tr>
<td>${book.bookid}</td>
<td>${book.bookcallno}</td>
<td>${book.bookname}</td>
<td>${book.bookauthor}</td>
<td>${book.bookpublisher}</td>
<td>${book.bookcopies}</td>
<td>${book.bookissued}</td>
</tr>
</c:forEach>
</table>
</div>

</body>
</html>