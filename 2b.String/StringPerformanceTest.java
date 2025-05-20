package stringoperations;
import java.util.Scanner;

public class StringPerformanceTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. String Creation and Basic Operations
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        System.out.println("You entered: " + input);

        // 2. Length and Character Access
        System.out.println("Length: " + input.length());
        if (input.length() > 0) {
            System.out.println("First character: " + input.charAt(0));
            System.out.println("Last character: " + input.charAt(input.length() - 1));
        }

        // 3. String Comparison
        String compareStr = "Hello";
        System.out.println("Comparing with 'Hello': " + input.equals(compareStr));
        System.out.println("Case-insensitive compare: " + input.equalsIgnoreCase(compareStr));

        // 4. String Searching
        System.out.println("Index of 'a': " + input.indexOf('a'));
        System.out.println("Contains 'test': " + input.contains("test"));

        // 5. Substring Operations
        if (input.length() >= 5) {
            System.out.println("Substring (0, 5): " + input.substring(0, 5));
        }

        // 6. String Modification
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());
        System.out.println("Replace 'a' with '@': " + input.replace('a', '@'));

        // 7. Whitespace Handling
        String withSpaces = "   Trim me   ";
        System.out.println("Original with spaces: '" + withSpaces + "'");
        System.out.println("Trimmed: '" + withSpaces.trim() + "'");

        // 8. String Concatenation
        String greet = "Hello";
        String name = "World";
        System.out.println("Concatenated using '+': " + greet + " " + name);
        System.out.println("Concatenated using concat(): " + greet.concat(" ").concat(name));

        // 9. String Splitting
        String csv = "apple,banana,cherry";
        String[] fruits = csv.split(",");
        System.out.println("Splitting 'apple,banana,cherry':");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder();
        sb.append("This ");
        sb.append("is ");
        sb.append("StringBuilder demo.");
        System.out.println(sb.toString());

        // 11. String Formatting
        String nameFormat = "Alice";
        int age = 25;
        System.out.printf("Formatted string: Name: %s, Age: %d%n", nameFormat, age);

        // 12. Validate Email with contains(), startsWith(), endsWith()
        System.out.println("Enter an email to validate:");
        String email = sc.nextLine();
        boolean isValidEmail = email.contains("@") &&
                               email.contains(".") &&
                               !email.contains(" ") &&
                               email.indexOf('@') < email.lastIndexOf('.') &&
                               email.endsWith(".com");
        System.out.println("Starts with 'user': " + email.startsWith("user"));
        System.out.println("Ends with '.com': " + email.endsWith(".com"));
        System.out.println("Contains '@': " + email.contains("@"));
        System.out.println("Valid email format: " + isValidEmail);

        sc.close();
    }
}
