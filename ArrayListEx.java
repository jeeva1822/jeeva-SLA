package collectionsFramework;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
	
		        ArrayList<String> fruits = new ArrayList<>();

		        // Adding thee elements to the ArrayList
		        fruits.add("Apple");
		        fruits.add("Banana");
		        fruits.add("Cherry");

		        // Printing the ArrayList
		        System.out.println("Fruits List: " + fruits);

		        //  elements by teh  index
		        System.out.println("First fruit: " + fruits.get(0));

		        // Modifying elements
		        fruits.set(1, "Blueberry");
		        System.out.println("Updated Fruits List: " + fruits);

		        // Removing elements
		        fruits.remove(2);
		        System.out.println("Fruits List after removal: " + fruits);

		        }
		    }
