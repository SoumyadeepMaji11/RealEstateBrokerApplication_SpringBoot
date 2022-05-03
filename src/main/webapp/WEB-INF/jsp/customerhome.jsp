<!DOCTYPE html>
<html>
  <head>
    <style>
  body {
  background-image:url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRryW1brmU_6LPzlUAqf86VQrr98-uMQRYuNg&usqp=CAU");
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
  }
  #advert{
  width:auto ;
  height:100px;
  background: rgba(255,255,255, 0.5);
  border-radius:10px;
  padding: 100px;
  margin: 150px;
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
<title>Customer Home Page</title>  
  </head>
  <body>
    <h1 style="font-size:60px;">Welcome to your Home Page</h1>
    <div id="advert">
        <button class="link" onclick="window.location.href = '/viewpropertycustomer';">View Property</button>
        <button class="link" onclick="window.location.href = '/searchbytype';">Search By Property Type</button>
        <br><br>
        <button class="link" onclick="window.location.href = '/searchbycity';">Search By City</button>
         ${msg}
    </div>
    ${msg}
</body>
</html>