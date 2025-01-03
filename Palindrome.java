package newPackage;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		
		int arr[]=new int[3];
		
		
		System.out.println(" enter the first number ");
		arr[0]=s1.nextInt();
		System.out.println(" enter the second number ");
		arr[1]=s1.nextInt();
		System.out.println(" enter the Third number ");
		arr[2]=s1.nextInt();
		
		if(arr[0]==arr[2])
		{
			System.out.println(" your number is palindrome");
		}
		
		else
		{
			System.out.println(" your number is not a palindrome");
		}

	}

}
