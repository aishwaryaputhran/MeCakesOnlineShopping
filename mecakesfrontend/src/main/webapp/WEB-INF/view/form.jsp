<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>category1</title>
<link rel="stylesheet" href="css\bootstrap.min.css">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
   <script src="js\jquery.min.js"></script>
  <script src="js\bootstrap.js"></script>
</head>
<body background="https://s-media-cache-ak0.pinimg.com/originals/cc/d3/46/ccd346bfcdbe5fcc50bb2263f4f61361.jpg">
<div class="row">
<div class="col-sm-4">
</div>
<div class="col-sm-4">
<h1>CATEGORY</h1>
 <form:form action="#" method="post" commandname="cat">
    <div class="form-group">
      category id:
	  <form:input type="number" path="cid" class="form-control" name="cid" placeholder="Enter cid"/>
    category name:
	<form:input type="number" path="cname" class="form-control" name="cname" placeholder="Enter cname"/>
    </div>
	</div>
	</div>
</form:form>

</body>
</html>