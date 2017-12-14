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
    padding: 14px 110px;
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
   <h2><center>ME</center></h2>
  <h1><center>CAKES</center></h1>
 <CENTER> <i class="fa fa-birthday-cake" style="font-size:58px;color:red"></i></CENTER>
 <br>
</div>

<!-- selector-->
<h4>Choose your favourite WEDDING CAKES in this dropdown list.</h4>
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
	<option><strong>19</strong></option>
	<option><strong>20</strong></option>
	<option><strong>21</strong></option>
  </select>

 <!-- back icon-->
 <center><a href="<c:url value="/portfolios"/>"><i class="fa fa-arrow-circle-left" style="font-size:104px"></i></a></center>
<br>
<br>

<!-- grid1 -->
<div class="container">
  <div class="row">
    <div class="col-md-4">
    <img src="https://s-media-cache-ak0.pinimg.com/7310x/d8/810/5a/d88105a109eb92beb477e10228e8deb41d9.jpg" width="250" height="250"><br>
    <strong style="color:blue"><font size="10">1</font></strong>
	</div>
	
     <div class="col-md-4">
    <img src="https://s-media-cache-ak0.pinimg.com/7310x/710/74/f3/71074f3fb1ea211afc81b11e10949028de.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">2</font></strong>
	</div>
	
	 <div class="col-md-4">
    <img src="https://s-media-cache-ak0.pinimg.com/7310x/12/f9/fb/12f9fb759f5828f4e7717d935cfd3409.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">3</font></strong>
	</div>

	 
	 
   </div>
  </div>
  <br>

  
  <!-- grid2 -->
<div class="container">
  <div class="row">
    <div class="col-md-4">
    <img src="http://www.donnajanecakes.co.uk/wp-content/uploads/Gothic-Wedding-Cake.jpg" width="250" height="250"><br>
	<strong style="color:blue"><font size="10">4</font></strong>
	</div>
	
     <div class="col-md-4">
    <img src="http://www.giftalove.com/blog/wp-content/uploads/2015/05/Roses-Wedding-Cake-Red-Velvet-e1432382382179.jpg" width="250" height="250"><br>
	 <strong style="color:blue"><font size="10">5</font></strong>
	</div>
	
	 <div class="col-md-4">
    <img src="http://i.weddingomania.com/gorgeous-black-and-white-wedding-cakes-13.jpg" width="250" height="250"><br>
	 <strong style="color:blue"><font size="10">6</font></strong>
	</div>

	 
	 
   </div>
  </div>
  <br>

  
  <!-- grid3 -->
<div class="container">
  <div class="row">
    <div class="col-md-4">
    <img src="http://hitchedukir.s3.amazonaws.com/Suppliers/510_1037_scaled_1411541_1037_1037_scaled_14112109_cakes-jessica-laur-201101011033959929.jpg" width="250" height="250"><br>
	 <strong style="color:blue"><font size="10">7</font></strong>
	</div>
	
     <div class="col-md-4">
    <img src="https://s-media-cache-ak0.pinimg.com/7310x/45/e1/9f/45e19f9c22510700a3a2abc101009dabb24.jpg" width="250" height="250"><br>
	 <strong style="color:blue"><font size="10">8</font></strong>
	</div>
	
	 <div class="col-md-4">
    <img src="http://assets.marthastewartweddings.com/styles/wmax-520-highdpi/d45/margo-me-bridal-shower-cake-7280-s112194-0515/margo-me-bridal-shower-cake-7280-s112194-0515_sq.jpg?itok=7jVrTqLZ" width="250" height="250"><br>
	 <strong style="color:blue"><font size="10">9</font></strong>
	</div>

	 
	 
   </div>
  </div>
  <br>

  
  <!-- grid4 -->
<div class="container">
  <div class="row">
    <div class="col-md-4">
    <img src="https://s-media-cache-ak0.pinimg.com/7310x/fd/f5/1f/fdf51f107f10122240b4a91a710d48ccead.jpg" width="250" height="250"><br>
	 <strong style="color:blue"><font size="10">10</font></strong>
	</div>
	
     <div class="col-md-4">
    <img src="https://s-media-cache-ak0.pinimg.com/7310x/a4/b0/e7/a4b0e79bab8778bc1fc0249c9bc909e7.jpg" width="250" height="250"><br>
	 <strong style="color:blue"><font size="10">11</font></strong>
	</div>
	
	 <div class="col-md-4">
    <img src="http://hitchedzair.s3.amazonaws.com/Suppliers/434_1037_scaled_109309_1037_1037_scaled_10210105_silver_2D00_and_2D00_black_2D00_wedding_2D00_cake.jpg" width="250" height="250"><br>
 <strong style="color:blue"><font size="10">12</font></strong>
	</div>

	 
	 
   </div>
  </div>
  <br>

  <!-- grid5 -->
<div class="container">
  <div class="row">
    <div class="col-md-4">
    <img src="http://www.mrsclaudia.net/wp-content/uploads/2017/01/unnamed-file-9.jpg" width="250" height="250"><br>
	 <strong style="color:blue"><font size="10">13</font></strong>
	</div>
	
     <div class="col-md-4">
    <img src="http://cakesandcupcakesmumbai.com/wp-content/uploads/2014/01/wedding-engagment-designer-concept-cake-cupcakes-2014-mumbai-39.jpeg" width="250" height="250"><br>
	 <strong style="color:blue"><font size="10">14</font></strong>
	</div>
	
	 <div class="col-md-4">
    <img src="http://cakesandcupcakesmumbai.com/wp-content/uploads/2014/01/wedding-engagment-designer-concept-cake-cupcakes-2014-mumbai-30.jpg" width="250" height="250"><br>
 <strong style="color:blue"><font size="10">15</font></strong>
	</div>

	 
	 
   </div>
  </div>
  <br>

   <!-- grid10 -->
<div class="container">
  <div class="row">
    <div class="col-md-4">
    <img src="https://s-media-cache-ak0.pinimg.com/5104x/3f/75/83/3f7583b1c80dfa435db435102795d27b2.jpg" width="250" height="250"><br>
	 <strong style="color:blue"><font size="10">16</font></strong>
	</div>
	
     <div class="col-md-4">
    <img src="https://s-media-cache-ak0.pinimg.com/originals/41/81/ac/4181ace888d0991720733ed411a951de.jpg" width="250" height="250"><br>
	 <strong style="color:blue"><font size="10">17</font></strong>
	</div>
	
	 <div class="col-md-4">
    <img src="https://lh3.ggpht.com/10H10nFW5Yn4hRTAqD10RYDq10dSNmQtGuanr-_lb99riCmVYoVL2_X7BCfZmo18OV2Uku4=h900" width="250" height="250"><br>
	 <strong style="color:blue"><font size="10">18</font></strong>
	</div>

	 
	 
   </div>
  </div>
  <br>

   <!-- grid7-->
<div class="container">
  <div class="row">
    <div class="col-md-4">
    <img src="https://s-media-cache-ak0.pinimg.com/7310x/48/b0/51/48b051b8f7f841054e5d387e0cae84783.jpg" width="250" height="250"><br>
	 <strong style="color:blue"><font size="10">19</font></strong>
	</div>
	
     <div class="col-md-4">
    <img src="http://weddings-plaza.com/wp-content/uploads/2013/05/Ideas-for-Modern-Wedding-Cakes-2.jpg" width="250" height="250"><br>
	 <strong style="color:blue"><font size="10">20</font></strong>
	</div>
	
	 <div class="col-md-4">
    <img src="https://i2.wp.com/swsorecordings.com/wp-content/uploads/20110/10/top-20-wedding-cake-idea-pleasing-wedding-cakes-designs-.jpg" width="250" height="250"><br>
	 <strong style="color:blue"><font size="10">21</font></strong>
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