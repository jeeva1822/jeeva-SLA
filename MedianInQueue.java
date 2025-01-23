package newpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class MedianInQueue {

	public static void main(String[] args) {

		        Queue<Integer> queue = new LinkedList<>();
		        int capacity = 5; 

		        // Addelements to the queue
		        for (int i = 1; i <= 5; i++) {
		            queue.offer(i);
		        }

		        // Displaying the current 
		        System.out.println("Queue: " + queue);
		        System.out.println("Number of elements: " + queue.size());

		        // Check if the queue is empty or nott
		        if (queue.isEmpty()) {
		            System.out.println("The queue is empty.");
		        } else if (queue.size() == capacity) {
		            System.out.println("The queue is full.");
		        } else {
		            System.out.println("The queue is neither empty nor full.");
		        }

		        // Find and display the median element
		        System.out.println("\nMedian Element: " + findMedian(queue));
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

}
