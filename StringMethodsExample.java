package newpack;

public class StringMethodsExample {

    public static void main(String[] args) {
        String str = "He is Good a Boy";

        // 1. charAt()
        System.out.println("Character at index 0: " + str.charAt(0));

        // 2. length()
        System.out.println("Length of the string: " + str.length());

        // 3. substring()
        System.out.println("Substring from index 7: " + str.substring(7));

        // 4. contains()
        System.out.println("Does the string contain 'World'? " + str.contains("World"));

        // 5. equals()
        System.out.println("Is the string equal to 'Hello, World!'? " + str.equals("Hello, World!"));

        // 6. isEmpty()
        System.out.println("Is the string empty? " + str.isEmpty());

        // 7. replace()
        System.out.println("String after replacing 'boy' with 'girl': " + str.replace("Boy", "Girl"));

        // 8. toLowerCase()
        System.out.println("String in lowercase: " + str.toLowerCase());

        // 9. toUpperCase()
        System.out.println("String in uppercase: " + str.toUpperCase());

        // 10. trim()
        String strWithSpaces = "    Hello, World!    ";
        System.out.println("String after trimming spaces: '" + strWithSpaces.trim() + "'");
    }
}
