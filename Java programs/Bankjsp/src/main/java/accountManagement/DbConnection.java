package accountManagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	Connection connection = null;  //CREATING OBJECT OF CONNECTION 
	 
	 //connecting to database

	private String jdbcUrl = "jdbc:mysql://localhost:3306/statebank?";
	private String username = "root";
	private String pass = "Mysql@12";

	
	public  Connection getConnection() {
		
	
	    try {
	        // Load the MySQL JDBC Driver
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        
	        // Establish the connection
	         connection = DriverManager.getConnection(jdbcUrl,username,pass);	            
	          	           	            	           
	        } 
	    
	    catch (ClassNotFoundException e) {
	        e.printStackTrace();
	        System.out.println("MySQL JDBC Driver not found.");
	    } 
	    
	    catch (SQLException e) {
	        e.printStackTrace();
	        System.out.println("Connection failed.");
	        
	    }
	  
	    return connection;
	}

}
