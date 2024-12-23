package task5loops;

public class Prime {

	public static void main(String[] args) {

		        int i = 2; 
		        
		        while (i < 100) { 
		            int j = 2;
		            int isPrime = 1; 

		            while (j < i) {
		                if (i % j == 0) { 
		                    isPrime = 0; 
		                    break; 
		                }
		                j++;
		            }

		            if (isPrime == 1) {
		                System.out.println(i);
		            }

		            i++;
		        }
		    }

}
