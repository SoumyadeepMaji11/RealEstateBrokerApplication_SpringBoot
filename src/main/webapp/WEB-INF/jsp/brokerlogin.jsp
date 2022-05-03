<%@ page isELIgnored="false"%>
<html>
<head>

<title>Broker Login Page</title>
</head>
<body>
<h3>Enter Your UserID and Password</h3> 

	<form class="brokerlogin" action="logintobr" method="post">
		<pre>
		<strong class="log">Login Here</strong>
		
		Broker UserName: <input type="text" name="br_username" />
	
		Password: <input type="password" name="br_password" />

		<input class="link" type="submit" value="Login" />
		
		</pre>
	</form>
	${msg}
</body>
</html>