package exTraTask222025;

import java.util.Scanner;

public class Calculator {	
	
	public static void main(String[] args) {
		
		System.out.println("select 1 for Addition operation:");
		System.out.println("select 2 for Subtraction operation:");
		System.out.println("select 3 for Multiplication operation:");
		System.out.println("select 4 for Division operation:");
		
		Scanner s0=new Scanner(System.in);
		int num=0;
		num=s0.nextInt();
		
		
		int a,b;
		Scanner s1 =new Scanner(System.in);
		System.out.println("enter the number 1");
		a=s1.nextInt();
		System.out.println("enter the number 2");
        b=s1.nextInt();
        
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;
        
        
        switch(num)
        {
        
        case 1:
        	System.out.println("Result="+c);
        break;
        
        
        case 2:
        	System.out.println("Result="+d);
        break;
        
        
        case 3:
        	System.out.println("Result="+e);
        break;
        
        
        case 4:
        	System.out.println("Result="+f);
        break;
        
        default:
        	System.out.println("invalid selection");
        
        }
        
        
	}

}
