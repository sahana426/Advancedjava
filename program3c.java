package stringoperations;
import java.util.Scanner;
import java.util.Random;

public class program3c{

    // Q6: Capitalize first letter of each word
    public static String capitalizeWords(String str) {
        String[] words = str.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }
        return result.toString().trim();
    }

    // Q7: Truncate string and add ellipsis (...)
    public static String truncate(String str, int length) {
        if (str.length() <= length) return str;
        return str.substring(0, length) + "...";
    }

    // Q8: Check if string contains only numeric characters
    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    // Q9: Generate a random string of specified length
    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return sb.toString();
    }

    // Q10: Count the number of words in a string
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        return str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q6
        System.out.print("Q6: Enter a sentence to capitalize each word: ");
        String sentence = sc.nextLine();
        System.out.println("Capitalized: " + capitalizeWords(sentence));

        // Q7
        System.out.print("Q7: Enter a string to truncate: ");
        String longStr = sc.nextLine();
        System.out.print("Enter max length: ");
        int len = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.println("Truncated: " + truncate(longStr, len));

        // Q8
        System.out.print("Q8: Enter a string to check if numeric: ");
        String numericInput = sc.nextLine();
        System.out.println("Is numeric: " + isNumeric(numericInput));

        // Q9
        System.out.print("Q9: Enter length for random string: ");
        int randLen = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.println("Random String: " + generateRandomString(randLen));

        // Q10
        System.out.print("Q10: Enter a string to count words: ");
        String wordCountInput = sc.nextLine();
        System.out.println("Word count: " + countWords(wordCountInput));
    }
}
