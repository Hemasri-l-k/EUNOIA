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
<body style="background-image: url(wallpap.jpg);background-repeat: no-repeat;background-size: cover;" >
  
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


<main style="display: flex; justify-content: center; align-items: center;margin-top: 60px;">

    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <!------ Include the above in your HEAD tag ---------->
    
     <div class="container">
                <div class="row">
                    <div class="col-md-6">
                        <div class="well-block">
                            <div class="well-title">
                                <h2 style="font-family: 'Times New Roman', Times, serif;font-weight: 700; color: white;">Book for the Event</h2>
                            </div>
                              <form  id="bookform" action="Book" method="get">
                                <!-- Form start -->
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label" for="name" style="color: white;">Name</label>
                                            <input id="name" name="name" type="text" placeholder="Name" class="form-control input-md" required>
                                        </div>
                                    </div>
                                    <!-- Text input-->
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label" for="email" style="color: white;">Email</label>
                                            <input id="email" name="email" type="text" placeholder="E-Mail" class="form-control input-md" required>
                                        </div>
                                    </div>
                                    <!-- Text input-->
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label" for="date" style="color: white;">Preferred Date (DD/MM/YYYY)</label>
                                            <input id="date" name="date" type="text" placeholder="Preferred Date" class="form-control input-md" required>
                                        </div>
                                    </div>
                                    <!-- Select Basic -->
                                    <div class="col-md-6">
                                        <div class="form-group">
                                            <label class="control-label" for="time" style="color: white;">Preferred Time</label>
                                            <select id="time" name="time" class="form-control">
                                                <option value="Select">--SELECT--</option>
                                                <option value="8:00AM to 2:00PM">8:00AM to 2:00PM</option>
                                                <option value="2:00PM to 8:00PM">2:00PM to 8:00PM</option>
                                                <option value="8:00PM to 12:00AM">8:00PM to 12:00AM</option>
                                            </select>
                                        </div>
                                    </div>
                                    <!-- Select Basic -->
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <label class="control-label" for="appointmentfor" style="color: white;">Event</label>
                                            <select id="appointmentfor" name="appointmentfor" class="form-control">
                                              <option value="Service#1">--SELECT--</option>
                                                <option value="1">Concerts</option>
                                                <option value="2">Weddings</option>
                                                <option value="3">Fam-Friends</option>
                                                <option value="4">B-days</option>
                                                <option value="5">Festive</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <label class="control-label" for="venue" style="color: white;">Venue</label>
                                            <select id="venue" name="venue" class="form-control">
                                              <option value="Service#1">--SELECT--</option>
                                                <option value="1">THE GAGAN PLAZA HOTEL, KANPUR</option>
                                                <option value="2">TAJ FISHERMAN'S COVE RESORT, CHENNAI</option>
                                                <option value="3">A ROYAL AFFAIR, UDAIPUR</option>
                                                <option value="4">MAYFAIR PALM BEACH RESORT, GOPALPUR</option>
                                                <option value="5">VEDIC VILLAGE SPA RESORT, KOLKATA</option>
                                                <option value="6">PALOLEM BEACH, GOA</option>
                                                
                                            </select>
                                        </div>
                                    </div>
                                    <!-- Button -->
                                    <div class="col-md-12">
                                         <input class="btn btn-outline-secondary text-light" type="submit" value=" Book The Event"> 
                                    </div>
                                </div>
                            </form>
                            <!-- form end -->
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="well-block">
                            <div class="well-title">
                                <h2 style="font-family: 'Times New Roman', Times, serif; color: white; font-weight: 600;">Why Book with Us?</h2>
                            </div>
                            <div class="feature-block">
                                <div class="feature feature-blurb-text">
                                    <h4 class="feature-title" style="color: white;">24/7 Hours Available</h4>
                                    <div class="feature-content">
                                        <p style="color: white;">_________</p>
                                    </div>
                                </div>
                                <div class="feature feature-blurb-text">
                                    <h4 class="feature-title" style="color: white;">Experienced Staff Available</h4>
                                    <div class="feature-content">
                                        <p style="color: white;">_________</p>
                                    </div>
                                </div>
                                <div class="feature feature-blurb-text">
                                    <h4 class="feature-title" style="color: white;">Affordable Price & Fees</h4>
                                    <div class="feature-content">
                                        <p style="color: white;">_________</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
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
</html>



