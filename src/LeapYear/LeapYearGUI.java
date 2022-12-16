package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkyear();
            }
        });
    }

    public void checkyear() {
        try {
            if(tfYear.getText() == " ") {
                throw new IllegalArgumentException("Empty String!");
            }
            double year = Double.parseDouble(tfYear.getText());
            boolean leap = false;

            if(year < 0) {
                throw new IllegalArgumentException("Input is invalid!");
            }

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        leap = true;
                    } else {
                        leap = false;
                    }
                } else {
                    leap = true;
                }
            } else {
                leap = false;
            }

            if (leap) {
                JOptionPane.showMessageDialog(panel1, "Leap Year");
            } else {
                JOptionPane.showMessageDialog(panel1, "Not a Leap Year");
            }
            tfYear.setText("");
        }
        catch(IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            tfYear.setText("");
        }
    }
    public static void main(String[] args) {
        LeapYearGUI lp = new LeapYearGUI();
        lp.setContentPane(lp.panel1);
        lp.setSize(400, 400);
        lp.setDefaultCloseOperation(EXIT_ON_CLOSE);
        lp.setVisible(true);
        lp.setTitle("Leap Year Checker");
    }
}
