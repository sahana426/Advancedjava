package stringoperations;
import javax.swing.*;
import java.awt.*;

public class program5b {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Color Tabbed Pane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create the tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels with background colors
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);

        // Add tabs to the tabbed pane
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Add the tabbed pane to the frame
        frame.add(tabbedPane);

        // Center and show the frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
