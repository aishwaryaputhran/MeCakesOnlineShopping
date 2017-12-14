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
<body background="${img}/pr.jpg">
<!-- header -->
<div class="w3-container">
   <h2><center>ME</center></h2>
  <h1><center>CAKES</center></h1>
 <CENTER> <i class="fa fa-birthday-cake" style="font-size:58px;color:red"></i></CENTER>
 <br>
</div>



<!-- selector-->
<h4>Choose your favourite PARTIES CAKES in this dropdown list.</h4>
  <select id="mySelect" onchange="myFunction()">
    <option><strong>1</strong></option>
    <option><strong>2</strong></option>
    <option><strong>3</strong></option>
    <option><strong>4</strong></option>
	<option><strong>5</strong></option>
	<option><strong>6</strong></option>
	<option><strong>7</strong></option>
	<option><strong>8</strong></option>
	<option><strong>9</strong></option>
	<option><strong>10</strong></option>
	<option><strong>11</strong></option>
	<option><strong>12</strong></option>
	<option><strong>13</strong></option>
	<option><strong>14</strong></option>
	<option><strong>15</strong></option>
</select>


 <!-- back icon-->
 <center><a href="<c:url value="/portfolios"/>"><i class="fa fa-arrow-circle-left" style="font-size:104px"></i></a></center>
<br>
<br>

   <!-- grid1-->
<div class="container">
  <div class="row">
    <div class="col-md-4">
    <img src="http://cf.livinglocurto.com/wp-content/uploads/2016/04/emoji-Sparkle-cake-650x853.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">1</font></strong>
	</div>
	
     <div class="col-md-4">
    <img src="https://s-media-cache-ak0.pinimg.com/564x/ba/6b/3b/ba6b3bfcd56665fbfc7beca22bad767e.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">2</font></strong>
	</div>
	
	 <div class="col-md-4">
    <img src="http://media.virbcdn.com/files/resize_1024x1365/c6/FileItem-58936-34505_141645049195064_100000487086403_355711_1875280_n.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">3</font></strong>
	</div>

	 
	 
   </div>
  </div>
  <br>
  
  <!-- grid2-->
<div class="container">
  <div class="row">
    <div class="col-md-4">
    <img src="http://www.limitededitioncakes.net/photos/Childrens-Birthday/P3051908.JPG" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">4</font></strong>
	</div>
	
     <div class="col-md-4">
    <img src="https://s-media-cache-ak0.pinimg.com/736x/d2/d1/f4/d2d1f4fdbffadb57e9cb17c3c6e404d2.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">5</font></strong>
	</div>
	
	 <div class="col-md-4">
    <img src="https://s-media-cache-ak0.pinimg.com/736x/e1/24/58/e124588708b696b516228d4e7256646d.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">6</font></strong>
	</div>

	 
	 
   </div>
  </div>
  <br>
  
  <!-- grid3-->
<div class="container">
  <div class="row">
    <div class="col-md-4">
    <img src="https://s-media-cache-ak0.pinimg.com/736x/f9/39/a2/f939a28f9fcc4f375a9e45779f48a052.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">7</font></strong>
	</div>
	
     <div class="col-md-4">
    <img src="https://s-media-cache-ak0.pinimg.com/236x/e9/3c/5e/e93c5e3499f8680205173f7c6df07639.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">8</font></strong>
	</div>
	
	 <div class="col-md-4">
    <img src="https://s-media-cache-ak0.pinimg.com/736x/68/4c/06/684c06f3d1ac6a1fff7726fddeb4ad64.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">9</font></strong>
	</div>

	 
	 
   </div>
  </div>
  <br>
  
  <!-- grid4-->
<div class="container">
  <div class="row">
    <div class="col-md-4">
    <img src="https://s-media-cache-ak0.pinimg.com/736x/ee/91/f6/ee91f625c103ce30d81fc498634ed7cb.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">10</font></strong>
	</div>
	
     <div class="col-md-4">
    <img src="https://s-media-cache-ak0.pinimg.com/736x/ab/2d/f5/ab2df575929cbcf72d5395112c74d23e.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">11</font></strong>
	</div>
	
	 <div class="col-md-4">
    <img src="https://s-media-cache-ak0.pinimg.com/originals/0d/f3/c5/0df3c5bc98869b1c10c72929f8e910d0.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">12</font></strong>
	</div>

	 
	 
   </div>
  </div>
  <br>
  
  <!-- grid5-->
<div class="container">
  <div class="row">
    <div class="col-md-4">
    <img src="http://www.vanillabean-bakery.com/siteimages/cigar%20cake.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">13</font></strong>
	</div>
	
     <div class="col-md-4">
    <img src="https://media.timeout.com/images/102709234/image.jpg" width="250" height="250"><br>
    <strong style="color:blue"><font size="10">14</font></strong>
	</div>
	
	 <div class="col-md-4">
    <img src="http://images.pinkcakebox.com/cake1105.jpg" width="250" height="250"><br>
    <strong style="color:blue"><font size="10">15</font></strong>
	</div>

	 
	 
   </div>
  </div>
  <br>
  

 <!-- back icon-->
 <center><a href="<c:url value="/portfolios"/>"><i class="fa fa-arrow-circle-left" style="font-size:104px"></i></a></center>
<br>
<br>
  
  </body>
  </html>