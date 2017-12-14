
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
   color:red;
   }
   h1{
color:white;
}
</style>   
</head>

<body background="${img}/Qx60rzh.jpg">
<center><h1>CATEGORY</h1></center>
<c:url value="/addcat" var="category"/>


<form:form action="${category}" method="POST" commandName="category">
<!--form-->
<center>
<div class="row">
<div class="col-sm-4">
</div>
<div class="col-sm-4">
<div class="form-group">
<label for="text">category_id</label>
<form:input type="text"  path="cid" class="form-control" placeholder="enter your categoryid" required="required"/>
</div>
</div>
</div>
   </center>
   <br>
   <br>
  <center>
  <div class="row">
<div class="col-sm-4">
</div>
<div class="col-sm-4">
<div class="form-group">
<label for="text">category_name</label>
<form:input type="text"  path="cname" class="form-control" placeholder="enter your categoryname" required="required"/>
</div>
</div>
</div>
  </center>
  <br>
  <br>
  


<center><button id="button" class="btn btn-primary" type="submit">submit</button></center>
</form:form>
<br>
<br>
<br>
<br>

<!-- table -->
<center>
  <table style="border:1px solid black">
  <tr style="background-color: #eee">
  <th style="border: 1px solid black">Category id</th>
  <th style="border: 1px solid black">Category name</th>
  <th colspan="2" style="border: 1px solid black">Edit/Delete</th>
  </tr>
  
  <center><tbody>
  <c1:forEach items="${categories}" var="cat">
  <tr style="border: 1px solid black">
  <td style="border: 1px solid black">${cat.getCid()}</td> 
  <td style="border: 1px solid black">${cat.getCname()}</td>
  <td style="border: 1px solid black"><a href="<c1:url value="/editcategory/${cat.getCid()}"/>" class="btn btn btn-info">edit</a></td>
  <td style="border: 1px solid black"><a href="<c1:url value="/deletecategory/${cat.getCid()}"/>" class="btn btn btn-danger">delete</a></td>
  </tr>
  </c1:forEach>
  </table>
  </center>
</body>
</html>