package ArrayList2;
import java.util.ArrayList;

public class DeleteNthElement {
    public static void main(String[] args) {
        // Create an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();
        
        // Add colors to the ArrayList
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Orange");
        
        // Define nth index to remove
        int n = 3;  // For example, removing the element at index 3 (Yellow)
        
        // Remove the nth element (index 3)
        if (n < colors.size()) {
            colors.remove(n);
            System.out.println("Updated list after removing the " + (n+1) + "th element: " + colors);
        } else {
            System.out.println("Invalid index.");
        }
    }
}
