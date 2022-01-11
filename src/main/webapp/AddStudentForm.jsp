<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Home</title>
	<link rel="stylesheet" href="css/bootstrap.min.css"/>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body>
<!-- -------------------------------------------Header----------------------------------------------------------- -->	
  <header>
		 <div class="navbar">
			 <div class="logo">
	        	   <h1 style="color: white;">ONLINE LIBRARY MANAGEMENT SYSTEM</h1>
			 </div>
	   
			    <nav>
				     <ul>
					     <li><a href="index.jsp"></a></li>
					 </ul>
			    </nav>
	      </div>
 </header>
<!-- -------------------------------------------Body----------------------------------------------------------- -->		
 <section>
	 <div class="reg_img"><br><br><br>
		   <div class="box2"><br><br><br>
				 <h1 style="text-align: center; font-size: 30px;">Registration Form</h1><br>
				
				    <form name="login" action="/addStudent" method="post">
                     	<div class="login">
                     	      <input class="form-control" type="text" name="studenrollment" placeholder="Enrollment No" > <br><br>
                     	        <input class="form-control" type="text" name="studname" placeholder="Name" > <br><br>
                     	     <input class="form-control" type="text" name="studemail" placeholder="Email Id"> <br><br>
                     	     <input class="form-control" type="password" name="studpassword" placeholder="Password"> <br><br>
                     	     <input class="form-control" type="text" name="studcontact" placeholder="Mobile No" > <br><br>
                     	     <input class="btn btn-default" type="submit" name="submit" value="Submit" style="color: black; width:70px;height:30px">
                        </div>   
                    </form>
		      </div>
	    </div>
</section>
<!-- -------------------------------------------Body----------------------------------------------------------- -->
		
<!-- -------------------------------------------Footer----------------------------------------------------------- -->
		<footer>
			    <p style="color:white;  text-align: center; "><br><br>
				    Email: Online.library@gmail.com <br>
				    Mobile: +88018********
				</p>
	    </footer>
<!-- -------------------------------------------Footer----------------------------------------------------------- -->	    
</body>
</html>