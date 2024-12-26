package inheritanceTask;

public class Employee {
	
	void Work() {
		System.out.println("employee can work ");
	}
	
	void getSalary() {
		System.out.println("employee can  get salary ");
	}
}
class HRmanager extends Employee{
	
	void addEmployee() {
		System.out.println(" I'm a new employee ");
	}

	public static void main(String[] args) {
		
	  HRmanager h1=new HRmanager();
	  
	  h1.Work();
	  h1.getSalary();
	  h1.addEmployee();

	}

}
