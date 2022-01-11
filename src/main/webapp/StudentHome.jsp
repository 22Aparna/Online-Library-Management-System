<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Home</title>
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
      		<li><a href="StudentProfile.jsp">Profile</a></li>
            <li><a href="/viewBooks">View Book</a></li>
            <li><a href="StudentIdForm.jsp">View Issued Book</a></li>
            <li><a href="index.jsp">Logout</a></li>
       </ul>
     </div>
  </div>
  
  
    <div class="carousel-inner" role="listbox">
      	<div class="item active">
        	<img src="images/stud3.jpg" alt="stud" >
       </div>
    </div>
</nav>

</body>
</html>