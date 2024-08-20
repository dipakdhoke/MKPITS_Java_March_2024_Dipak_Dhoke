<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="java.sql.*"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="sucess_failed_page.css">
</head>
<body>
<% 



Connection connection = null;  //CREATING OBJECT OF CONNECTION 
ResultSet rs=null;

int flag=1;

 int balance =0;  //for storing balance
 
 session=request.getSession(false);  //creating session 

String uid=(String)session.getAttribute("uid"); //accesing session value

int amount = Integer.parseInt(request.getParameter("amount")); 


//connecting to database

 String jdbcUrl = "jdbc:mysql://localhost:3306/statebank?";
 String username = "root";
 String pass = "Mysql@12";

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
    
    
    //fetching available balance
    
    try {
		PreparedStatement preparedStatementbal= connection.prepareStatement("Select balance From acc_master where user_id=?");
		preparedStatementbal.setString(1, uid);
		
		
		 rs = preparedStatementbal.executeQuery();
	
		 if(rs.next())
		  balance = rs.getInt("balance");
		        
		 out.println(balance);

		 
		if(amount>balance)
		{
		flag=0;	
		out.println("Insuffiecient Amount in account");	
		}
    
}
    
    
    catch (SQLException e)
    {
		// TODO Auto-generated catch block
		out.println("Cant Fetch Data");
	}
    

    if(flag==1)    //execute only when amount < balance
	   {                 
	        
	        //inserting data in transaction table
	        try 
			 {
					 PreparedStatement preparedStatementinsert= connection.prepareStatement("insert into transactions(user_id,tr_amount,tr_type) values(?,?,'withdawl');");
					 
					 preparedStatementinsert.setString(1,uid);
					 preparedStatementinsert.setInt(2, amount);
			
			         
			         preparedStatementinsert.executeUpdate();
			         
			 }       
	        
	        catch (SQLException e)
	        {
	            out.println(e);
	        }
	        
	        
	        
	        //updating balance
			 try 
			 {
				     balance-=amount;
					 PreparedStatement preparedStatement= connection.prepareStatement("UPDATE acc_master SET balance = ? WHERE user_id=?;");
					 preparedStatement.setInt(1, balance);
			         preparedStatement.setString(2,uid);
			         
			         
			         if (preparedStatement.executeUpdate()==1)
			            {
			        	%>
			        	 <div class="container">
                        <div class="message">
                       <h1>Transaction Successful</h1>
                       <a href="home.html" class="home-link">Home</a>
                         </div>
                           </div>
			        	
			        	<% 
			            }    
			            else{
			                %>
			                <div class="container">
                              <div class="message">
                        <h1>Transaction Unsuccessful</h1>
                        <a href="home.html" class="home-link">Home</a>
         				  </div>
      						  </div>
			                
			  <% 
			            }
							
			 }
				

			 catch (SQLException e)
		        {
		            out.println(e);
		        }
	   }
    
            %>
</body>
</html>