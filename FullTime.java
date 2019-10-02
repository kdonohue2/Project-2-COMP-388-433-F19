package Employees;

import Customer.XmlElement;

public class FullTime extends Employee{
	private int id; 
	   private String HireDate;  
	   private String Salary;
	   public void User(){} 
	    
	   public void User(int id,
			   String HireDate,
			   String Salary) {
		  this.id = id;
	      this.HireDate = HireDate;
	      this.Salary = Salary;
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
		   public String Salary() { 
		      return Salary; 
		   } 
		   @XmlElement
		   public void setSalary(String Salary) { 
		      this.Salary = Salary; 
		   }

}