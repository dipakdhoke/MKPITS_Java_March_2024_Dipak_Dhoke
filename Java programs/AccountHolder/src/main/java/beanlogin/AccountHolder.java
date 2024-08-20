package beanlogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountHolder {
    private int userid;
    private String name;
    private String city;
    private String address;
    private double balance;
    private String password;

    // Constructors
    public AccountHolder() {}

    public AccountHolder(String name, String password) {
        this.name = name;
        this.password = password;
    }

    // Getters and Setters
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Method to validate user
    public boolean validateUser() {
        boolean isValid = false;
        String jdbcURL = "jdbc:mysql://localhost:3306/bank";
        String dbUser = "root";
        String dbPassword = "Dipak@123";

        String sql = "SELECT * FROM accountholder WHERE name = ? AND password = ?";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                isValid = true;
                this.userid = resultSet.getInt("userid");
                this.city = resultSet.getString("city");
                this.address = resultSet.getString("address");
                this.balance = resultSet.getDouble("balance");
            }

            statement.close();
            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return isValid;
    }

    // Method to deposit money
    public boolean deposit(double amount) {
        if (amount <= 0) return false;
        this.balance += amount;
        return updateBalanceInDatabase();
    }

    // Method to withdraw money
    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > this.balance) return false;
        this.balance -= amount;
        return updateBalanceInDatabase();
    }

    private boolean updateBalanceInDatabase() {
        String jdbcURL = "jdbc:mysql://localhost:3306/bank";
        String dbUser = "root";
        String dbPassword = "Dipak@123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            // Update balance in accountholder table
            String updateBalanceSQL = "UPDATE accountholder SET balance = ? WHERE userid = ?";
            PreparedStatement updateBalanceStmt = connection.prepareStatement(updateBalanceSQL);
            updateBalanceStmt.setDouble(1, this.balance);
            updateBalanceStmt.setInt(2, this.userid);
            updateBalanceStmt.executeUpdate();

            updateBalanceStmt.close();
            connection.close();
            return true;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
