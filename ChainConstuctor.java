package pack1;


 class Vehicle
{
	 String Brand;
	 String Model;
	 int Year;
	
	 Vehicle(String Brand, String Model,int Year) // all parameters
	 {
		 
		 this.Brand=Brand;
		 this.Model=Model;
		 this.Year=Year;
		 
	 }
	 
	  public void displayInfo() {  
	        System.out.println("Vehicle: " + Brand + " " + Model + " (" + Year + ")");  
	    }  
	 
}
 
 
 class Car extends Vehicle
 {
	 
	 private boolean ac;

	Car(String Brand, String Model,int Year,boolean ac) // all parameters + ac
	 {
		 
		super(Brand,Model,Year);
		this.ac=true;
		 
	 }
	
	 public void displayInfo() {  
	        super.displayInfo();  
	        System.out.println("A/C or Non-A/C : " + (ac ? "A/C" : "Non A/C"));  
	    }  
	 
 }


public class ChainConstuctor {	
	public static void main(String[] args) {
		
		Vehicle obj1=new Vehicle("ford","Mustang",1899);
	
		Car obj2=new Car("audi","audi Q7",2020,true);
		
		obj1.displayInfo();
		obj2.displayInfo();

	}

}
