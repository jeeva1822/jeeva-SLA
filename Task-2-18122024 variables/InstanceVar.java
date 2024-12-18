package Task18122024;

public class InstanceVar {

    // Instance variables
    int apple;
    int ball;
    int box;

    public InstanceVar(int apple, int ball) {
        this.apple = apple;
        this.ball = ball;
        this.box = 0;     }

    // Instance method to calculate the total
    public void mymethod() {
        box = apple + ball;

        // Print the total number of apples and balls in the box
        System.out.println("Total balls and apples in the box is " + box);
    }

    // Main method to create an instance 
    public static void main(String[] args) {
        InstanceVar myInstance = new InstanceVar(10, 25);
        myInstance.mymethod();
    }
}
