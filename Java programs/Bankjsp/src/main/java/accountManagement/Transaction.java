package accountManagement;

import java.net.http.HttpRequest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.http.HttpSession;

public class Transaction {
	
	Connection connection=null;
	
	ResultSet rs;
	
	List<TransactionEntity> tr_list = new ArrayList<TransactionEntity>();
	
	
	//Establishing database connection by calling getConnection inside constructor
	
	public Transaction() {
		DbConnection dbConnection = new DbConnection();
		connection=dbConnection.getConnection();
		
	}



	public int getRegister(Account ac) {
		
		int flag=0;
		  
        try {
        	
        	
        	
            PreparedStatement preparedStatement=connection.prepareStatement("insert into acc_master (user_id,password,name,address,city,balance) values(?,?,?,?,?,?);");
            preparedStatement.setString(1,ac.getUser_id());
            preparedStatement.setString(2,ac.getPassword());
            preparedStatement.setString(3,ac.getName());
            preparedStatement.setString(4,ac.getAddress());
            preparedStatement.setString(5,ac.getCity());
            preparedStatement.setInt(6,ac.getBalance());

            
            
            

            if (preparedStatement.executeUpdate()==1)
            {
               flag=1;
                
            }    
          
            else {
        	   
                 flag=0;
                }
            
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
	return flag;
	}

	
	public List<TransactionEntity> getHistory(String uid) {
		
        
		
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement("select * from transactions where user_id=? ");
			preparedStatement.setString(1, uid);
			rs = preparedStatement.executeQuery();
			while (rs.next()) {
				
				TransactionEntity transactionEntity = new TransactionEntity(rs.getString("user_id"),rs.getString("tr_date"),rs.getInt("tr_amount"),rs.getString("tr_type"));
				tr_list.add(transactionEntity);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return tr_list;	
	}
	
	
	
	public int getBal(String uid) {
		
		int balance = 0;
		try {
			
			PreparedStatement preparedStatement=connection.prepareStatement("select balance from acc_master where user_id=? ");
			preparedStatement.setString(1, uid);
			rs = preparedStatement.executeQuery();
			
			if (rs.next()) {
				balance = rs.getInt("balance");
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		return balance;
	}
}
