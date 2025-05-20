package stringoperations;
import java.util.Scanner;

public class SubstringCounter {

    // User-defined function to count occurrences of a substring
    public static int countOccurrences(String mainString, String subString) {
        if (mainString == null || subString == null || subString.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        // Loop until no more occurrences are found
        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length(); // Move index to end of current match
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String main = sc.nextLine();

        System.out.print("Enter the substring to count: ");
        String sub = sc.nextLine();

        int occurrences = countOccurrences(main, sub);
        System.out.println("The substring '" + sub + "' appears " + occurrences + " time(s).");

        sc.close();
    }
}
