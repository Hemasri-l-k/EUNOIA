<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  <title>Document</title>
</head>
<body style="background-image: url(wallpap.jpg);background-repeat: no-repeat;background-size: cover;">
  
<nav class="navbar navbar-expand-lg bg-body-tertiary" style="height: 100px;">
  <div class="container-fluid">
    <a class="navbar-brand font-weight-bold" href="index.jsp" style="font-family: 'Times New Roman', Times, serif;" > <h1><b class="d-4">EUNOIA</b></h1></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
      <ul class="navbar-nav m-2 p-2 " style="font-family: 'Times New Roman', Times, serif;">
        <li class="nav-item m-2 p-2" style="font-size: larger;">
          <a class="nav-link active " aria-current="page" href="index.jsp" >Home</a>
        </li>
        <li class="nav-item m-2 p-2" style="font-size: larger;">
          <a class="nav-link " href="events.jsp">Events</a>
        </li>
        <li class="nav-item m-2 p-2" style="font-size: larger;">
          <a class="nav-link" href="location.jsp">Location</a>
        </li>
        <li class="nav-item m-2 p-2" style="font-size: larger;">
          <a class="nav-link" href="gallery.jsp">Gallery</a>
          <li class="nav-item m-2 p-2" style="font-size: larger;">
            <a class="nav-link" href="login.jsp">Login</a>  
        </li>
      </ul>
    </div>
  </div>
</nav>
 
<main style="display: flex; justify-content: center; align-items: center;margin-top: 60px" class="m-5">


  <div class="card m-5" style="width: 18rem;">
    <img class="card-img-top" src="2.jpg" alt="Card image cap">
    <div class="card-body">
      <h5 class="card-title">EVENTS</h5>
      <p class="card-text">example text</p>
          <form  id="viewevents" action="ViewEvents" method="get">
              <input type="submit" value="View">
          
      </form>
    </div>
  </div>
  <div class="card m-5" style="width: 18rem;">
    <img class="card-img-top" src="3.jpg" alt="Card image cap">
    <div class="card-body">
      <h5 class="card-title">CUSTOMER DETAILS</h5>
      <p class="card-text">example text</p>
  <form  id="viewcustomers" action="ViewCustomers" method="get">
              <input type="submit" value="View">
          
      </form>    </div>
  </div>
  <div class="card m-5" style="width: 18rem;">
    <img class="card-img-top" src="4.jpg" alt="Card image cap">
    <div class="card-body">
      <h5 class="card-title">STAFF</h5>
      <p class="card-text">example text</p>
        <form  id="ViewStaff" action="ViewStaff" method="get">
              <input type="submit" value="View">
          
      </form>
    </div>
  </div>

</main>



<footer class="bg-body-tertiary text-center text-lg-start fixed-bottom">
  <!-- Copyright -->
  <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.05);">
    © 2024 Copyright:
    <a class="text-body" href="https://cats.com">hh.com</a>
  </div>
  <!-- Copyright -->
</footer>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</html>