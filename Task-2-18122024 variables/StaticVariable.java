package Task18122024;

public class StaticVariable {
    
    // Static variables
    static int apple = 10;
    static int ball = 25;
    static int box;


    public static void mymethod() {
        box = apple + ball;

        // Print the total number of apples and balls in the box
        System.out.println("Total balls and apples in the box is " + box);
    }

    public static void main(String[] args) {
        mymethod(); 
    }
}
