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




public class AddStaff extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String phnum=request.getParameter("phonenumber");
		String designation=request.getParameter("designation");
		String salary = request.getParameter("salary");
		String DOJ = request.getParameter("DOJ");

		
		
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
					+"organisor(org_name,org_phnum,designation,salary,DOJ) "
					+"values(?,?,?,?,?);";
			
			
			
			//get the prepared statement object
			PreparedStatement pstmt=con.prepareStatement(q);

			pstmt.setString(1,name);
			pstmt.setString(2,phnum);
			pstmt.setString(3,designation);
			pstmt.setString(4,salary);
			pstmt.setString(5,DOJ);

		
			//set the values to query
			
			pstmt.executeUpdate();

			
				
			
				
				RequestDispatcher rd= request.getRequestDispatcher("/db.jsp");
				rd.include(request, response);
				
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	  
	
}











