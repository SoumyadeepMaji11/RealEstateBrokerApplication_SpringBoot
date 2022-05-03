<%@ page isELIgnored="false"%>
<html>
<head>
<title>Property Editing Page</title>
</head>
<body>
	<h3>Enter Property Details</h3>

	<form action="save" method="post">
		<pre>
	    <strong>Add Property Here </strong>

		Property ID: <input type="text" name="prop_id" />
		
		Offer Type <input type="text" name="offer_type" />
	
		City <input type="text" name="city" />

		Price <input type="text" name="price" />
	
		<input type="submit" value="Update Property" />
	</pre>
	</form>
	${msg}
</body>
</html>