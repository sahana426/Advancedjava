package ArrayList3;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteratorStartFromPosition {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();
        
        // Add colors to the LinkedList
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Orange");
        
        // Create an iterator starting at the 2nd position (index 1)
        ListIterator<String> iterator = colors.listIterator(1);
        
        // Iterate through the list from the specified position
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }
    }
}
