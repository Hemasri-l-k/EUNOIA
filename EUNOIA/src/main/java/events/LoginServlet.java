
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



public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		

		String email=request.getParameter("email");
		String pw=request.getParameter("password");
		
		
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
			
			
			String q="select uid "
					+"from users where user_email='"+email+"' "
					+"and user_password='"+pw+"'";
			
			//get the prepared statement object
			PreparedStatement pstmt=con.prepareStatement(q);
			
			//set the values to query
			
			//pstmt.setString(1,group);
		
			ResultSet resultSet=pstmt.executeQuery();

			if(resultSet.next()) {
				
				RequestDispatcher rd= request.getRequestDispatcher("/db.jsp");
				rd.include(request, response);
			}
			else {
				response.setContentType("text/html");
				out.println(" <div class=\"alert mt-0 mb-0 alert-danger\" role=\"alert\">\n"
						+ "  <h4 class=\"alert-heading mt-0 mb-0\">Incorrect details!</h4>\n"
						+ "  <p>“Please check the mail-id , password and try again.”\n</p>\n"
						+ "  <hr> \n"
						+ "</div>"  );
				RequestDispatcher rd= request.getRequestDispatcher("/login.jsp");
				rd.include(request, response);
			}
				
	
				
	
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	  
	
}
