package ArrayList2;
import java.util.ArrayList;

public class SearchColor {
    public static void main(String[] args) {
        // Create an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();
        
        // Add colors to the ArrayList
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Orange");
        
        // Search if "Red" is present in the ArrayList
        if (colors.contains("Red")) {
            System.out.println("Color 'Red' is available.");
        } else {
            System.out.println("Color 'Red' is not available.");
        }
    }
}
