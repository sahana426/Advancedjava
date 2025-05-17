package stringoperations;
import java.util.Scanner;

public class program3b {

    // Q1: Check if string is null or empty (only whitespace)
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    // Q2: Count how many times a substring appears
    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }
        return count;
    }

    // Q3: Reverse a string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Q4: Check if string is palindrome (ignoring case and punctuation)
    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleaned.equals(reverseString(cleaned));
    }

    // Q5: Remove all whitespaces
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1
        System.out.print("Q1: Enter a string to check if null/empty: ");
        String str1 = sc.nextLine();
        System.out.println("Is null or empty: " + isNullOrEmpty(str1));

        // Q2
        System.out.print("Q2: Enter the main string: ");
        String mainStr = sc.nextLine();
        System.out.print("Enter the substring to count: ");
        String subStr = sc.nextLine();
        System.out.println("Occurrences: " + countOccurrences(mainStr, subStr));

        // Q3
        System.out.print("Q3: Enter a string to reverse: ");
        String strToReverse = sc.nextLine();
        System.out.println("Reversed string: " + reverseString(strToReverse));

        // Q4
        System.out.print("Q4: Enter a string to check if palindrome: ");
        String palindromeInput = sc.nextLine();
        System.out.println("Is palindrome: " + isPalindrome(palindromeInput));

        // Q5
        System.out.print("Q5: Enter a string to remove whitespace: ");
        String stringWithSpaces = sc.nextLine();
        System.out.println("String without whitespace: '" + removeWhitespace(stringWithSpaces) + "'");
    }
}

