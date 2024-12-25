package Constructor;

public class ConstructorOverLoading {

	int id;
	String name;
	int age;
	
	ConstructorOverLoading(int i, String n)
	{
		id=i;
		name=n;
	}
	
	ConstructorOverLoading(int i,String n , int a)
	{
		id =i;
		name=n;
		age=a;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}
	
	public static void main(String args[]) 
	{
		ConstructorOverLoading co1=new ConstructorOverLoading(111, "jeeva");
		ConstructorOverLoading co2=new ConstructorOverLoading(112, "jeeva chinnasamy",20);
		
		co1.display();
		co2.display();
		
	}
}
