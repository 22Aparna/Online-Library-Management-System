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
	     </div>
 </header>

<!-- -------------------------------------------Body------------------------------------------------------------- -->		
 <section>
	 <div class="reg_img"><br><br><br>
		   <div class="box2"><br><br><br>
				 <h1 style="text-align: center; font-size: 30px;">Add Book</h1><br>
				
				    <form name="Login" action="/addBook" method="post">
                     	<div class="login">
                     	      <input class="form-control" type="text" name="bookcallno" placeholder="Call No" > <br><br>
                     	     <input class="form-control" type="text" name="bookname" placeholder="Name" > <br><br>
                     	     <input class="form-control" type="text" name="bookauthor" placeholder="Author" > <br><br>
                     	     <input class="form-control" type="text" name="bookpublisher" placeholder="Publisher" > <br><br>
                     	      <input class="form-control" type="text" name="bookcopies" placeholder="Copies" > <br><br>
                     	     <input class="btn btn-default" type="submit" name="submit" value="Save Book " style="color: black; width:90px;height:30px">
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