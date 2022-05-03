<!DOCTYPE html>
<html>
  <head>
    <style>
  body {
  background-image:url("https://wallpaperaccess.com/full/449937.jpg");
  background-position: center;
  }
  #advert{
  width:auto ;
  height:200px;
  background: rgba(255,255,255, 0.5);
  border-radius:10px;
  padding: 100px;
  margin: 150px;
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
    <title>Broker Home Page</title>
    
  </head>
  <body>
    <h1>Welcome to your Home Page</h1>
    <div id="advert">
        <h3>Click on your choice</h3>
        <br>
        <button class="link" onclick="window.location.href = '/addproperty';">Add Property</button>
        <button class="link" onclick="window.location.href = '/viewproperty';">View Property</button>
        <br><br>
        <button class="link" onclick="window.location.href = '/viewdeals';">View Deals</button>
        <button class="link" onclick="window.location.href = '/viewcustomers';">View Customers</button>      
    </div>
</body>
</html>