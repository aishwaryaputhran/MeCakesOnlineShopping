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
<h4>Choose your favourite SCULPTED CAKES in this dropdown list.</h4>
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
	<option><strong>16</strong></option>
	<option><strong>17</strong></option>
	<option><strong>18</strong></option>
	
  </select>

 <!-- back icon-->
 <center><a href="<c:url value="/portfolios"/>"><i class="fa fa-arrow-circle-left" style="font-size:104px"></i></a></center>
<br>
<br>

   <!-- grid1-->
<div class="container">
  <div class="row">
    <div class="col-md-4">
    <img src="http://bestfriendsforfrosting.com/wp-content/uploads/2012/06/big-mac-cake.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">1</font></strong>
	</div>
	
     <div class="col-md-4">
    <img src="http://artisancakecompany.com/wp-content/uploads/2009/02/geocaching_cake.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">2</font></strong>
	</div>
	
	 <div class="col-md-4">
    <img src="http://www.itsallaboutthecake.com/_img/gallery/cake/3d-sculpted/3d-sculpted-cake-01.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">3</font></strong>
	</div>

	 
	 
   </div>
  </div>
  <br>
  
  
   <!-- grid2-->
<div class="container">
  <div class="row">
    <div class="col-md-4">
    <img src="http://img.designswan.com/2014/03/cake/4.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">4</font></strong>
	</div>
	
     <div class="col-md-4">
    <img src="https://s-media-cache-ak0.pinimg.com/736x/13/05/3e/13053ed70abf69c865f5c838a105f6bc.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">5</font></strong>
	</div>
	
	 <div class="col-md-4">
    <img src="http://www.thatsnerdalicious.com/wp-content/uploads/2014/03/cake-1.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">6</font></strong>
	</div>

	 
	 
   </div>
  </div>
  <br>
  
   <!-- grid3-->
<div class="container">
  <div class="row">
    <div class="col-md-4">
    <img src="https://farm1.static.flickr.com/482/20079794140_442dcf49f9.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">7</font></strong>
	</div>
	
     <div class="col-md-4">
    <img src="http://charmcitycakeswest.com/wp-content/uploads/2011/11/circusweb.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">8</font></strong>
	</div>
	
	 <div class="col-md-4">
    <img src="https://byrdiegirl.files.wordpress.com/2013/11/img_0798.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">9</font></strong>
	</div>

	 
	 
   </div>
  </div>
  <br>
  
   <!-- grid4-->
<div class="container">
  <div class="row">
    <div class="col-md-4">
    <img src="http://static.wixstatic.com/media/85b017_9d667983bd5c453dba855d0aecd9cd9f.jpg_srz_1172_1478_85_22_0.50_1.20_0.00_jpg_srz" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">10</font></strong>
	</div>
	
     <div class="col-md-4">
    <img src="http://blog.oakleafcakes.com/wp-content/uploads/2012/06/Harvard-Finished1.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">11</font></strong>
	</div>
	
	 <div class="col-md-4">
    <img src="http://www.reneesgourmetcakes.com/Specialty_Cakes/Late_October_001.JPG" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">12</font></strong>
	</div>

	 
	 
   </div>
  </div>
  <br>
  
   <!-- grid5-->
<div class="container">
  <div class="row">
    <div class="col-md-4">
    <img src="https://farm3.staticflickr.com/2311/2437331901_0c50866781_b.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">13</font></strong>
	</div>
	
     <div class="col-md-4">
    <img src="http://www.daniellekattancakes.com/wp-content/uploads/2015/08/0201-1024x683.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">14</font></strong>
	</div>
	
	 <div class="col-md-4">
    <img src="https://c1.staticflickr.com/3/2857/11352256526_578a6db0b5_b.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">15</font></strong>
	</div>

	 
	 
   </div>
  </div>
  <br>
  
   <!-- grid6-->
<div class="container">
  <div class="row">
    <div class="col-md-4">
    <img src="http://www.craftsy.com/blog/wp-content/uploads/2013/07/candy_bag_cake.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">16</font></strong>
	</div>
	
     <div class="col-md-4">
    <img src="https://images.pinkcakebox.com/big-cake1495.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">17</font></strong>
	</div>
	
	 <div class="col-md-4">
    <img src="http://realitypod.com/wp-content/uploads/2014/09/polo-shirt-cake.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">18</font></strong>
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