package Customer;

public class CustomerTable {
	private int id; 
	   private String CustomerID;  
	   private String LastName;
	   private String FirstName; 
	   public void User(){} 
	    
	   public void User(int id,
			   String CustomerID,
			   String LastName,
			   String FirstName) {
		  this.id = id;
	      this.CustomerID = CustomerID;
	      this.LastName = LastName;
	      this.FirstName = FirstName;
	   }  
	   public int getId() { 
	      return id; 
	   }  
	   @XmlElement 
	   public void setId(int id) { 
	      this.id = id; 
	   }   
	   public String CustomerID() { 
		      return CustomerID; 
		   }  
		   @XmlElement 
		   public void setCustomerID(String CustomerID) { 
		      this.CustomerID = CustomerID; 
		   } 
		   public String getLastName() { 
		      return LastName; 
		   } 
		   @XmlElement
		   public void setLastName(String LastName) { 
		      this.LastName = LastName; 
		   } 
		   public String getFirstName() { 
		      return FirstName; 
		   } 
		   @XmlElement 
		   public void setFirstName(String FirstName) { 
		      this.FirstName = FirstName;     
		   } 
}
