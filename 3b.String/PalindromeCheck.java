package stringoperations;
import java.util.Scanner;

public class PalindromeCheck {

    // User-defined function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        // Remove non-alphanumeric characters and convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the cleaned string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Check if cleaned string is equal to its reverse
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check for palindrome: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("✅ The string is a palindrome.");
        } else {
            System.out.println("❌ The string is not a palindrome.");
        }

        sc.close();
    }
}
