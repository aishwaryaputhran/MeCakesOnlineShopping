<%@include file="navbar.jsp"%>
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
<center><h1>SUPPLIER</h1></center>
<c:url value="/addsup" var="supplier"/>
<form:form action="${supplier}" method="POST" commandName="supplier">

<!--form-->
<form>
<div class="row">
<div class="col-sm-4">
</div>
<div class="col-sm-4">
<div class="form-group">
<label for="text">supplier_id</label>
<form:input type="text"   path="sid" class="form-control" placeholder="enter your supplierid" required="required"/>
</div>
</div>
</div>
  
  
  <div class="row">
<div class="col-sm-4">
</div>
<div class="col-sm-4">
<div class="form-group">
<label for="text">supplier_name</label>
<form:input type="text" name="sname" path="sname" class="form-control" placeholder="enter your suppliername" required="required"/>
</div>
</div>
</div>
  
  <div class="row">
<div class="col-sm-4">
</div>
<div class="col-sm-4">
<div class="form-group">
<label for="text">address</label>
<form:input type="text" path="address" class="form-control" placeholder="enter your address" required="required"/>
</div>
</div>
</div>

<div class="row">
<div class="col-sm-4">
</div>
<div class="col-sm-4">
<div class="form-group">
<label for="text">s_contact</label>
<form:input type="text" path="scontact"  class="form-control" placeholder="enter your scontact" required="required"/>
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
  <th style="border: 1px solid black">Supplier id</th>
  <th style="border: 1px solid black">Supplier name</th>
   <th style="border: 1px solid black">Supplier address</th>
    <th style="border: 1px solid black">Supplier contact</th>
  <th colspan="2" style="border: 1px solid black">Edit/Delete</th>
  </tr>
  
  <center><tbody>
  <c1:forEach items="${suppliers}" var="supplier">
  <tr style="border: 1px solid black">
  <td style="border: 1px solid black">${supplier.getSid()}</td> 
  <td style="border: 1px solid black">${supplier.getSname()}</td>
  <td style="border: 1px solid black">${supplier.getAddress()}</td>
  <td style="border: 1px solid black">${supplier.getScontact()}</td>
  <td style="border: 1px solid black"><a href="<c1:url value="/editSupplier/${supplier.getSid()}"/>" class="btn btn btn-info">edit</a></td>
  <td style="border: 1px solid black"><a href="<c1:url value="/deleteSupplier/${supplier.getSid()}"/>" class="btn btn btn-danger">delete</a></td>
  </tr>
  </c1:forEach>
  </table>
  </center>
  
  
</body>
</html>