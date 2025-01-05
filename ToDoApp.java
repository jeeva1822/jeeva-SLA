package newPackage;

import java.util.Scanner;

public class ToDoApp {

    private static String[] tasks = new String[10];
    private static int taskCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 for Viewing the Tasks");
            System.out.println("Enter 2 for Adding the Tasks");
            System.out.println("Enter 3 for Deleting the Tasks");
            System.out.println("Enter 4 for Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    viewTasks();
                    break;
                case 2:
                    addTask(scanner);
                    break;
                case 3:
                    deleteTask(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void viewTasks() {
        System.out.println("Your Tasks:");
        for (int i = 0; i < taskCount; i++) {
            System.out.println((i + 1) + ". " + tasks[i]);
        }
    }

    private static void addTask(Scanner scanner) {
        if (taskCount < tasks.length) {
            System.out.println("Enter the Task:");
            String task = scanner.nextLine();
            tasks[taskCount++] = task;
            System.out.println("Task added!");
        } else {
            System.out.println("Task list is full.");
        }
    }

    private static void deleteTask(Scanner scanner) {
        System.out.println("Enter the Task number to delete:");
        int taskNum = scanner.nextInt();
        scanner.nextLine(); 

        if (taskNum > 0 && taskNum <= taskCount) {
            for (int i = taskNum - 1; i < taskCount - 1; i++) {
                tasks[i] = tasks[i + 1];
            }
            tasks[--taskCount] = null;
            System.out.println("Task deletedd");
        } else {
            System.out.println("Invalid task numberr");
        }
    }
}
