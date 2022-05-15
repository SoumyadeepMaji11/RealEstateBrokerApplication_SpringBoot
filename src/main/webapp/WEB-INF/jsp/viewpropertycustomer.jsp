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
<h1 style="font-size:60px;">All Available Properties</h1>
	<table border="2" width="70%" cellpadding="2">
        <tr>
        	<th>Id</th>
            <th>Property Type</th>
            <th>Offer Type</th>
            <th>City</th>
            <th>Price</th>
        </tr>
        <c:forEach var="lst" items="${list}">
            <tr>
                <td>${lst.id}</td>
                <td>${lst.prop_type}</td>
                <td>${lst.offer_type}</td>
                <td>${lst.city}</td>
                <td>${lst.price}</td>
                <td><a href="registerproperty/${lst.id}">Click Here to Register</a></td>
            </tr>
        </c:forEach>
    </table>
		<br>
		<button class="link" onclick="window.location.href = '/customerhome';">Customer Home</button>
</body>
</html>