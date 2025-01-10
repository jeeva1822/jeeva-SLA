package newpack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionHandlingTask1 {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        List<Integer> numbers = new ArrayList<>();
		        
		        System.out.println("Enter integers (type 'exit' to stop):");
		        
		        while (scanner.hasNext()) {
		            String input = scanner.next();
		            if (input.equalsIgnoreCase("exit")) {
		                break;
		            }
		            
		            try {
		                int number = Integer.parseInt(input);
		                if (numbers.contains(number)) {
		                    throw new Exception("Duplicatess of is number found: " + number);
		                }
		                numbers.add(number);
		            } catch (Exception e) {
		                System.out.println(e.getMessage());
		            }
		        }
		        
		        System.out.println("All numbers are Different ");
		    }

	}

