package stringoperations;
import java.util.Scanner;

public class RemoveWhitespace {

    // User-defined function to remove all whitespace characters from a string
    public static String removeWhitespace(String str) {
        if (str == null) {
            return null;
        }

        // Replace all whitespace characters (space, tab, newline, etc.) with an empty string
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();

        String result = removeWhitespace(input);
        System.out.println("String without whitespace: " + result);

        sc.close();
    }
}
