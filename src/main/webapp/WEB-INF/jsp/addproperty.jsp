<%@ page isELIgnored="false"%>
<html>

<head>
<title>Property Adding Page</title>
</head>
<body>
	<h3>Enter Property Details</h3>

	<form class="addproperty" action="save" method="post">
		<pre>
	    <strong class="line">Add Property Here</strong>
	    
	  Property ID <input class=box type="text" name="prop_id" />
		
		Property Type <input class=box type="text" name="prop_type" />
		
		Offer Type <input class=box type="text" name="offer_type" />
	
		City <input class=box type="text" name="city" />

		Price <input class=box type="text" name="price" />
	
		<input class="link" type="submit" value="Update Property" /> | <strong><a href = "/viewproperty">View Property</a></strong>
	</pre>
	</form>
	
	<br>
	${msg}
</body>
</html>