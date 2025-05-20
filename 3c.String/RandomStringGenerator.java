package stringoperations;
import java.util.Random;
import java.util.Scanner;

public class RandomStringGenerator {

    // Characters allowed in the random string
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    // User-defined function to generate random string
    public static String generateRandomString(int length) {
        if (length <= 0) {
            return "";
        }

        Random random = new Random();
        StringBuilder result = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            result.append(CHARACTERS.charAt(index));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter desired length of the random string: ");
        int length = sc.nextInt();

        String randomStr = generateRandomString(length);
        System.out.println("Generated random string: " + randomStr);

        sc.close();
    }
}
