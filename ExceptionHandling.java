package newPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		
		
		try
		{

			int a=s1.nextInt();

			int b=10/0;
		}
		
		catch(InputMismatchException e)
		{
			System.out.println(" Enter the input in Integer Format");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(" Exception for that error  Successfully");
		}
		
	}

}
