package inheritanceTask;

public class Animal 
{

	void MakeSound() 
	{
		System.out.println("Animals can make sound");
	}
	
}

class Cat extends Animal
{
	
	void meow()
	{
		System.out.println("cat sounds meow");
	}
	

	


	public static void main(String[] args) {

		Cat c1=new Cat();
    	c1.MakeSound();
		
	}

}
