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
<body background="${img}/l.jpg">
<!-- header -->
<div class="w3-container">
   <h2><center>ME</center></h2>
  <h1><center>CAKES</center></h1>
  <CENTER> <i class="fa fa-birthday-cake" style="font-size:58px;color:red"></i></CENTER>
 <br>
</div>



<body>
<center>
<h2>LOG IN AND CONTINUE CAKING</h2>
</center>
<br>

<!-- form -->
<div class="container">
    <div class="row">
    <div class="col-sm-4">
	</div>
	
	<center>
    <div class="col-sm-4">
     <form action="<c:url value="/j_spring_security_check"/>" method="post">
 <center><i style="font-size:100px" class="fa">&#xf2be;</i></center>
 <br>
    <div class="input-group">
	<div class="col-xs-12">
      <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
      <input id="email" type="text" class="form-control" name="j_username" placeholder="Email" width="400px">
    </div>
	</div>
	<br>

    <div class="input-group">
	<div class="col-xs-12">
      <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
      <input id="password" type="password" class="form-control" name="j_password" placeholder="Password">
    </div>
	</div>
    <br>

	<center>
	<input type="submit" class="btn btn-primary btn-lg" value="login"></input>
    </center>
	<br>
	<br>
	
	<h3>Follow us on</h3>	
<!-- twitter icon-->
<span class="fa-stack fa-3x">
  <i class="fa fa-circle-thin fa-stack-2x"></i>
  <i class="fa fa-twitter fa-stack-1x"></i>
</span>

<!-- fb icon-->
<span class="fa-stack fa-3x">
  <i class="fa fa-circle-thin fa-stack-2x"></i>
  <i class="fa fa-facebook fa-stack-1x"></i>
</span>

<!-- insta icon-->
<span class="fa-stack fa-3x">
  <i class="fa fa-circle-thin fa-stack-2x"></i>
  <i class="fa fa-instagram fa-stack-1x"></i>
</span>
<br>

<!-- whatsapp icon-->
<span class="fa-stack fa-3x">
  <i class="fa fa-circle-thin fa-stack-2x"></i>
  <i class="fa fa-whatsapp fa-stack-1x"></i>
</span>
	
<!-- google icon-->
<span class="fa-stack fa-3x">
  <i class="fa fa-circle-thin fa-stack-2x"></i>
  <i class="fa fa-chrome fa-stack-1x"></i>
</span>	

<!-- linkedin icon-->
<span class="fa-stack fa-3x">
  <i class="fa fa-circle-thin fa-stack-2x"></i>
  <i class="fa fa-linkedin fa-stack-1x"></i>
</span>
	
	</div>
	</center>
	
	<div class="col-sm-4">
	
	</div>
	</div>
	</div>
	<br>
	<br>
	<br>
	
	<!-- paragraph -->
<p><strong><center>650.11.4297</center></strong></p>
<p><strong><center>info@MECAKE.com</center></strong></p>
<p><strong><center>104,avenue road</center></strong></p>
<p><strong><center>Bangalore 560081</center></strong></p>

	</form>
  </body>
  </html>