package ControlStatement;

import java.util.Scanner;


public class BiggestofThreeNumbers {

	public static void main(String[] args) {
		
		{
			Scanner BiggestofThreeNumbers=new Scanner(System.in);
			
			int a=BiggestofThreeNumbers.nextInt();
			System.out.println("enter the first number:");
			int b=BiggestofThreeNumbers.nextInt();
			System.out.println("enter the Second number:");
			int c=BiggestofThreeNumbers.nextInt();
			System.out.println("enter the Third number:");
					
			//if-else-if ladder
			
			if(a>b && a>c)
			{
				System.out.println("First number is greater of all");
			}
				
			else if(b>a && b>c)
			{
				System.out.println("Second number is greater of all");
			}
			else
			{
				System.out.println("Third number is greater if all");
			}
				
		}
	}
}	
