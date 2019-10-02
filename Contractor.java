package Employees;

import Customer.XmlElement;

public class Contractor extends Employee{
	private int id; 
	   private String HireDate;  
	   private String HourWage;
	   public void User(){} 
	    
	   public void User(int id,
			   String HireDate,
			   String HourWage) {
		  this.id = id;
	      this.HireDate = HireDate;
	      this.HourWage = HourWage;
	      }  
	   public int getId() { 
	      return id; 
	   }  
	   @XmlElement 
	   public void setId(int id) { 
	      this.id = id; 
	   }   
	   public String HireDate() { 
		      return HireDate; 
		   }  
		   @XmlElement 
		   public void setHireDate(String HireDate) { 
		      this.HireDate = HireDate; 
		   } 
		   public String HourWage() { 
		      return HourWage; 
		   } 
		   @XmlElement
		   public void setHourWage(String HourWage) { 
		      this.HourWage = HourWage; 
		   }

}
