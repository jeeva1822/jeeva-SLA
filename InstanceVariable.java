package newpack;

public class InstanceVariable {

//	declaring instance variables
	
	String studentName="jeeva";
	String studentDept="ECE";
	int studentAge=20;
	
	
	
	
	public static void main(String[] args) {
		
// creating object for the instance variables
		
		InstanceVariable obj1=new InstanceVariable();
		
		System.out.println("Student Name is :"+" "+ obj1.studentName);
		System.out.println("Student Department  is :"+" "+ obj1.studentDept);
		System.out.println("Student Age is :"+" "+ obj1.studentAge);
		
	}

}
