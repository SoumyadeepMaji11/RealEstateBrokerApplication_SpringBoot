<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
  body {
  background-image:url("https://cdn.wallpapersafari.com/7/44/smHnEA.jpg");
  background-position: center;
  }
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
  }table {
  width: 100%;
  border: 1px solid #000;
  }
  th, td {
  width: 25%;
  text-align: left;
  vertical-align: top;
  border: 1px solid #000;
  border-collapse: collapse;
  padding: 0.3em;
  caption-side: bottom;
  }
  th {
  background: rgba(192, 192, 192, 0.5);
  }
  tr{
  background: rgba(211, 211, 211, 0.2);
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