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
body 
{
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
<body background="${img}/pr.jpg">
<!-- header -->
<div class="w3-container">
  <h1><center>ME</center></h1>
  <h3><center>CAKES</center></h3>
  <CENTER> <i class="fa fa-birthday-cake" style="font-size:58px;color:red"></i></CENTER>
 <br>
</div>

<!-- images -->
<div class="container">
  <div class="row">
    <div class="col-md-4">
	<a href="<c:url value="/weddings"/>">
	<img src="http://www.simplicitycakes.co.uk/wp-content/uploads/2015/06/Simplicity_cakes_sarah_wedding_cakes_swindon_melloney_forweb.jpg" width="250" height="250"/></a>
	<div class="text"><h1>Weddings</h1></div>
	</div>
	
    <div class="col-md-4">
    <a href="<c:url value="/parties"/>">
	<img src="https://s-media-cache-ak0.pinimg.com/736x/a0/16/e9/a016e9a164de995b845c8810b2fbe0a6.jpg" width="250" height="250"></a>
     <div class="text"><h1>Parties</h1></div>
	 </div>
	 

	 <div class="col-md-4">
      <a href="<c:url value="/sculptedcakes"/>">	 
      <img src="https://a.dilcdn.com/bl/wp-content/uploads/sites/8/2011/10/haunted-house-cake.jpg" width="250" height="250"></a>
      <div class="text"><h1>Sclupted creations</h1></div>
	  </div>
	 
   </div>
  </div>
  <br>
  <br>
  
 <CENTER> 
 <H4>WE OFFER WITH FREE HOME-DELIVERY:</H4> 
<i style="font-size:45px" class="fa">&#xf0d1;</i>
</CENTER>
<br>
<br>

  <!-- paragraph -->
<p><strong><center>650.11.4297</center></strong></p>
<p><strong><center>info@MECAKE.com</center></strong></p>
<p><strong><center>104,avenue road</center></strong></p>
<p><strong><center>Bangalore 560081</center></strong></p>

  </body>
</html>