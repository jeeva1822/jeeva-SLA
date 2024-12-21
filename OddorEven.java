package ControlStatement;


import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner OddorEven =new Scanner(System.in);
        System.out.println("enter your number:");
		
		int a=OddorEven.nextInt();
		
		if (a%2==0) {
			
			System.out.println("your value is even");
		}
		
		else {
			System.out.println("your value is odd");
		}
		
		
		
	}

}
