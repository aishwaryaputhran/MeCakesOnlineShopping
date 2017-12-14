<%@include file="navbar.jsp" %>
<!doctype html>
<html>
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
  label{
   color:black;
   }
   h1{
color:white;
}
</style>   
</head>



<body background="${img}/Qx60rzh.jpg">
<center><h1>USER</h1></center>
<c:url value="/adduser" var="user"/>
<form:form action="${user}" method="POST" commandName="user">

<!--form-->
<form>
<div class="row">
<div class="col-sm-4">
</div>
<div class="col-sm-4">
<div class="form-group">
<label for="text">user_id</label>
<form:input type="text"  path="uid" class="form-control" placeholder="enter your id" required="required"/>
</div>
</div>
</div>
  
  
  <div class="row">
<div class="col-sm-4">
</div>
<div class="col-sm-4">
<div class="form-group">
<label for="text">user_name</label>
<form:input type="text"  path="username" class="form-control" placeholder="enter your name" required="required"/>
</div>
</div>
</div>
  
  <div class="row">
<div class="col-sm-4">
</div>
<div class="col-sm-4">
<div class="form-group">
<label for="text">password</label>
<form:input type="text"  path="password" class="form-control" placeholder="enter your password" required="required"/>
</div>
</div>
</div>
  
  
  <div class="row">
<div class="col-sm-4">
</div>
<div class="col-sm-4">
<div class="form-group">
<label for="text">address</label>
<form:input type="text"  path="address" class="form-control" placeholder="enter your address" required="required"/>

</div>
</div>
</div>
  
  <div class="row">
<div class="col-sm-4">
</div>
<div class="col-sm-4">
<div class="form-group">
<label for="text">mail:</label>
<form:input type="text"  path="email" class="form-control" placeholder="enter your email" required="required"/>
</div>
</div>
</div>
  
  <div class="row">
<div class="col-sm-4">
</div>
<div class="col-sm-4">
<div class="form-group">
<label for="text">phone:</label>
<form:input type="text"  path="phone" class="form-control" placeholder="enter your phone number" required="required"/>
</div>
</div>
</div>

<div class="row">
<div class="col-sm-4">
</div>
<div class="col-sm-4">
<div class="form-group">
<label for="text">bid:</label>
<input type="text"  path="bid" class="form-control" placeholder="enter your bid" required="required"/>
</div>
</div>
</div>

<div class="row">
<div class="col-sm-4">
</div>
<div class="col-sm-4">
<div class="form-group">
<label for="text">doorno:</label>
<input type="text"  path="doorno" class="form-control" placeholder="enter your doorno" required="required"/>
</div>
</div>
</div>

<div class="row">
<div class="col-sm-4">
</div>
<div class="col-sm-4">
<div class="form-group">
<label for="text">street</label>
<input type="text"  path="street" class="form-control" placeholder="enter your street" required="required"/>
</div>
</div>
</div>

<div class="row">
<div class="col-sm-4">
</div>
<div class="col-sm-4">
<div class="form-group">
<label for="text">locality</label>
<input type="text"  path="locality" class="form-control" placeholder="enter your locality" required="required"/>
</div>
</div>
</div>

<div class="row">
<div class="col-sm-4">
</div>
<div class="col-sm-4">
<div class="form-group">
<label for="text">city</label>
<input type="text"  path="city" class="form-control" placeholder="enter your city" required="required"/>
</div>
</div>
</div>

<div class="row">
<div class="col-sm-4">
</div>
<div class="col-sm-4">
<div class="form-group">
<label for="text">state</label>
<input type="text"  path="state" class="form-control" placeholder="enter your state" required="required"/>
</div>
</div>
</div>

<div class="row">
<div class="col-sm-4">
</div>
<div class="col-sm-4">
<div class="form-group">
<label for="text">pincode</label>
<input type="text"  path="pincode" class="form-control" placeholder="enter your pincode" required="required"/>
</div>
</div>
</div>

<center><button id="button" class="btn btn-primary" type="submit">submit</button></center>


</form:form>
  
  
</body>
</html>