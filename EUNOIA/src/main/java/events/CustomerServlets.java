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




public class CustomerServlets extends HttpServlet {

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
			
			String q="select cust_name,cust_email,event_date,event_time,event_s.event_type  \n"
					+ "from  customer,event_s \n"
					+ "where event_s.event_id=customer.event_type;";
		
			
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
						+ "            <th scope=\"col\">Customer name </th>\n"
						+ "            <th scope=\"col\">Customer email</th>\n"
						+ "            <th scope=\"col\"> Event date</th>\n"
						+ "            <th scope=\"col\">Event time</th>\n"
						+ "            <th scope=\"col\"> Event type </th>\n"

						
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
							+ "            <td>"+resultSet.getString(4)+"</td>\n"
							+ "            <td>"+resultSet.getString(5)+"</td>\n"


							
							+ "            \n"
							+ "          </tr>");
	        
	      
				}
				
				out.println("        \n"
						+ "        </tbody>\n"
						+ "      </table>\n"
						+ "</div>\n"
						+ "\n"
						+ "");
				
				
				out.println("  <div class=\"m-5 p-5\">\n"
						+"<h1 class=\"text-center text-light\">Add Customers</h1>"

						+ "    <form  id=\"addcustomer\" action=\"AddCustomer\" method=\"get\">\n"
						+ "\n"
						+ "  <div class=\"form-group text-light\">\n"
						+ "    <label class=\" text-light\" for=\"exampleInputEmail1\">Email address</label>\n"
						+ "    <input type=\"email\" class=\"form-control\" name=\"email\"id=\"email\" aria-describedby=\"emailHelp\" placeholder=\"Enter email\">\n"
						+ "  </div>\n"
						+ "  <div class=\"form-group\">\n"
						+ "    <label class=\" text-light \" for=\"exampleInputPassword1\">Name</label>\n"
						+ "    <input type=\"text\" class=\"form-control\" name=\"name\" id=\"name\" placeholder=\"User name\">\n"
						+ "  </div>\n"
						
						+" <div class=\"col-md-6\">\n"
						+ "                                        <div class=\"form-group\">\n"
						+ "                                            <label class=\"control-label\" for=\"date\" style=\"color: white;\">Preferred Date (DD/MM/YYYY)</label>\n"
						+ "                                            <input id=\"date\" name=\"date\" type=\"text\" placeholder=\"Preferred Date\" class=\"form-control input-md\" required>\n"
						+ "                                        </div>\n"
						+ "                                    </div>"
						
						+"<div class=\"form-group\">\n"
						+ "                                            <label class=\"control-label\" for=\"time\" style=\"color: white;\">Preferred Time</label>\n"
						+ "                                            <select id=\"time\" name=\"time\" class=\"form-control\">\n"
						+ "                                                <option value=\"Select\">--SELECT--</option>\n"
						+ "                                                <option value=\"8:00AM to 2:00PM\">8:00AM to 2:00PM</option>\n"
						+ "                                                <option value=\"2:00PM to 8:00PM\">2:00PM to 8:00PM</option>\n"
						+ "                                                <option value=\"8:00PM to 12:00AM\">8:00PM to 12:00AM</option>\n"
						+ "                                            </select>\n"
						+ "                                        </div>"
						+"  <div class=\"form-group\">\n"
						+ "                                            <label class=\"control-label\" for=\"appointmentfor\" style=\"color: white;\">Event</label>\n"
						+ "                                            <select id=\"appointmentfor\" name=\"appointmentfor\" class=\"form-control\">\n"
						+ "                                              <option value=\"Service#1\">--SELECT--</option>\n"
						+ "                                                <option value=\"1\">Consert</option>\n"
						+ "                                                <option value=\"2\">Weddings</option>\n"
						+ "                                                <option value=\"3\">Fam-Friends</option>\n"
						+ "                                                <option value=\"4\">B'days</option>\n"
						+ "                                                <option value=\"5\">Festive</option>\n"
						+ "                                            </select>\n"
						+ "                                        </div>"
				
				
						+ "  <button type=\"submit\" class=\"btn btn-secondary m-3\">ADD</button>\n"
						+ "</form>\n"
						+ "</div>\n"
						+ ""
						
					);
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	  
	
}











