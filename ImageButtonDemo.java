/*Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
pressed by implementing the event handling mechanism with addActionListener( ).*/
package githublab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo extends JFrame implements ActionListener {

    JButton btnClock, btnHourGlass;
    JLabel messageLabel;

    public ImageButtonDemo() {
        setTitle("Image Button Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Load and resize icons to 100x100
        ImageIcon clockIcon = new ImageIcon("C:\\Users\\Asus\\Downloads\\digitalclock.jpeg");
        ImageIcon hourglassIcon = new ImageIcon("C:\\Users\\Asus\\Downloads\\hourglass.jpg");

        Image clockImg = clockIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        Image hourglassImg = hourglassIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);

        // Create ImageIcons from resized images
        ImageIcon resizedClockIcon = new ImageIcon(clockImg);
        ImageIcon resizedHourglassIcon = new ImageIcon(hourglassImg);

        // Create buttons with resized images
        btnClock = new JButton(resizedClockIcon);
        btnHourGlass = new JButton(resizedHourglassIcon);

        // Add action listeners
        btnClock.addActionListener(this);
        btnHourGlass.addActionListener(this);

        // Label to display message
        messageLabel = new JLabel("Press an image button");
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 18));

        // Add components
        add(btnClock);
        add(btnHourGlass);
        add(messageLabel);

        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnClock) {
            messageLabel.setText("Digital Clock is pressed");
        } else if (e.getSource() == btnHourGlass) {
            messageLabel.setText("Hour Glass is pressed");
        }
    }

    public static void main(String[] args) {
        new ImageButtonDemo();
    }
}

