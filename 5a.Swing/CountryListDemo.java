package stringoperations;
import javax.swing.*;

public class program5a {
    public static void main(String[] args) {
        // Array of country names
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Create the JFrame
        JFrame frame = new JFrame("Country List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // Create the JList and put it in a JScrollPane
        JList<String> countryList = new JList<>(countries);
        JScrollPane scrollPane = new JScrollPane(countryList);

        // Add the scroll pane (which contains the JList) to the frame
        frame.add(scrollPane);

        // Center and display the frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
