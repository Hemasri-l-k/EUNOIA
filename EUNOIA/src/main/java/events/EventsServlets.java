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




public class EventsServlets extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		

		
		
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
			
			String q="select  event_id,event_type,appx_cost,no_bookings "
					+"from  event_s;";
			
			//get the prepared statement object
			PreparedStatement pstmt=con.prepareStatement(q);
			
			//set the values to query
			
			ResultSet resultSet=pstmt.executeQuery();

			
				
			
				
				RequestDispatcher rd= request.getRequestDispatcher("/add.jsp");
				rd.include(request, response);
				
				out.println("<div class=\"table-responsive\">\n"
						+ "      <table class=\"table table-striped  \">\n"
						+ "        <thead>\n"
						+ "          <tr>\n"
						+ "            <th scope=\"col\">Event Id</th>\n"
						+ "            <th scope=\"col\">Event type</th>\n"
						+ "            <th scope=\"col\">approximate cost</th>\n"
						+ "            <th scope=\"col\">no of bookings</th>\n"

						
						+ "            \n"
						+ "          </tr>\n"
						+ "        </thead>\n"
						+ "        \n"
						+ "       \n"
						+ "        <tbody>\n"
						+ "        ");

				while(resultSet.next()){
					response.setContentType("text/html");

					out.println("\n"
							+ "        \n"
							+ "          <tr>\n"
							+ "            <th scope=\"row\">"+resultSet.getString(1)+"</th>\n"
							+ "            <td>"+resultSet.getString(2)+"</td>\n"
							+ "            <td>"+resultSet.getString(3)+"</td>\n"
							+ "            \n"
							+ "            <td>"+resultSet.getString(4)+"</td>\n"
							+ "            \n"
							+ "          </tr>");
	        
	      
				}
				
				out.println("        \n"
						+ "        </tbody>\n"
						+ "      </table>\n"
						+ "</div>\n"
						+ "\n"
						+ "");
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	  
	
}











