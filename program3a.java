package stringoperations;
import java.util.Scanner;

public class program3a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. String Creation and Basic Operations
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Original String: " + input);

        // 2. Length and Character Access
        System.out.println("Length: " + input.length());
        if (!input.isEmpty()) {
            System.out.println("First character: " + input.charAt(0));
            System.out.println("Last character: " + input.charAt(input.length() - 1));
        }

        // 3. String Comparison
        System.out.print("Enter another string to compare: ");
        String compareStr = sc.nextLine();
        System.out.println("Equal (case-sensitive): " + input.equals(compareStr));
        System.out.println("Equal (case-insensitive): " + input.equalsIgnoreCase(compareStr));

        // 4. String Searching
        System.out.print("Enter a substring to search: ");
        String searchStr = sc.nextLine();
        System.out.println("Contains '" + searchStr + "': " + input.contains(searchStr));
        System.out.println("Index of '" + searchStr + "': " + input.indexOf(searchStr));

        // 5. Substring Operations
        if (input.length() >= 5) {
            System.out.println("Substring (0, 5): " + input.substring(0, 5));
        }

        // 6. String Modification
        System.out.println("To Uppercase: " + input.toUpperCase());
        System.out.println("To Lowercase: " + input.toLowerCase());
        System.out.println("Replace 'a' with '@': " + input.replace('a', '@'));

        // 7. Whitespace Handling
        String withSpaces = "   Hello World   ";
        System.out.println("Original with spaces: '" + withSpaces + "'");
        System.out.println("Trimmed: '" + withSpaces.trim() + "'");

        // 8. String Concatenation
        String first = "Java";
        String second = "Programming";
        System.out.println("Concatenated using '+': " + first + " " + second);
        System.out.println("Concatenated using concat(): " + first.concat(" ").concat(second));

        // 9. String Splitting
        String csv = "apple,banana,cherry";
        String[] fruits = csv.split(",");
        System.out.println("Splitting 'apple,banana,cherry':");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder();
        sb.append("AIET");
        sb.append(" - ");
        sb.append("StringBuilder Example");
        System.out.println("StringBuilder content: " + sb.toString());

        // 11. String Formatting
        String name = "Alice";
        int age = 22;
        String formatted = String.format("Name: %s | Age: %d", name, age);
        System.out.println("Formatted String: " + formatted);

        // 12. Email Validation
        System.out.print("Enter an email to validate: ");
        String email = sc.nextLine();
        boolean isValid = email.contains("@") &&
                          email.contains(".") &&
                          email.startsWith(email.substring(0, email.indexOf('@'))) &&
                          email.endsWith(".com");

        System.out.println("Valid email format (basic check): " + isValid);
    }
}
