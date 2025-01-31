package newpack;


class Capsule
{
	
	private int datanoaccess=1089;
	
	public void setData(int pass) {
	
		this.datanoaccess=pass;
	}
	
	public  int getData()
	{
		return datanoaccess;
		
	}
}


public class EncapsulationEx {

	public static void main(String[] args) {


		System.out.println(" password before hidden");
		
		Capsule obj=new Capsule();
		
		obj.setData(1098);
		
		System.out.println("The modified password is +"+obj.getData());
	}

}
