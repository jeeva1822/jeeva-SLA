package newpack;

import java.util.LinkedList;
import java.util.Queue;

public class EmptyFullQueue {

	public static void main(String[] args) {
	
		        Queue<Integer> queue = new LinkedList<>();
		        int capacity = 5; 

		        // Adding elements to the queue
		        for (int i = 1; i <= 3; i++) {
		            queue.offer(i);
		        }

		        // Displaying  the current queue
		        System.out.println("Queue: " + queue);
		        System.out.println("Number of elements: " + queue.size());

		        // Checking whhter  the queue is empty
		        if (queue.isEmpty()) {
		            System.out.println("The queue is empty.");
		        } else if (queue.size() == capacity) {
		            System.out.println("The queue is full.");
		        } else {
		            System.out.println("The queue is neither empty nor full.");
		        }

		     
		        for (int i = 4; i <= capacity; i++) {
		            queue.offer(i);
		        }

		        // Displayijng  the updated set of queue
		        System.out.println("\nUpdated Queue: " + queue);
		        System.out.println("Number of elements: " + queue.size());

		        
		        if (queue.isEmpty()) {
		            System.out.println("The queue is empty.");
		        } else if (queue.size() == capacity) {
		            System.out.println("The queue is full.");
		        } else {
		            System.out.println("The queue is neither empty nor full.");
		        }
	}
}
