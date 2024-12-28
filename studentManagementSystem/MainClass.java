package studentManagementSystem;

import java.util.Scanner;

class Student1 {
    static String name = "Jeeva";
    static String Reg = "167288";
    static int Age = 20;
    static int Std = 12;
    static String Grade = "A+";

    public void displayStudentInfo1() {
        System.out.println("Jeeva's Register number is: " + Reg);
        System.out.println("Jeeva's Age is: " + Age);
        System.out.println("Jeeva's Std is: " + Std);
        System.out.println("Jeeva's Grade is: " + Grade);
    }
}

class Student2 {
    static String name = "Yokesh";
    static String Reg = "167298";
    static int Age = 20;
    static int Std = 12;
    static String Grade = "B+";

    public void displayStudentInfo2() {
        System.out.println("Yokesh's Register number is: " + Reg);
        System.out.println("Yokesh's Age is: " + Age);
        System.out.println("Yokesh's Std is: " + Std);
        System.out.println("Yokesh's Grade is: " + Grade);
    }
}

class Student3 {
    static String name = "Saranya";
    static String Reg = "169798";
    static int Age = 20;
    static int Std = 12;
    static String Grade = "O+";

    public void displayStudentInfo3() {
        System.out.println("Saranya's Register number is: " + Reg);
        System.out.println("Saranya's Age is: " + Age);
        System.out.println("Saranya's Std is: " + Std);
        System.out.println("Saranya's Grade is: " + Grade);
    }
}

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student1 myobj1 = new Student1();
        Student2 myobj2 = new Student2();
        Student3 myobj3 = new Student3();

        System.out.println("Enter 1 to display Jeeva's information");
        System.out.println("Enter 2 to display Yokesh's information");
        System.out.println("Enter 3 to display Saranya's information");

        int num = scanner.nextInt();

        if (num == 1) {
            myobj1.displayStudentInfo1();
        } else if (num == 2) {
            myobj2.displayStudentInfo2();
        } else if (num == 3) {
            myobj3.displayStudentInfo3();
        } else {
            System.out.println("Invalid input.");
        }

        scanner.close();
    }
}

