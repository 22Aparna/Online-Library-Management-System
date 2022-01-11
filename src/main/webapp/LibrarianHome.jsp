<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Librarian Home</title>
<link rel="stylesheet" href="css/bootstrap.min.css"/>
</head>

<body>
<nav class="navbar navbar-inverse">
  	<div class="container">
   
    	<div class="navbar-header">
     		 <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
       		 	<span class="sr-only">Toggle navigation</span>
        	 	<span class="icon-bar"></span>
             	<span class="icon-bar"></span>
             	<span class="icon-bar"></span>
             </button>
             <a class="navbar-brand" href="index.jsp">Online Library</a>
       </div>

    
       <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
     	 	<ul class="nav navbar-nav">
       			<li><a href="index.jsp">Home</a></li>
                <li><a href="AddBookForm.jsp">Add Book</a></li>
                <li><a href="/viewBook">View Book</a></li>
                <li><a href="IssueBookForm.jsp">Issue Book</a></li>
                <li><a href="/viewIssuedBook">View Issued Book</a></li>
                <li><a href="ReturnBookForm.jsp">Return Book</a></li>
                <li><a href="index.jsp">Logout</a></li>
            </ul>
       </div>
  </div>
  
    
     <div class="carousel-inner" role="listbox">
         <div class="item active">
            <img src="images/admm1.jpg" alt="admin1" >
         </div>
    </div>
      
</nav>
</body>
</html>