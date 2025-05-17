package githublab;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.List;

public class CountryListDemo extends JFrame {

    String[] countries = {
        "USA", "India", "Vietnam", "Canada", "Denmark",
        "France", "Great Britain", "Japan", "Africa",
        "Greenland", "Singapore"
    };

    JList<String> countryList;

    public CountryListDemo() {
        setTitle("JList Example");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        countryList = new JList<>(countries);
        countryList.setVisibleRowCount(8);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrollPane = new JScrollPane(countryList);

        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    List<String> selected = countryList.getSelectedValuesList();
                    System.out.println("Selected countries:");
                    for (String country : selected) {
                        System.out.println("[" + country + "]");
                    }
                    System.out.println("-----");
                }
            }
        });

        add(scrollPane);
        setLocationRelativeTo(null); // Center window
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryListDemo();
    }
}



