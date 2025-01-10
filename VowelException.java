package newpack;

public class VowelException {

	public static void main(String[] args) {
		
		        try {
		            checkForVowels("hello");
		            checkForVowels("sky");
		        } catch (Exception e) {
		            System.err.println(e.getMessage());
		        }
		    }

		    public static void checkForVowels(String input) throws Exception {
		        if (!input.toLowerCase().matches(".*[aeiou].*")) {
		            throw new Exception("No vowels found in the string: " + input);
		        }
		        System.out.println("The string contains vowels: " + input);


	}

}
