package stringoperations;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class program4c {

    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Image Button Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create label to display message
        JLabel messageLabel = new JLabel("Click a button", SwingConstants.CENTER);
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 20));

        // Load images
        ImageIcon digitalIcon = new ImageIcon("C:/Users/dell/OneDrive/Desktop/advanncedjava2/stringoperations/src/stringoperations/digitalclock.png");
        ImageIcon hourglassIcon = new ImageIcon("C:/Users/dell/OneDrive/Desktop/advanncedjava2/stringoperations/src/stringoperations/hourglass.png");

        // Create buttons with images
        JButton digitalButton = new JButton(digitalIcon);
        JButton hourglassButton = new JButton(hourglassIcon);

        // Tooltips (optional)
        digitalButton.setToolTipText("Digital Clock");
        hourglassButton.setToolTipText("Hour Glass");

        // Add action listeners
        digitalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Digital Clock is pressed");
            }
        });

        hourglassButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Hour Glass is pressed");
            }
        });

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(digitalButton);
        buttonPanel.add(hourglassButton);

        // Add components to frame
        frame.setLayout(new BorderLayout());
        frame.add(messageLabel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);

        // Show frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
