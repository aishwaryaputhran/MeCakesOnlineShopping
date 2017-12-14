<%@include file="navbar.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:url value="/resources/bckgrnd"  var="img"/>
<c:url value="/resources/css"  var="css"/>
<c:url value="/resources/js"  var="js"/>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
<center><h1>PRODUCTS</h1></center>
<c:url value="/addprod" var="product"/>
<form:form action="${product}" method="POST" commandName="product" enctype="multipart/form-data">

<!--form-->
<form>
<div class="row">
<div class="col-sm-4">
</div>
<div class="col-sm-4">
<div class="form-group">
<label for="text">product_id</label>
<form:input type="text"  path="product_id" class="form-control" placeholder="enter your product_name" required="required"/>
</div>
</div>
</div>
  
  
  <div class="row">
<div class="col-sm-4">
</div>
<div class="col-sm-4">
<div class="form-group">
<label for="text">product_name</label>
<form:input type="text"  path="product_name" class="form-control" placeholder="enter your product_name" required="required"/>
</div>
</div>
</div>
  
  <div class="row">
<div class="col-sm-4">
</div>
<div class="col-sm-4">
<div class="form-group">
<label for="text">product_price</label>
<form:input type="text"  path="product_price" class="form-control" placeholder="enter your product_price" required="required"/>
</div>
</div>
</div>

<div class="row">
<div class="col-sm-4">
</div>
<div class="col-sm-4">
<div class="form-group">
<label for="text">quantity</label>
<form:input type="text"  path="quantity" class="form-control" placeholder="enter your qunatity" required="required"/>

</div>
</div>
</div>

<div class="row">
<div class="col-sm-4">
</div>
<div class="col-sm-4">
<div class="form-group">
<label for="text">product image</label>
<form:input path="pbckgrnd"  type="file" name="image" value="upload file" required="required"/>

</div>
</div>
</div>


<center><button id="button" class="btn btn-primary" type="submit">submit</button></center>
</form:form>
<br>

<center>
<!-- table -->
  <table style="border:1px solid black">
  <tr style="background-color: #eee">
  <th style="border: 1px solid black">Product id</th>
  <th style="border: 1px solid black">Product name</th>
  <th style="border: 1px solid black">Product price</th>
  <th style="border: 1px solid black">Product quantity</th>  
  <th colspan="2" style="border: 1px solid black">Edit/Delete</th>
  </tr>
  
  <center><tbody>
  <c1:forEach items="${products}" var="product">
  <tr style="border: 1px solid black">
  <td style="border: 1px solid black">${product.getProduct_id()}</td> 
  <td style="border: 1px solid black">${product.getProduct_name()}</td>
  <td style="border: 1px solid black">${product.getProduct_price()}</td>
  <td style="border: 1px solid black">${product.getQuantity()}</td>
  <td style="border: 1px solid black"><img  src="<c1:url value="resources/bckgrnd/${product.getProduct_id()}.jpg"/>"></td>
  <td style="border: 1px solid black"><a href="<c1:url value="/editProduct/${product.getProduct_id()}"/>" class="btn btn btn-info">edit</a></td>
  <td style="border: 1px solid black"><a href="<c1:url value="/deleteProduct/${product.getProduct_id()}"/>" class="btn btn btn-danger">delete</a></td>
  </tr>
  </c1:forEach>
  </table>
  </center>
  
</body>
</html>