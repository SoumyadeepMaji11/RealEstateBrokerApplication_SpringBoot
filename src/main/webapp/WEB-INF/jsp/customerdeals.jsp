<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Property Details details</title>
</head>
<body>
<h1 style="font-size:60px;">All Deals Made</h1>
	<table border="2" width="70%" cellpadding="2">
        <tr>
        	<th>Id</th>
        	<th>Property ID</th>
            <th>Property Type</th>
            <th>City</th>
            <th>Price</th>
            <th>Customer ID</th>
        </tr>
        <c:forEach var="lst" items="${list}">
            <tr>
                <td>${lst.id}</td>
                <td>${lst.prop_id}</td>
                <td>${lst.prop_type}</td>
                <td>${lst.city}</td>
                <td>${lst.price}</td>
                 <td>${lst.cust_id}</td>
                 <td><a href="deletedeal/${lst.id}">Delete Deal</a></td>
            </tr>
        </c:forEach>
    </table>
		<br>
        <a class="link" href="brokerhome">Broker Home</a>
</body>
</html>