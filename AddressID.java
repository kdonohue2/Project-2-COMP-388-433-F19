package Customer;

public class AddressID {
	private int id; 
	   private String AddressID; 
	   private String CustomerID; 
	   private String Street;
	   private String Unit; 
	   private String City;
	   private String State;
	   private String Zip;
	   public void User(){} 
	    
	   public void User(int id,
			   String AddressID,
			   String CustomerID,
			   String Street,
			   String Unit,
			   String City,
			   String State,
			   String Zip){  
	      this.id = id; 
	      this.AddressID = AddressID; 
	      this.CustomerID = CustomerID;
	      this.Street = Street;
	      this.Unit = Unit;
	      this.City = City;
	      this.State = State;
	      this.Zip = Zip;
	   }  
	   public int getId() { 
	      return id; 
	   }  
	   @XmlElement 
	   public void setId(int id) { 
	      this.id = id; 
	   } 
	   public String getAddressID() { 
	      return AddressID; 
	   } 
	   @XmlElement
	   public void setAddressID(String AddressID) { 
	      this.AddressID = AddressID; 
	   } 
	   public String CustomerID() { 
		      return CustomerID; 
		   }  
		   @XmlElement 
		   public void setCustomerID(String CustomerID) { 
		      this.CustomerID = CustomerID; 
		   } 
		   public String getStreet() { 
		      return Street; 
		   } 
		   @XmlElement
		   public void setStreet(String Street) { 
		      this.Street = Street; 
		   } 
		   public String getUnit() { 
		      return Unit; 
		   } 
		   @XmlElement 
		   public void setUnit(String Unit) { 
		      this.Unit = Unit;     
		   } 
		   public String getCity() { 
			      return City; 
			   } 
			   @XmlElement 
			   public void setCity(String City) { 
			      this.City = City;     
			   } 
			   public String getState() { 
				      return State; 
				   } 
				   @XmlElement 
				   public void setState(String State) { 
				      this.State = State;     
				   } 
				   public String getZip() { 
					      return Zip; 
					   } 
					   @XmlElement 
					   public void setZip(String Zip) { 
					      this.Zip = Zip;     
					   } 
}
