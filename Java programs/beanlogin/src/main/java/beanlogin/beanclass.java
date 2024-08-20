package beanlogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class beanclass {
	private int rollno;
	private String name;
	private String city;
	private String address;
	
	public beanclass() {
		
	}

	public beanclass(int rollno, String name, String city, String address) {
		this.rollno = rollno;
		this.name = name;
		this.city = city;
		this.address = address;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
	 public void insertdata() {
	        String jdbcURL = "jdbc:mysql://localhost:3306/ourdb";
	        String dbUser = "root";
	        String dbPassword = "Dipak@123";

	        String sql = "INSERT INTO sd (rollNo, name, city, address) VALUES (?, ?, ?, ?)";

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
	            PreparedStatement statement = connection.prepareStatement(sql);
	            statement.setInt(1, getRollno());
	            statement.setString(2, getName());
	            statement.setString(3, getCity());
	            statement.setString(4, getAddress());

	            int rows = statement.executeUpdate();
	            statement.close();
	            connection.close();
	            if(rows==1) {
	            	System.out.println("data entered succesfully");
	            }
	            else {
	            	System.out.println("no data entered");
	            }
	            

	       
	        	
	        }
	        catch (SQLException | ClassNotFoundException e) {
	            e.printStackTrace();
	           
	        }
	    
	 }
	 public List<beanclass> showData() {
	        List<beanclass> students = new ArrayList<>();
	        String jdbcURL = "jdbc:mysql://localhost:3306/ourdb";
	        String dbUser = "root";
	        String dbPassword = "Dipak@123";

	        String sql = "SELECT * FROM sd";

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
	            PreparedStatement statement = connection.prepareStatement(sql);
	            ResultSet resultSet = statement.executeQuery();

	            while (resultSet.next()) {
	                int rollno = resultSet.getInt("rollNo");
	                String name = resultSet.getString("name");
	                String city = resultSet.getString("city");
	                String address = resultSet.getString("address");

	                beanclass student = new beanclass(rollno, name, city, address);
	                students.add(student);
	            }

	            resultSet.close();
	            statement.close();
	            connection.close();
	        } catch (SQLException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }

	        return students;
	    }
	
	 public boolean authenticate(String name, String password) {
	        String jdbcURL = "jdbc:mysql://localhost:3306/Bank";
	        String dbUser = "root";
	        String dbPassword = "Dipak@123";

	        String sql = "SELECT * FROM AccountHolder WHERE name = ? AND password = ?";

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
	            PreparedStatement statement = connection.prepareStatement(sql);
	            statement.setString(1, name);
	            statement.setString(2, password);

	            ResultSet resultSet = statement.executeQuery();

	            boolean isValid = resultSet.next();
	            resultSet.close();
	            statement.close();
	            connection.close();

	            return isValid;
	        } catch (SQLException | ClassNotFoundException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
}