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
}s
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
<body background="${img}/m.jpg">
<!-- header -->
<div class="w3-container">
   <h2><center>ME</center></h2>
  <h1><center>CAKES</center></h1>
 <CENTER> <i class="fa fa-birthday-cake" style="font-size:58px;color:red"></i></CENTER>
 <br>
</div>
<!-- <!-- navbar --> -->
<!--   <div class="container">  -->
<!--  <nav class="navbar navbar-inverse">  -->
<!--      <div class="navbar-header">  -->
<!--        <a class="navbar-brand" href="#">Menu</a>  -->
<!--      </div>  -->
<!--      <ul class="nav navbar-nav">   -->
<%--      <c1:if test="${pageContext.request.userPrincipal.name!=null}">  --%>
<!--      <security:authorize access="hasRole('ROLE ADMIN')">         -->
<%--      <li><a href="<c:url value="/Supplier"/>">Supplier</a></li> --%>
<%--      <li><a href="<c:url value="/Product"/>">Product</a></li>  --%>
<%--      <li><a href="<c:url value="/category1"/>">category1</a></li> --%>
<!--      </security:authorize> -->
<%--     </c1:if> --%>
<!--      </ul> -->

<!--  	 <li class="active"><a href="#">Home</a></li> -->
<%--  	  <li><a href="<c:url value="/"/>">Portfolios</a></li>  --%>
<%--        <li><a href="<c:url value="/"/>">Flavours</a></li>  --%>
<%--        <li><a href="<c:url value="/"/>">Pricing</a></li>  --%>
<%--  	  <li><a href="<c:url value="/"/>">Contact</a></li>  --%>
<%--  	  <li><a href="<c:url value="/user"/>">User</a></li>  --%>
<%--  	  <li><a href="<c:url value="/category"/>">Category</a></li>  --%>
<%--         <c1:if test="${pageContext.request.userPrincipal.name==null}"> --%>
<%--  	  <li><a href="<c:url value="/supplier"/>">Supplier</a></li>  --%>
<%--        <li><a href="<c:url value="/product"/>">Product</a></li>  --%>
      	  
<!--  	   </ul>  -->
<!--  	  <ul class="nav navbar-nav navbar-right">  -->
<!--        <li><a href="C:\Users\AISHWARYA\Desktop\bootstrap-3.3.7-dist\SIGNUP.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>  -->
<!--        <li><a href="C:\Users\AISHWARYA\Desktop\bootstrap-3.3.7-dist\login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>  -->
<%--        </c1:if> --%>
           
<!--         </ul>  -->
<!--   </div>  -->
<!--       </nav>  -->
<!-- carousel -->
<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel" style="width: 950px; margin: 0 auto">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
	  <li data-target="#myCarousel" data-slide-to="4"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="https://s-media-cache-ak0.pinimg.com/736x/b9/d6/b6/b9d6b63e38ff38cd12934d9e8a4f6253.jpg" alt="pineapple crunch" width="1300" height="500">
		 <div class="carousel-caption">
          <h4>Pineapple crunch</h4>
        </div>
     </div>

      <div class="item">
        <img src="http://images.wisegeek.com/chocolate-cake.jpg" alt="Chocolate cream" width="1300" height="500">
		<div class="carousel-caption">
          <h4>Chocolate cream</h4>
        </div>
      </div>
    
      <div class="item">
        <img src="http://images-gmi-pmc.edge-generalmills.com/2aa9617f-a684-4bc5-a559-ea1fbbe2a6f7.jpg" alt="Red valvet" width="1300" height="500">
		<div class="carousel-caption">
          <h4>Red_valvet</h4>
        </div>
      </div>

      <div class="item">
        <img src="http://cdn.foodbeast.com/content/uploads/2016/12/Events_34_1641066413.jpg" alt="Baked cakes" width="1300" height="500">
		<div class="carousel-caption">
          <h4>Baked cakes</h4>
        </div>
      </div>
    
	 <div class="item">
        <img src="C:\Users\AISHWARYA\Desktop\images\5.JPG" alt="Blackforest" width="1300" height="500">
		<div class="carousel-caption">
          <h4>Black_forest</h4>
        </div>
      </div>
    </div>
    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span sclass="sr-only">Next</span>
    </a>
  </div>
</div>
<br>
<BR>
<br>
<!-- paragraph -->
<p><strong><center>650.11.4297</center></strong></p>
<p><strong><center>info@MECAKE.com</center></strong></p>
<p><strong><center>104,avenue road</center></strong></p>
<p><strong><center>Bangalore 560081</center></strong></p>


</body>
</html>