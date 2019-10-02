package Employees;

import Customer.XmlElement;

public class Phone {
		private int id; 
		   private String Type;  
		   private String Number;
		   private String Carier; 
		   public void User(){} 
		    
		   public void User(int id,
				   String Type,
				   String Number,
				   String Carier) {
			  this.id = id;
		      this.Type = Type;
		      this.Number = Number;
		      this.Carier = Carier;
		     
		   }  
		   public int getId() { 
		      return id; 
		   }  
		   @XmlElement 
		   public void setId(int id) { 
		      this.id = id; 
		   }   
		   public String Type() { 
			      return Type; 
			   }  
			   @XmlElement 
			   public void setType(String Type) { 
			      this.Type = Type; 
			   } 
			   public String getNumber() { 
			      return Number; 
			   } 
			   @XmlElement
			   public void setNumber(String Number) { 
			      this.Number = Number; 
			   } 
			   public String getCarier() { 
			      return Carier; 
			   } 
			   @XmlElement 
			   public void setCarier(String Carier) { 
			      this.Carier = Carier;     
			   } 
}