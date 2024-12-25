package simpletoDoList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {

	public static void main(String[] args) {
	
		        List<String> tasks = new ArrayList<>();
		        Scanner sc = new Scanner(System.in);
		        
		        while (true) {
		            System.out.println("1. Add task\n2. View tasks\n3. Exit");
		            int choice = sc.nextInt();
		            sc.nextLine();  // Consume newline
		            
		            if (choice == 1) {
		                System.out.print("Enter task: ");
		                tasks.add(sc.nextLine());
		            } else if (choice == 2) {
		                tasks.forEach(task -> System.out.println("- " + task));
		            } else {
		                break;
		            }
		        }
		    }		
	}

