/*Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display them on console whenever the countries are selected on the list.*/
package githublab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedHashSet;

public class CountryListDemo  extends JFrame {

    String[] countries = {
        "USA", "India", "Vietnam", "Canada", "Denmark",
        "France", "Great Britain", "Japan", "Africa",
        "Greenland", "Singapore"
    };

    JList<String> countryList;
    JTextArea outputArea;
    LinkedHashSet<String> clickedCountries = new LinkedHashSet<>();

    public CountryListDemo() {
        setTitle("JList Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // JList setup
        countryList = new JList<>(countries);
        countryList.setVisibleRowCount(8);
        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // One click at a time
        JScrollPane listScrollPane = new JScrollPane(countryList);

        // Output area
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane outputScrollPane = new JScrollPane(outputArea);

        // Mouse listener to detect clicks
        countryList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int index = countryList.locationToIndex(e.getPoint());
                if (index >= 0) {
                    String selectedCountry = countryList.getModel().getElementAt(index);
                    if (!clickedCountries.contains(selectedCountry)) {
                        clickedCountries.add(selectedCountry);
                        outputArea.append("[" + selectedCountry + "]\n");
                    }
                }
            }
        });

        // Layout
        add(listScrollPane, BorderLayout.WEST);
        add(outputScrollPane, BorderLayout.CENTER);

        setLocationRelativeTo(null); // Center window
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryListDemo();
    }
}




