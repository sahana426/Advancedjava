package stringoperations;
import java.util.Scanner;

public class TruncateString {

    // User-defined function to truncate a string and add ellipsis
    public static String truncate(String str, int maxLength) {
        if (str == null) {
            return null;
        }

        if (maxLength < 3) {
            return "..."; // Can't truncate properly if maxLength < 3
        }

        if (str.length() <= maxLength) {
            return str; // No need to truncate
        } else {
            return str.substring(0, maxLength - 3) + "...";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter maximum length: ");
        int maxLength = sc.nextInt();

        String result = truncate(input, maxLength);
        System.out.println("Truncated string: " + result);

        sc.close();
    }
}
