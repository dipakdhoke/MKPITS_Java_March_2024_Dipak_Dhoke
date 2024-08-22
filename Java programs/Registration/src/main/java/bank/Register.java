
package bank;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	    response.setContentType("text/html");  //setting content text or html
		
		PrintWriter pw = response.getWriter(); // CREATING OBJECT OF GET WRITER() "PW" FOR PRINTING
		
		
        Connection connection = null;  //CREATING OBJECT OF CONNECTION 
		
		ResultSet rs= null;  // holding result of sql query
		
		
		 String name =request.getParameter("name");  //getting data from user using element id 
	     String address =request.getParameter("address");
	     String userid =request.getParameter("userid");
	     String pass =request.getParameter("password");
	     int balance =Integer.parseInt(request.getParameter("balance"));
	     String city =request.getParameter("city");


		
		
		
		 String jdbcUrl = "jdbc:mysql://localhost:3306/bank";
	     String username = "root";
	     String password = "Dipak@123";

	        try {
	            // Load the MySQL JDBC Driver
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            
	            // Establish the connection
	             connection = DriverManager.getConnection(jdbcUrl, username, password);
	            
	              
	           
	            
	           
	        } 
	        
	        catch (ClassNotFoundException e) {
	            e.printStackTrace();
	            pw.println("MySQL JDBC Driver not found.");
	        } 
	        
	        catch (SQLException e) {
	            e.printStackTrace();
	            pw.println("Connection failed.");
	        }
	        
	        
	        
	        try {
	            PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO AccountHolders (userid,name, city, address, balance, password) VALUES (?, ?, ?, ?, ?,?)");
	            preparedStatement.setString(1,name);
	            preparedStatement.setString(2,city);
	            preparedStatement.setString(3,address);
	            preparedStatement.setInt(4,balance);
	            preparedStatement.setString(5,password);
	            preparedStatement.setString(6,userid);
	            
	            
	            
	            

	            if (preparedStatement.executeUpdate()==1)
	            {
	            	pw.println("<center><h1 style='color: blue; font-family: Arial, sans-serif; font-size: 36px; background-color: lightgray; padding: 10px; border-radius: 10px;'>Register Successfully Done "+name+"</h1></center>");

	                
	            }    
	            else
	                pw.println("Cannot insert record");


	        }
	        catch (SQLException e)
	        {
	            pw.println(e);
	        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}