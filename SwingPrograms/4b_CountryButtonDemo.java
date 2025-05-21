/*Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the
event handling mechanism with addActionListener( ).*/
package githublab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CountryButtonDemo extends JFrame implements ActionListener {
	



	    JButton btnIndia, btnSrilanka;
	    JLabel label;

	    public CountryButtonDemo() {
	        // Frame settings
	        setTitle("Country Button Demo");
	        setSize(400, 200);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new FlowLayout());

	        // Buttons
	        btnIndia = new JButton("India");
	        btnSrilanka = new JButton("Srilanka");

	        // Label
	        label = new JLabel("Press a button");
	        label.setFont(new Font("Arial", Font.PLAIN, 20));

	        // Add action listeners
	        btnIndia.addActionListener(this);
	        btnSrilanka.addActionListener(this);

	        // Add components to frame
	        add(btnIndia);
	        add(btnSrilanka);
	        add(label);

	        // Center frame on screen
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    // Event handling method
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnIndia) {
	            label.setText("India is pressed");
	        } else if (e.getSource() == btnSrilanka) {
	            label.setText("Srilanka is pressed");
	        }
	    }

	    public static void main(String[] args) {
	        new CountryButtonDemo();
	    }
	}


