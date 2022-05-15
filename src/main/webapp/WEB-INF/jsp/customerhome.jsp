<!DOCTYPE html>
<html>
  <head>
   
<title>Customer Home Page</title>  
  </head>
  <body>
    <h1 style="font-size:60px;">Welcome to your Home Page</h1>
    <div id="advert">
        <button class="link" onclick="window.location.href = '/viewpropertycustomer';">View Property</button>
        <button class="link" onclick="window.location.href = '/searchbytype';">Search By Property Type</button>
        <button class="link" onclick="window.location.href = '/searchbycity';">Search By City</button>
        <br>
        <br>
         ${msg}
    </div>
</body>
</html>