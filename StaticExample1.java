package pack1;


  class Human {
    static int age;
    String name;
    String Native;
    static long population;

    static void message() {
        System.out.println("Hello world");
//        System.out.println(this.age); // cant use this over here
    }

    
    void message2()
    {
    	System.out.println(" Good morning");
    }
    
    
    public Human(int age, String name, String Native) {
        this.age = age;
        this.name = name;
        this.Native = Native;
        Human.population += 1;
    }
}

public class StaticExample1 {
	public static void main(String[] args) {
		
		
		//this.message();// not used over here
		Human.message();// only dependent on classs

		//Human.message2();//because non-static we are supposed to create a obj compulsary or else calld with referce to obj
		
		Human obj=new Human(21,"Jeeva","Krishnagiri");
		
		obj.message2();// non-static method called inside a static main method by object reference
		
		System.out.println(obj.name);
		//System.out.println(Human.name); because name is not declared as static
		System.out.println(Human.age);// because int age declared as a static var
		System.out.println(obj.age);//
	}

}
