package newpack;


class Bank
{
	private int Acc;
	private float Balance;
	
	public int getAcc()
	{
		return Acc;
	}
	
	public void setAcc(int Acc)
	{
		this.Acc=Acc;
	}
	
	public float getBal()
	{
		return Balance;
	}
	
	public void setBal(float Balance)
	{
		this.Balance=Balance;
	}
}




public class PolyTask2 {

	public static void main(String[] args) {
		
		Bank obj=new Bank();
		
		
		obj.setAcc(98406);
		obj.setBal(100000.678f);
		
		System.out.println("Your Account Number is :"+ obj.getAcc());
		System.out.println(" Your Current Balnce is :"+ obj.getBal());

	}

}
