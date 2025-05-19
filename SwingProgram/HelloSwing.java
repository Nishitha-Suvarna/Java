/*4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing
Programming in Blue color plain font with font size of 32 using Jframe and Jlabel*/
package githublab;
import javax.swing.*;
import java.awt.*;
public class HelloSwing {
	

	

	    public static void main(String[] args) {
	        // Create a new JFrame
	        JFrame frame = new JFrame("Swing Hello Program");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(600, 200); // Set frame size

	        // Create a JLabel with the message
	        JLabel label = new JLabel("Hello! VI C , Welcome to Swing Programming", SwingConstants.CENTER);

	        // Set font, color, and style
	        label.setFont(new Font("SansSerif", Font.PLAIN, 32)); // Plain font, size 32
	        label.setForeground(Color.BLUE); // Set text color to blue

	        // Add the label to the frame
	        frame.add(label);

	        // Center the frame and make it visible
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	    }
	}


