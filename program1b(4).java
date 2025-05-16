package ArrayList2;
import java.util.ArrayList;
import java.util.List;

public class ExtractColors {
    public static void main(String[] args) {
        // Create an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();
        
        // Add colors to the ArrayList
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Orange");
        
        // Extract the 1st and 2nd elements (index 0 and 1)
        List<String> sublist = colors.subList(0, 2);
        
        // Print the sublist
        System.out.println("Extracted colors: " + sublist);
    }
}
