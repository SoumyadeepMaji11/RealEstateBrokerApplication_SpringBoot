<%@ page isELIgnored="false"%>
<html>
<head>
<title>Login Page </title>
</head>
<body>
 <h3>Enter Your UserName and Password</h3>	
	<form class="logincustomer" action="loginto" method="post">
		<pre>
      <strong>Login Here | <a href="registration">Click here to Register</a></strong>
		
		User Name <input class="name" type="text" name="cust_name" placeholder="Enter your Username"/>
	
		Password <input class="pswd" type="password" name="cust_password" placeholder="Enter your password"/>

		<input class="link" type="submit" value="Login" />
		
		</pre>
	</form>
	<br>
	${msg}
</body>
</html>