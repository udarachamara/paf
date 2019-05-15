<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EShop</title>

        
<link href="${pageContext.request.contextPath}/resources/assets/css/bootstrap.min.css" rel="stylesheet" >

</head>
<body>

${pageContext.request.contextPath}

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Link</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Dropdown
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Action</a>
          <a class="dropdown-item" href="#">Another action</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Something else here</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="#">Disabled</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>

<form:form action="item.do" method="POST" commandName="item">

<div>
	<label>Id</label>
	<form:input path="itemId"/>
</div>
	
<div>
	<label>Sid</label>
	<form:input path="stockId"/>
</div>
	
<div>
	<label>Name</label>
	<form:input path="itemName"/>
</div>
	
<div>
	<label>Price</label>
	<form:input path="itemPrice"/>
</div>
	
<div>
	<label>Quantity</label>
	<form:input path="quantity"/>
</div>
	
	<input type="submit" name="action" value="Add"/>
	
	<input type="submit" name="action" value="Edit"/>
	
	<input type="submit" name="action" value="Delete"/>
	
	<input type="submit" name="action" value="Search"/>
</form:form>

<table border="1">
	<tr>
		<th>ID</th>
		<th>NAME</th>
		<th>SID</th>
		<th>PRICE</th>
		<th>QUANTITY</th>
	</tr>
	<c:forEach items="${itemList}" var="item">
		<tr>
			<td>${item.itemId}</td>
			<td>${item.itemName}</td>
			<td>${item.stockId}</td>
			<td>${item.itemPrice}</td>
			<td>${item.quantity}</td>
		</tr>
	</c:forEach>
</table>


	<script src="assets/js/bootstrap.min.js"></script>
	
	<script src="assets/js/jquery.min.js"></script>

</body>
</html>