package newpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class MaximaInQueue {

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

		        // Find and display the median element
		        System.out.println("Median Element: " + findMedian(queue));

		        // Find and display the maximum element
		        System.out.println("Maximum Element: " + findMaximum(queue));

		        // Find and display the second lowest element
		        System.out.println("Second Lowest Element: " + findSecondLowest(queue));
		    }

		    public static double findMedian(Queue<Integer> queue) {
		        ArrayList<Integer> list = new ArrayList<>(queue);
		        Collections.sort(list);

		        int size = list.size();
		        if (size % 2 == 1) {
		            return list.get(size / 2);
		        } else {
		            return (list.get((size / 2) - 1) + list.get(size / 2)) / 2.0;
		        }
		    }

		    public static int findMaximum(Queue<Integer> queue) {
		        int max = Integer.MIN_VALUE;
		        for (int num : queue) {
		            if (num > max) {
		                max = num;
		            }
		        }
		        return max;
		    }

		    public static int findSecondLowest(Queue<Integer> queue) {
		        ArrayList<Integer> list = new ArrayList<>(queue);
		        Collections.sort(list);

		        // Assuming there are at least two distinct elements in the queue
		        if (list.size() < 2) {
		            return -1; // Indicate that second lowest does not exist
		        }
		        
		        return list.get(1);
		    }

}
