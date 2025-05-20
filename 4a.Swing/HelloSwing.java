package stringoperations;
import javax.swing.*;
import java.awt.*;

public class HelloSwing {

    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Swing Hello Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 200); // Set frame size

        // Create a JLabel with the message
        JLabel label = new JLabel("Hello! VI C , Welcome to Swing Programming", SwingConstants.CENTER);

        // Set font: Plain, Size 32
        label.setFont(new Font("Arial", Font.PLAIN, 32));

        // Set text color to blue
        label.setForeground(Color.BLUE);

        // Add label to frame
        frame.add(label);

        // Center the frame on screen
        frame.setLocationRelativeTo(null);

        // Make frame visible
        frame.setVisible(true);
    }
}
