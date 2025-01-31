package newpack;


interface Animals
{
	void Sound();
}

class Dog implements Animals
{
	public void Sound()
	{
		System.out.println(" Dogs Bark");
	}
}

class Cat implements Animals
{
	public void Sound()
	{
		System.out.println(" Cats Sounds Meow");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		

		Animals dog=new Dog();
		Animals cat=new Cat();
		
		dog.Sound();
		
		cat.Sound();
		
	}

}
