package inheriTance;


public class InfoSys {
	
	static String Id="20034";
	static String Name="jeeva";
}

class IT extends InfoSys{

	String Dept1="IT";
}

class HR extends InfoSys{

	String Dept2="HR";
}

class ACC extends InfoSys{

	static String Dept3=" ACC";

	public static void main(String[] args) {
		
		IT C1=new IT();
		HR C2=new HR();
		ACC C3=new ACC();
		
		System.out.println("C1+ID:"+C1+" "+Id+Name+Dept3);
		System.out.println("C2+ID:"+C2+" "+Id+Name+Dept3);
		System.out.println("C3+ID:"+C2+" "+Id+Name+Dept3);

	}

}
