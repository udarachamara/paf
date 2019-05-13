<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EShop</title>
</head>
<body>

<form:form action="item.do" method="POST" commandName="item">

<div>
	<label>Id</label>
	<form:input path="ItemId"/>
</div>
	
<div>
	<label>Sid</label>
	<form:input path="StockId"/>
</div>
	
<div>
	<label>Name</label>
	<form:input path="ItemName"/>
</div>
	
<div>
	<label>Price</label>
	<form:input path="ItemPrice"/>
</div>
	
<div>
	<label>Quantity</label>
	<form:input path="Quantity"/>
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
			<td>${item.ItemId}</td>
			<td>${item.ItemName}</td>
			<td>${item.StockId}</td>
			<td>${item.ItemPrice}</td>
			<td>${item.Quantity}</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>