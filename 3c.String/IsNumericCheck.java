package stringoperations;
import java.util.Scanner;

public class IsNumericCheck {

    // User-defined function to check if a string is numeric
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        return str.matches("\\d+"); // Regex: \d means digit, + means one or more
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String input = sc.nextLine();

        if (isNumeric(input)) {
            System.out.println("✅ The string contains only numeric characters.");
        } else {
            System.out.println("❌ The string is not numeric.");
        }

        sc.close();
    }
}
