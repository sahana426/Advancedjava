package stringoperations;
import java.util.Scanner;

public class CapitalizeWords {

    // User-defined function to capitalize the first letter of each word
    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String[] words = str.trim().split("\\s+");
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                capitalized.append(Character.toUpperCase(word.charAt(0))); // Capitalize first letter
                if (word.length() > 1) {
                    capitalized.append(word.substring(1).toLowerCase()); // Rest in lowercase
                }
                capitalized.append(" ");
            }
        }

        return capitalized.toString().trim(); // Remove trailing space
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String result = capitalizeWords(input);
        System.out.println("Capitalized: " + result);

        sc.close();
    }
}
