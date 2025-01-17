package newPackage;

public class StaticMethods {
	
	
	static void MyStaticMethod()
	{
		System.out.println("Static method is called without creating the object");
	}
	
	public void MyPublicMethod()
	{
		System.out.println("public method is called on creating the object obj1 ");
	}
	

	public static void main(String[] args) {
		

		MyStaticMethod();
		
		 StaticMethods obj1=new  StaticMethods();
		 obj1.MyPublicMethod();		
	}

}
