package events;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;




public class BookServlet extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		

		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String date=request.getParameter("date");
		String time=request.getParameter("time");
		String appointmentfor=request.getParameter("appointmentfor");
		String venue=request.getParameter("venue");
		
		
		
		try {
			//load the driver:
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//creating a connection

			
			String url = "jdbc:mysql://Localhost:3306/eventmanagement";
			String user="root";
			String password="Lokesh@123";
			Connection con=DriverManager.getConnection(url,user,password);
			
		
			if(con.isClosed()) {
				System.out.println("connection is closed");
			}
			else {
				System.out.println("connection is open");

			}
			
			
			String q1="insert into customer "
					+ "values(?,?,?,?,?)";
			String q= " insert into "
					+ " bookings(cust_email,event_date,event_time,event_type,venue_id) "
					+ " values(?,?,?,?,?)";
			
			
			//get the prepared statement object
			PreparedStatement pstmt=con.prepareStatement(q);
			PreparedStatement pstmt1=con.prepareStatement(q1);
			//set the values to query//
			
			pstmt.setString(1,email);
			pstmt.setString(2,date);
			pstmt.setString(3,time);
			pstmt.setString(4,appointmentfor);
			pstmt.setString(5,venue);

			
			pstmt1.setString(1,name);
			pstmt1.setString(2, email);
			pstmt1.setString(3,date);
			pstmt1.setString(4,time);
			pstmt1.setString(5,appointmentfor);
pstmt1.executeUpdate();
			
			int count=pstmt.executeUpdate();
			
			if(count>0) {
				
				response.setContentType("text/html");
		
				
				out.println(" <div class=\"alert mt-0 mb-0 alert-success\" role=\"alert\">\n"
						+ "  <h4 class=\"alert-heading mt-0 mb-0\">Thank you for booking!</h4>\n"
						+ "  <p>Your request is received,you will receive a confirmation within 1-2 working days.</p>\n"
						+ "  <hr>\n"
						+ "</div>"  );
				
				RequestDispatcher rd= request.getRequestDispatcher("/index.jsp");
				rd.include(request, response);
				
			}
			else {

				response.setContentType("text/html");
				out.println("<h3 style='color:red'> error occured</h3>");
				
				RequestDispatcher rd= request.getRequestDispatcher("/index.jsp");
				rd.include(request, response);
				
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	  
	
}











