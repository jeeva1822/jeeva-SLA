package newPackage;

import java.util.Scanner;

public class SumOfThreeDigiNum {


	static int a,num,num1,num2,num3,result;
	
	
	
	public static void main(String[] args) {
		
		Scanner myscan =new Scanner(System.in);
		
		// logic is when we divide 2 digit number by 10 random no. 35/10 returns 30 as quotient and 35%10 returns 5 as remainder
		
		System.out.println("Enter the 3- Digit Number You Want To Sum ");
		 a=myscan.nextInt();
		
		num=a/10;
		num1=num/10;
		num2=num%10;
		num3=a%10;
		result=num1+num2+num3;

		System.out.println("The sum of the 3 digit number you entered is : "+result);

}
}
