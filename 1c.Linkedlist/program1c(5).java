package ArrayList3;
import java.util.LinkedList;
import java.util.Collections;

public class SwapElementsLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();
        
        // Add colors to the LinkedList
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Orange");
        
        // Swap the first and third elements (index 0 and index 2)
        Collections.swap(colors, 0, 2);
        
        // Print the updated LinkedList after swap
        System.out.println("LinkedList after swapping first and third elements: " + colors);
    }
}
