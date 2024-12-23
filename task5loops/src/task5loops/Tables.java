package task5loops;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter a number to print its multiplication table (up to 10):");
		        int number = scanner.nextInt();

		        System.out.println("Multiplication table for " + number + ":");
		        
		        for (int i = 1; i <= 10; i++) {
		            System.out.println(number + " x " + i + " = " + (number * i)); //eg 5 multiplication 1 = 5*1
		        }
		        
		        scanner.close();
		    }
}
