<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="java.sql.*" 
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>


<%

String userid =request.getParameter("username");  //getting data from user using element id 
String password =request.getParameter("password");

Connection connection = null;  //CREATING OBJECT OF CONNECTION 

ResultSet rs= null;  // holding result of sql query

int flag=0;


//connecting to database

String jdbcUrl = "jdbc:mysql://localhost:3306/bank?";
String username = "root";
String pass = "Dipak@123";

   try {
       // Load the MySQL JDBC Driver
       Class.forName("com.mysql.cj.jdbc.Driver");
       
       // Establish the connection
        connection = DriverManager.getConnection(jdbcUrl, username, pass);
         
      
   } 
   
   catch (ClassNotFoundException e) {
       e.printStackTrace();
       out.println("MySQL JDBC Driver not found.");
   } 
   
   catch (SQLException e) {
       e.printStackTrace();
       out.println("Connection failed.");
   }
   

try {
		PreparedStatement preparedStatement= connection.prepareStatement("Select userid, password From accountholder");
		rs = preparedStatement.executeQuery();
		
		
	

		
		while (rs.next()) {
           
           String uid = rs.getString("userid");
           String pass1 = rs.getString("password");
           
          
           
           if(uid.equals(userid)  && pass1.equals(password))
           {
           	  		
           		flag=1;
           		break;
           	     	
           }

          
           
       }
		
		if(flag==1)
		{
			 session = request.getSession();  //create session
			
			session.setAttribute("uid",userid);   //assigning value to session attribute 1 attribute name 2 is value
			
			response.sendRedirect("home.html");
			
			
			// redirecting page using request dispatcher
		//	RequestDispatcher rd =request.getRequestDispatcher("home.html");
		//	rd.forward(request, response);
		}
		
		else {
%>		
	
	  <center><h1><i>Sorry User Does not exist</i></h1> </center>
	  <center><h1><i><a href="index.html">Home</a></i></h1> </center>
	  
	  
<%			
		}
}
       catch (SQLException e) {
	    // TODO Auto-generated catch block
	    out.println("Cant Fetch Data");
}
%>
</body>
</html>