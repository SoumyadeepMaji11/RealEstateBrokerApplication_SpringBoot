<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<style>
  h1 {
  color: black;
  text-align: center;
  text-style:solid;
  font-size:80px;
  font-family:Georgia, serif;
  background-color:white;
  opacity:0.6;
  border-style: solid;
  border-color:white;
  border-radius:10px;
  padding:8px;
  }
  .link{
  font-size:40px;
  border-radius:7px;
  background-color:rgba(192,192,192,0.6);
  margin-right:15px;
  }
  .link:hover{
  background-color:white;
  box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);
  }
</style>
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