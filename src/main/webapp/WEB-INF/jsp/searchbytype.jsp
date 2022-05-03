<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search By Property Type</title>
</head>
<body>
    <h1 style="font-size:60px;">Property Search By Type</h1>
    <div id="advert">
        <div id="inner">Search Here ::-
        <br>
            <form id="form" action="/propsearch" method="post">
                Enter Property Type: <input class="fill" type="text" name="prop_type"><br>
                <input class="link" type="submit" value="Search">
            </form>
        </div>
    </div>
</body>
</html>