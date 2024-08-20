package accountManagement;


public class Account {
		
	
	    // declaring fields
          private String user_id;
          private String password;
          private String name;
          private String address;
          private String city;
          private int balance;
          
         //Default Constructor
          public Account() {
    			
    		}
          
          
        //Parameterized constructor
          
          public Account(String user_id, String password, String name, String address, String city, int balance) {
  			
  			this.user_id = user_id;
  			this.password = password;
  			this.name = name;
  			this.address = address;
  			this.city = city;
  			this.balance = balance;
  		}
		
		
		//setter getter method
		public String getUser_id() {
			return user_id;
		}
		
		public void setUser_id(String user_id) {
			this.user_id = user_id;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
          

	
			
}





