package task5loops;

public class OddplusEven {

	public static void main(String[] args) {
		
		        int sumOdd = 0;
		        int sumEven = 0;
		        int i = 1;

		        while (i <= 10) {
		            if (i % 2 == 0) {
		                sumEven += i; // Add to even sum
		            } else {
		                sumOdd += i; // Add to odd sum
		            }
		            i++;
		        }

		        System.out.println("Sum of odd numbers between 1 and 10: " + sumOdd);
		        System.out.println("Sum of even numbers between 1 and 10: " + sumEven);
		    }
		}
