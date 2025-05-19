/*Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display the capital of the countries on console whenever the countries are selected on the list.*/
package githublab;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.*;

public class CountryCapitalList extends JFrame {

    // Countries and their capitals in a LinkedHashMap to preserve order
    private static final Map<String, String> countryCapitals = new LinkedHashMap<>();
    static {
        countryCapitals.put("USA", "Washington, D.C.");
        countryCapitals.put("India", "New Delhi");
        countryCapitals.put("Vietnam", "Hanoi");
        countryCapitals.put("Canada", "Ottawa");
        countryCapitals.put("Denmark", "Copenhagen");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Great Britain", "London");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("Africa", "—"); // Africa is a continent
        countryCapitals.put("Greenland", "Nuuk");
        countryCapitals.put("Singapore", "Singapore");
    }

    public CountryCapitalList() {
        setTitle("Country Capital List");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the country list
        JList<String> countryList = new JList<>(countryCapitals.keySet().toArray(new String[0]));
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane listScrollPane = new JScrollPane(countryList);
        listScrollPane.setBorder(BorderFactory.createTitledBorder("Select Countries"));

        // Text area to display capitals
        JTextArea capitalArea = new JTextArea();
        capitalArea.setEditable(false);
        JScrollPane capitalScrollPane = new JScrollPane(capitalArea);
        capitalScrollPane.setBorder(BorderFactory.createTitledBorder("Capitals"));

        // Event listener for selection
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    Object[] selected = countryList.getSelectedValues();
                    capitalArea.setText(""); // clear previous output
                    for (Object obj : selected) {
                        String country = (String) obj;
                        capitalArea.append(country + " → " + countryCapitals.get(country) + "\n");
                    }
                }
            }
        });

        // Layout panels
        add(listScrollPane, BorderLayout.WEST);
        add(capitalScrollPane, BorderLayout.CENTER);

        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalList();
    }
}
