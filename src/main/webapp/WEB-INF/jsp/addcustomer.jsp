<%@ page isELIgnored="false"%>
<html>
<head> 
<title>Customer Adding Page</title>
</head>
<body>
	<h3>Enter your Details</h3>

	<form class="addcustomer" action="saves" method="post">
		<pre>
	    <strong>Register Here | <a href="login">Click here to Login</a></strong>
		
		Customer Id <input class=box type="text" name="cust_id" />
				
		Customer Name <input class=box type="text" name="cust_name" placeholder="Enter your name"/>
			
		Age <input class=box type="number" id="quantity" name="cust_age" min="20" max="70"/>
		
		Gender <input type="radio" name="cust_gender" value="male"> Male <input type="radio" name="cust_gender" value="female"> Female
		
		Password <input class=box type="text" name="cust_password" placeholder="Enter your password" required/>
		
		<input class="link" type="submit" value="Register" />

	</pre>
	</form> 
	${msg}
</body>
</html>