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
<!-- carousel -->
.carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
</style>
</head>
<body background="${img}/f.jpg">
<!-- header -->
<div class="w3-container">
   <h2><center>ME</center></h2>
  <h1><center>CAKES</center></h1>
  <CENTER> <i class="fa fa-birthday-cake" style="font-size:58px;color:red"></i></CENTER>
 <br>
</div>
<!-- <!-- navbar --> 
<!--  <div class="container"> -->
<!-- <nav class="navbar navbar-inverse"> -->
<!--     <div class="navbar-header"> -->
<!--       <a class="navbar-brand" href="#">Menu</a> -->
<!--     </div> -->
<!--     <ul class="nav navbar-nav"> -->
<!-- 	 <li class="active"><a href="C:\Users\AISHWARYA\Desktop\bootstrap-3.3.7-dist\mecakes.jsp">Home</a></li> -->
<!-- 	  <li><a href="C:\Users\AISHWARYA\Desktop\bootstrap-3.3.7-dist\portfolios.jsp">Portfolios</a></li> -->
<!--       <li><a href="#">Flavours</a></li> -->
<!--       <li><a href="C:\Users\AISHWARYA\Desktop\bootstrap-3.3.7-dist\pricing.jsp">Pricing</a></li> -->
<!-- 	  <li><a href="C:\Users\AISHWARYA\Desktop\bootstrap-3.3.7-dist\contact.jsp">Contact</a></li> -->
<!-- 	   </ul> -->
<!-- 	  <ul class="nav navbar-nav navbar-right"> -->
<!--       <li><a href="C:\Users\AISHWARYA\Desktop\bootstrap-3.3.7-dist\SIGNUP.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li> -->
<!--       <li><a href="C:\Users\AISHWARYA\Desktop\bootstrap-3.3.7-dist\login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li> -->
<!--     </ul> -->
<!--  </div> -->
<!-- </nav> -->

<!-- selector-->
<h4>Choose your favourite flavours in this dropdown list.</h4>
  <select id="mySelect" onchange="myFunction()">
    <option><strong>ALMOND ORCHARD</strong></option>
    <option><strong>CHOCOLATE DECADENCE</strong></option>
    <option><strong>COCO LOCO</strong></option>
    <option><strong>COOKIES 'N CREAM</strong></option>
	<option><strong>GUAVA LAVA</strong></option>
	<option><strong>PINEAPPLE RIGHT-SIDE UP</strong></option>
	<option><strong>RED VELVET</strong></option>
	<option><strong>SNIKERDOODLE</strong></option>
	<option><strong>SPECTACULAR</strong></option>
	<option><strong>STRAWBERRY SHORTCAKE</strong></option>
	<option><strong>TIRAMISU</strong></option>
  </select>

<!-- flavours-->
<H2><center>ALMOND ORCHARD</center></H2>
<P><center><strong>almond cake, Amaretto simple syrup, almond scented swiss meringue buttercream and apricot preserves</strong></center></P>
<H2><center>CHOCOLATE DECADENCE</center></H2>
<P><center><strong>deep chocolate cake, vanilla bean simple syrup, chocolate swiss meringue buttercream and fudgey frosting</strong></center></P>
<H2><center>COCO LOCO</center></H2>
<P><center><strong>coconut cake, coconut cream soak, coconut swiss meringue buttercream and toasted coconut flakes</strong></center></P>
<H2><center>COOKIES 'N CREAM</center></H2>
<P><center><strong>deep chocolate cake, vanilla bean simple syrup, cookies n' cream swiss meringue buttercream and fudgey frosting</strong></center></P>
<H2><center>GUAVA LAVA</center></H2>
<P><center><strong>coconut cake, coconut cream soak, guava swiss meringue buttercream and guava coulis</strong></center></P>
<H2><center>PINEAPPLE RIGHT-SIDE UP</center></H2>
<P><center><strong>vanilla cake, vanilla bean simple syrup, brown sugar swiss meringue buttercream and pineapple compote</strong></center></P>
<H2><center>RED VELVET</center></H2>
<P><center><strong>red velvet cake, vanilla bean simple syrup, and white chocolate cream cheese frosting</strong></center></P>
<H2><center>SNIKERDOODLE</center></H2>
<P><center><strong>vanilla cake, vanilla bean simple syrup, cinnamon swiss meringue buttercream and toasted walnuts</strong></center></P>
<H2><center>SPECTACULAR</center></H2>
<P><center><strong>vanilla cake, vanilla bean simple syrup, cookie butter swiss meringue buttercream and cookie butter filling</strong></center></P>
<H2><center>STRAWBERRY SHORTCAKE</center></H2>
<P><center><strong>vanilla cake, vanilla bean simple syrup, white chocolate cream cheese frosting, strawberry compote and graham cracker crumbs</strong></center></P>
<H2><center>TIRAMISU</center></H2>
<P><center><strong>vanilla cake, coffee liquor soak, marsala cream cheese and fudgey frosting</strong></center></P>
<br>
<br>
<!-- paragraph -->
<p><strong><center>650.11.4297</center></strong></p>
<p><strong><center>info@MECAKE.com</center></strong></p>
<p><strong><center>104,avenue road</center></strong></p>
<p><strong><center>Bangalore 560081</center></strong></p>

</body>
</html>