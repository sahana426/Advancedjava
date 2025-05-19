package ArrayList2;
import java.util.ArrayList;
public class RemoveColors {
    public static void main(String[] args) {
        // Create an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();
        
        // Add colors to the ArrayList
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Orange");
        
        // Remove the 2nd element (index 1)
        colors.remove(1);
        
        // Remove color "Blue"
        colors.remove("Blue");
        
        // Print the updated list
        System.out.println("Updated list of colors: " + colors);
    }
}
