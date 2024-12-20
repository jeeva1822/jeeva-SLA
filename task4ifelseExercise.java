package ControlStatement;

import java.util.Scanner;

public class ifexercise {
	
	
	public static void main(String[] args) {
		

		Scanner ifexercise =new Scanner(System.in);
		System.out.println("enter your age");
		
		int age=ifexercise.nextInt();
		
		if(age>=18)
		{
			System.out.println("you are eligible to vote");
			
			if(age==18)
			{
				System.out.println("you are eligible to vote for first time");
			}
		}
		
		else
		{
			System.out.println("you are  not eligible to vote");
		}
		
	}

}
