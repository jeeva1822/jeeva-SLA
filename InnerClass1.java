package RandomimpConcepts;

class Car
{
	private String a="Tesla ";

	 class Engine
	{
		void Start()
		{
			System.out.println(a+": is Starting");
		}
	}
}

public class InnerClass1 {

	public static void main(String args[]){
		
		Car car=new Car();
		
		Car.Engine engine= car.new Engine();
		
		engine.Start();
		
	}

}

