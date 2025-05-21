package ArrayList3;
import java.util.LinkedList;

public class InsertAtEndLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();
        
        // Add colors to the LinkedList
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        
        // Insert the specified element at the end of the list using offerLast
        colors.offerLast("Pink");
        
        // Print the updated list
        System.out.println("Updated LinkedList: " + colors);
    }
}
