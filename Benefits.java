package Employees;

import Customer.XmlElement;

public class Benefits extends FullTime{
	private int id; 
	   Boolean Medical;  
	   Boolean Dental;
	   Boolean Vision;
	   public void User(){} 
	    
	   public void User(int id,
			   Boolean Medical,
			   Boolean Dental,
			   Boolean Vision
			   ) {
		  this.id = id;
	      this.Medical = Medical;
	      this.Dental = Dental;
	      this.Vision = Vision;
	      }  
	   public int getId() { 
	      return id; 
	   }  
	   @XmlElement 
	   public void setId(int id) { 
	      this.id = id; 
	   }   
	   Boolean Medical() { 
		      return Medical; 
		   }  
		   @XmlElement 
		   public void setMedical(Boolean Medical) { 
		      this.Medical = Medical; 
		   } 
		   Boolean Dental() { 
			      return Dental; 
			   }  
			   @XmlElement 
			   public void setDental(Boolean Dental) { 
			      this.Dental = Dental;
			   }
			   Boolean Vision() { 
				      return Vision; 
				   }  
				   @XmlElement 
				   public void setVision(Boolean Vision) { 
				      this.Vision = Vision;
				   }
}