package ArrayList3;
import java.util.LinkedList;

public class DisplayElementsAndPositions {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();
        
        // Add colors to the LinkedList
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Orange");
        
        // Display elements and their positions in the LinkedList
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Position " + i + ": " + colors.get(i));
        }
    }
}
