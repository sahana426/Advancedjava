package stringoperations;
import java.util.Scanner;

public class WordCounter {

    // User-defined function to count the number of words in a string
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        // Split the string based on one or more whitespace characters
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        int wordCount = countWords(input);
        System.out.println("Total number of words: " + wordCount);

        sc.close();
    }
}
