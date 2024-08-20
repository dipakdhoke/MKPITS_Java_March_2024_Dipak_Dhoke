package accountManagement;

public class TransactionEntity {
	
	//declaring variable of transaction table
	private String user_id;
	private String date;
	private int amount;
	private String type;
	
	//default constructor
	public TransactionEntity() {
		
	}

	// parameterized constructor
	public TransactionEntity(String user_id, String date, int amount, String type) {
		
		this.user_id = user_id;
		this.date = date;
		this.amount = amount;
		this.type = type;
	}


	
	//getter setter
	public String getUser_id() {
		return user_id;
	}


	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	

	
}
