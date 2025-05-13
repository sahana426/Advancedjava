package ArrayList3;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListReverseIterator {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();
        
        // Add colors to the LinkedList
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Orange");
        
        // Use descendingIterator to iterate in reverse order
        Iterator<String> reverseIterator = colors.descendingIterator();
        
        // Iterate through the LinkedList in reverse
        while (reverseIterator.hasNext()) {
            System.out.println("Element: " + reverseIterator.next());
        }
    }
}
