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
        
        </li>
      </ul>
    </div>
  </div>
</nav>

<main>
  
<section class="vh-50" style="">
  <div class="container py-5 h-50" style="opacity:0.8">
    <div class="row d-flex justify-content-center align-items-center h-50">
      <div class="col col-xl-10">
        <div class="card" style="border-radius: 1rem;">
          <div class="row g-0">
            <div class="col-md-6 col-lg-5 d-none d-md-block">
              <img src="img1.webp" 
                alt="login form" class="img-fluid img-responsive" style="border-radius: 1rem 0 0 1rem;height:70vh;" />
            </div>
            <div class="col-md-6 col-lg-7 d-flex align-items-center">
              <div class="card-body p-4 p-lg-5 text-black">

    <form  id="loginform" action="LogIn" method="get">

               

                  <h5 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;"><b class="display-5 times"> <b><b style="font-family: 'Times New Roman', Times, serif" >Log-in</b></b></b></h5>

                  <div class="form-outline mb-4">
                    <input type="email" id="form2Example17" name="email" class="form-control form-control-lg" required />
                    <label class="form-label" for="form2Example17">Email address</label>
                  </div>

                  <div class="form-outline mb-4">
                    <input type="password" id="form2Example27" name="password" class="form-control form-control-lg"  required/>
                    <label class="form-label" for="form2Example27">Password</label>
                  </div>

                  <div class="pt-1 mb-4">
                    <button class="btn btn-dark btn-lg btn-block" type="submit">Login</button>
                  </div>

                </form>

              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>



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