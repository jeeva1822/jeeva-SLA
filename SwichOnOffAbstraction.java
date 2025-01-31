package newpack;


abstract class SmartHome
{
	
	abstract void TurnOff();

	
	abstract void TurnOn();
	
	
}

public class SwichOnOffAbstraction extends SmartHome  {

	public static void main(String[] args) {
		
		
		 SwichOnOffAbstraction Light=new  SwichOnOffAbstraction();
		
		 SwichOnOffAbstraction Fan=new  SwichOnOffAbstraction();
		 
		 Light.TurnOff();
		 Light.TurnOn();
		 
		
		 Fan.TurnOff();
		 Fan.TurnOn();
	}

	@Override
	void TurnOff() {
		// TODO Auto-generated method stub
		
		System.out.println("  OFF ");
	}

	@Override
	void TurnOn() {
		
		System.out.println(" ON ");
		
	}

}
