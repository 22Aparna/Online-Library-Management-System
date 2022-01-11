<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home</title>
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
        		<li><a href="AddLibrarianForm.jsp">Add Librarian</a></li>
       		    <li><a href="/viewLibrarian">View Librarian</a></li>
       		    <li><a href="DeleteLib.jsp">Delete Librarian</a></li>
        		<li><a href="AddStudentForm.jsp">Add Student</a></li>
        		<li><a href="/viewStudent">View Student</a></li>
        		<li><a href="index.jsp">Logout</a></li>
       		</ul>
      </div>
  </div>
</nav>
   
      <div class="carousel-inner" role="listbox">
      		<div class="item active">
       			 <img src="images/admin 21.jpg" alt="admin" >
      		</div>
       </div>

</body>
</html>