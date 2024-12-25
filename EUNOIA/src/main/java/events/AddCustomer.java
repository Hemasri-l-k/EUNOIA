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




public class AddCustomer extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String date=request.getParameter("date");
		String time=request.getParameter("time");
		String type=request.getParameter("appointmentfor");

		
		
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
			
			
			String q="insert into "
					+"customer(cust_name,cust_email,event_date,event_time,event_type) "
					+"values(?,?,?,?,?);";
			String q2="UPDATE event_s\n"
					+ "SET no_bookings = no_bookings + 1\n"
					+ "where event_id=?;";
			
			
			PreparedStatement pstmt2=con.prepareStatement(q2);

			//get the prepared statement object
			PreparedStatement pstmt=con.prepareStatement(q);

			pstmt.setString(1,name);
			pstmt.setString(2,email);
			pstmt.setString(3,date);
			pstmt.setString(4,time);
			pstmt.setString(5,type);
			pstmt2.setString(1, type);
			//set the values to query
			pstmt2.executeUpdate();
			pstmt.executeUpdate();

			
				
			
				
				RequestDispatcher rd= request.getRequestDispatcher("/db.jsp");
				rd.include(request, response);
				
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	  
	
}










