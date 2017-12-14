<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c1" %> 
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- navbar -->
 <div class="container">
<nav class="navbar navbar-inverse">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Menu</a>
    </div>
    <ul class="nav navbar-nav">
     <c1:if test="${pageContext.request.userPrincipal.name!=null}"> 
     <li><a href="<c:url value="/home"/>"><span class="glyphicon glyphicon-user"></span> Sign out</a></li>
     <security:authorize access="hasRole('ROLE ADMIN')">        
     <li><a href="<c:url value="/Supplier"/>">Supplier</a></li>
     <li><a href="<c:url value="/Product"/>">Product</a></li> 
     <li><a href="<c:url value="/category1"/>">category1</a></li>
     </security:authorize>
    </c1:if>
    
	 <li><a href="<c:url value="/mecakes"/>">Home</a></li>
	  <li><a href="<c:url value="/portfolios"/>">Portfolios</a></li>
      <li><a href="<c:url value="/flavours"/>">Flavours</a></li>
      <li><a href="<c:url value="/pricing"/>">Pricing</a></li>
	  <li><a href="<c:url value="/contact"/>">Contact</a></li>
<%-- 	  <li><a href="<c:url value="/user"/>">User</a></li> --%>
<%-- 	  <li><a href="<c:url value="/category"/>">Category</a></li> --%>
	   <c1:if test="${pageContext.request.userPrincipal.name==null}">
<%-- 	  <li><a href="<c:url value="/supplier"/>">Supplier</a></li> --%>
<%--       <li><a href="<c:url value="/product"/>">Product</a></li> --%>
      	  
	   </ul>
	  <ul class="nav navbar-nav navbar-right">
      <li><a href="<c:url value="/user"/>"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="<c:url value="/login"/>"><span class="glyphicon glyphicon-log-in"></span>Login</a></li>
      </c1:if>
    </ul>
 </div>
</nav>
<BR>
</body>
</html>