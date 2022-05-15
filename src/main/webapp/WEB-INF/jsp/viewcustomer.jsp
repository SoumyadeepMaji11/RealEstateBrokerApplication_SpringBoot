<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Details</title>
</head>
<body>
<h1 style="font-size:60px;">All Customers</h1>
	<table border="2" width="70%" cellpadding="2">
        <tr>
        	<th>Id</th>
        	<th>Customer ID</th>
            <th>Customer Name</th>
            <th>Customer Age</th>
            <th>Gender</th>
         
        </tr>
        <c:forEach var="lst" items="${list}">
            <tr>
                <td>${lst.id}</td>
                <td>${lst.cust_id}</td>
                <td>${lst.cust_name}</td>
                <td>${lst.cust_age}</td>
                <td>${lst.cust_gender}</td>
               
             
            </tr>
        </c:forEach>
    </table>
		<br>
		
        <button class="link" onclick="window.location.href = '/brokerhome';">Broker Home</button>
</body>
</html>