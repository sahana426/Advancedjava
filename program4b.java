package stringoperations;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class program4b {

    public static void main(String[] args) {
        // Create the main JFrame
        JFrame frame = new JFrame("Country Button Demo");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label to display messages
        JLabel label = new JLabel("Press a button", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 20));

        // Create buttons
        JButton indiaButton = new JButton("India");
        JButton srilankaButton = new JButton("Srilanka");

        // Create a panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(indiaButton);
        buttonPanel.add(srilankaButton);

        // Add ActionListeners to buttons
        indiaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("India is pressed");
            }
        });

        srilankaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Srilanka is pressed");
            }
        });

        // Add components to frame
        frame.setLayout(new BorderLayout());
        frame.add(label, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Center the frame on screen and make it visible
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
