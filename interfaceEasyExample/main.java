package interfaceEasyExample;


//// when we are using the method with same name in multiple classes since there is no multiple inheritance in the java, we are using the interface

//defining the interface with interface name

interface Animal {
	
 void makeSound();
}

//Implementing  the interface in a class
class Dog implements Animal {
 @Override
 public void makeSound() {
     System.out.println("Woohh wohh!");
 }
}

class Cat implements Animal {
 @Override
 public void makeSound() {
     System.out.println("Meow!");
 }
}

class Cow implements Animal {
 @Override
 public void makeSound() {
     System.out.println("Moo!");
 }
}



public class main {

	public static void main(String[] args) {
		
		  // Creating the objects of the classes
	     Animal myDog = new Dog();
	     Animal myCat = new Cat();
	     Animal myCow = new Cow();

	     // Call the makeSound() method
	     myDog.makeSound(); // Output: Woof!
	     myCat.makeSound(); // Output: Meow!
	     myCow.makeSound(); // Output: Moo!
	}

}
