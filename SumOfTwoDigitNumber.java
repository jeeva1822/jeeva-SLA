package newPackage;

import java.util.Scanner;

public  class SumOfTwoDigitNumber {

	static int a;
	static int result;
	static int num1;
	static int num2;
	
	public static void main(String[] args) {
		
		Scanner myscan =new Scanner(System.in);
		
		// logic is when we divide 2 digit number by 10 random no. 35/10 returns 30 as quotient and 35%10 returns 5 as remainder
		
		System.out.println("Enter the 2- Digit Number You Want To Sum ");
		 a=myscan.nextInt();
		
		num1=a/10;
		num2=a%10;
		result=num1+num2;

		System.out.println("The sum of the 2 digit number you entered is : "+result);
		
	}

}
