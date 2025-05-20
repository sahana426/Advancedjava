package ArrayList2;
import java.util.ArrayList;
import java.util.Collections;

public class SortColors {
    public static void main(String[] args) {
        // Create an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();
        
        // Add colors to the ArrayList
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Orange");
        
        // Sort the colors
        Collections.sort(colors);
        
        // Print the sorted list
        System.out.println("Sorted list of colors: " + colors);
    }
}
