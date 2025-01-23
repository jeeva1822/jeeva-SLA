package newpack;

import java.util.LinkedList;
import java.util.Queue;

public class RemoveInQueue {

	public static void main(String[] args) {
	
		        Queue<Integer> queue = new LinkedList<>();
		        int capacity = 5; // set the capacity of the queue

		        // Add elements to the queue
		        for (int i = 1; i <= 5; i++) {
		            queue.offer(i);
		        }

		        // Display the current queue
		        System.out.println("Queue: " + queue);
		        System.out.println("Number of elements: " + queue.size());

		        // Check if the queue is empty
		        if (queue.isEmpty()) {
		            System.out.println("The queue is empty.");
		        } else if (queue.size() == capacity) {
		            System.out.println("The queue is full.");
		        } else {
		            System.out.println("The queue is neither empty nor full.");
		        }

		        // Remove the top element
		        Integer topElement = queue.poll();
		        System.out.println("\nRemoved Top Element: " + topElement);

		        // Remove the bottom element (last element in the queue)
		        removeBottomElement(queue);

		        // Display the updated queue
		        System.out.println("Updated Queue: " + queue);
		        System.out.println("Number of elements: " + queue.size());
		    }

		    public static void removeBottomElement(Queue<Integer> queue) {
		        if (queue.isEmpty()) {
		            System.out.println("The queue is empty. No bottom element to remove.");
		            return;
		        }

		        Queue<Integer> tempQueue = new LinkedList<>();

		        // Transfer elements to the temporary queue except the last one
		        while (queue.size() > 1) {
		            tempQueue.offer(queue.poll());
		        }

		        // The last element in the queue is the bottom element
		        Integer bottomElement = queue.poll();
		        System.out.println("Removed Bottom Element: " + bottomElement);

		        // Transfer back the elements from the temporary queue to the original queue
		        queue.addAll(tempQueue);
		    }

}
