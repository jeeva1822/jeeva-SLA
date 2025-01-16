package pack1;

public class GarbageCollectorFinalizeDemo {

    // creatingg a Constructor
    public GarbageCollectorFinalizeDemo() {
        System.out.println("Object created");
    }

    // Overriding  the finalize method
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed");
        super.finalize();
    }

    public static void main(String[] args) {
        // Create a large number of objects in a loop for assingning only reference similar
        for (int i = 0; i < 100000; i++) {
            GarbageCollectorFinalizeDemo obj = new GarbageCollectorFinalizeDemo();
        }

        // Suggesting garbage collection for demo gc-means garbage collector inbuild from the JVM itself
        System.gc();

        // Print message indicating garbage collection request
        System.out.println("Garbage Collection is performed....");
    }
}

