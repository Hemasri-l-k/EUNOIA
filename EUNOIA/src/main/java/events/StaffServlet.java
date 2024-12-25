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




public class StaffServlet extends HttpServlet {

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
			
			String q="select  org_id,org_name,org_phnum,designation,salary,DOJ "
					+"from  organisor;";
			
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
						+ "            <th scope=\"col\">Staff Id</th>\n"
						+ "            <th scope=\"col\">Staff name </th>\n"
						+ "            <th scope=\"col\">Phone number</th>\n"
						+ "            <th scope=\"col\">Designation </th>\n"
						+ "            <th scope=\"col\">Salary </th>\n"
						+ "            <th scope=\"col\">Date of joining </th>\n"

						
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
							+ "            <td>"+resultSet.getString(6)+"</td>\n"

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
						+"<h1 class=\"text-center text-light\">Add staff</h1>"
						
						+ "    <form  id=\"addstaff\" action=\"AddStaff\" method=\"get\">\n"
						+ "\n"
						+ "  <div class=\"form-group\">\n"
						+ "    <label class=\"text-light\" for=\"exampleInputEmail1\">Staff name</label>\n"
						+ "    <input type=\"text\" class=\"form-control\" name=\"name\" id=\"name\" aria-describedby=\"emailHelp\" placeholder=\"Enter Staff name\">\n"
						+ "  </div>\n"
						+ "  <div class=\"form-group \">\n"
						+ "    <label class=\"text-light\" for=\"exampleInputPassword1\">Phone number</label>\n"
						+ "    <input type=\"text\" class=\"form-control\" name=\"phonenumber\"class=\"phonenumber\" id=\"phonenumber\" placeholder=\"Phone number\">\n"
						+ "  </div>\n"
						+ "  <div class=\"form-group\">\n"
						+ "    <label class=\"text-light\" for=\"exampleInputdesignation\">designation</label>\n"
						+ "    <input type=\"text\" class=\"form-control\" name=\"designation\"class=\"designation\" id=\"designation\" placeholder=\"designation\">\n"
						+ "  </div>\n"
						+ "  <div class=\"form-group\">\n"

						+ "    <label class=\"text-light\" for=\"exampleInputsalary\">salary</label>\n"
						+ "    <input type=\"text\" class=\"form-control\" name=\"salary\"class=\"salary\" id=\"salary\" placeholder=\"salary\">\n"
						+ "  </div>\n"
						+ "  <div class=\"form-group\">\n"
						+ "    <label class=\"text-light\" for=\"exampleInputPassword1\">Date of joining</label>\n"
						+ "    <input type=\"text\" class=\"form-control\" name=\"DOJ\"class=\"DOJ\" id=\"DOJ\" placeholder=\" date of joining\">\n"
						+ "  </div>\n"
						
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











