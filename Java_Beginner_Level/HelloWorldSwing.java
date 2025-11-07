import javax.swing.*;

public class HelloWorldSwing {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Hello World Swing");
        
        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a JLabel with "Hello, World!" text
        JLabel label = new JLabel("Hello, World!", SwingConstants.CENTER);
        
        // Add the label to the frame
        frame.getContentPane().add(label);
        
        // Set the size of the frame
        frame.setSize(300, 200);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}