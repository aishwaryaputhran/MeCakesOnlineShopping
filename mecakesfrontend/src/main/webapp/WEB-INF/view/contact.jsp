<%@include file="navbar.jsp"%>

<!doctype html>
<html lang="en">
<head>
<c:url value="/resources/bckgrnd"  var="img"/>
<c:url value="/resources/css"  var="css"/>
<c:url value="/resources/js"  var="js"/>

<title>ME CAKES</title>
 <link rel="stylesheet" href="${css}/bootstrap.min.css">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
   <script src="${js}/jquery.min.js"></script>
  <script src="${js}/bootstrap.js"></script>
<style>

body {
    background-color: lightblue;
}
<!-- navbar active -->
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover:not(.active) {
    background-color: #111;
}

.active {
    background-color: #4CAF50;
}
</style>
</head>
<body background="${img}/contact.jpg">
<!-- header -->
<div class="w3-container">
   <h2><center>ME</center></h2>
  <h1><center>CAKES</center></h1>
  <CENTER> <i class="fa fa-birthday-cake" style="font-size:58px;color:red"></i></CENTER>
 <br>
</div>


<!-- images-->
<center>
<img src="${img}/c.jpg" align="middle"  width="800px">
</center>

<!-- contact info -->
<p><center><strong><font size="10">CONTACT</font></strong></center></p>
<p><center><font size="5">Click here to add your own text </font></center></p>

<!-- boxes allignment -->
<center>
<div class="container">
    <div class="row">
	<div class="col-sm-4">
	</div>
	
	 <form action="C:\Documents and Settings\USER\Desktop\aaa\me.pptx" method="get">
   
   <div class="col-sm-4">
   <strong>Name:</strong><br>
<input type="text" name="Name" size="45">
<br>
<br>
 
   <strong> E-mail:</strong><br>
<input type="text" name="E-mail" size="45">
   </div>
   
   <div class="col-sm-4">
    </div>
	</form>
</div>
</div>
<br>
<br>

<!-- subject box-->
<center>
 <form action="C:\Documents and Settings\USER\Desktop\aaa\me.pptx" method="get">
  <strong>Subject:</strong><br>
<input type="text" name="Subject" size="45">
</form>
</CENTER>
<br>
<br>

<!-- message box-->
<center>
<strong>MESSAGE:</strong><br>
<textarea rows="4" cols="50">
</textarea>
</center>
<br>
<br>

   
	<center>
	<button type="button" class="btn btn-primary btn-lg"><STRONG>SEND</STRONG></button>
    </center>
<BR>
<BR>
<br>

<!-- like buttons-->
<center>
	<button style="font-size:24px">like <i class="fa fa-thumbs-o-up"></i></button>

	<button style="font-size:24px">unlike <i class="fa fa-thumbs-o-down"></i></button>
     </center>

<!-- paragraph -->
<p><strong><center>650.11.4297</center></strong></p>
<p><strong><center>info@MECAKE.com</center></strong></p>
<p><strong><center>104,avenue road</center></strong></p>
<p><strong><center>Bangalore 560081</center></strong></p>



</body>
</html>