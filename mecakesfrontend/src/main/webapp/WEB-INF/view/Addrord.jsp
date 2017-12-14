<%@include file="navbar.jsp"%>
<!doctype html>
<html lang="en">
<head>
<title>register</title>

<c:url value="/resources/img" var="img"/>
<c:url value="/resources/css" var="css"/>
<c:url value="/resources/js" var="js"/>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>category</title>

<link rel="stylesheet" href="${css}/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
   <script src="${js}/jquery.min.js"></script>
  <script src="${js}/bootstrap.js"></script>

<style>
label{
color:red;
}
h2{
color:green;
}
</style>
</head>
<body  background="${bckgrnd}/Qx60rzh.jpg">
<div class="page">
<form>
</div>

<div class="container">


<div class="row">
<div class="col-sm-4">
bid:
  <input type="text" path="bid" class="form-control" name="billing id" placeholder="Enter billing id">
  doorno:
  <input type="text" path="doorno" class="form-control" name="doorno" placeholder="enter billing name">
address:
  <input type="text" path="street" class="form-control" name="billing address" placeholder="enter billing address">
locality:
  <input type="text" path="locality" class="form-control" name="billing locality" placeholder="enter billing locality">
city:
  <input type="text" path="city" class="form-control" name="billing city" placeholder="enter billing address">
state:
  <input type="text" path="state" class="form-control" name="billing state" placeholder="enter billing address">
pincode:
  <input type="text" path="pincode" class="form-control" name="billing pincode" placeholder="enter billing address">
  <br>
	<center><button id="button" class="btn btn-primary" type="submit">submit</button></center>
	</br>
</div>
<div class="col-sm-4">
<h2>ADDRESS ORDER</h2>
</div>
<div class="col-sm-4"> 
id:
  <input type="text" path="id" class="form-control" name="shipping id" placeholder="Enter shipping id">
  <label for="text">doorno:</label>
  <input type="text" path="doorno" class="form-control" name="shipping name" placeholder="enter shipping name">
street:
  <input type="text" path="street" class="form-control" name="shipping address" placeholder="enter shipping address">
locality:
  <input type="text" path="locality" class="form-control" name="shipping locality" placeholder="enter shipping locality">
city:
  <input type="text" path="city" class="form-control" name="shipping city" placeholder="enter shipping address">
state:
  <input type="text" path="state" class="form-control" name="shipping state" placeholder="enter shipping address">
pincode:
  <input type="text" path="pincode" class="form-control" name="shipping pincode" placeholder="enter shipping address">
  <br>
	<center><button id="button" class="btn btn-primary" type="submit">submit</button></center>
	</br>
</div>

</form>
</body>
</html>