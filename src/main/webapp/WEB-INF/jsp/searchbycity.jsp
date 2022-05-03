<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search By City</title>
</head>
<body>
    <h1 style="font-size:60px;">Property Search By City</h1>
    <div id="advert">
        <div id="inner">Search Here ::-
        <br>
            <form id="form" action="/citysearch" method="post">
                Enter City: <input class="fill" type="text" name="city"><br>
                <input class="link" type="submit" value="Search">
            </form>
        </div>
    </div>
</body>
</html>