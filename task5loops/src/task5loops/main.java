package task5loops;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

     //object creation
		Scanner main=new Scanner(System.in);
		System.out.println("Enter you Number: ");
		
		int i=main.nextInt();
		
		if(i%2==0 & i%4==0) 
		{
			System.out.println(i +":is divisible by 2 and 4 ");
		}

		else
		{
			System.out.println(i +":is not divisible by 2 and 4 ");
		}
		
	}
}
