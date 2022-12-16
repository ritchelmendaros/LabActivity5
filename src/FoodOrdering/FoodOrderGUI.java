package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    public FoodOrderGUI() {

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                order();
            }
        });
    }

    public void order() {
        double sum = 0;
        double total = 0;
        if(cPizza.isSelected()) {
            sum += 100;
        }
        if(cBurger.isSelected()) {
            sum += 80;
        }
        if(cFries.isSelected()) {
            sum += 65;
        }
        if(cSoftDrinks.isSelected()) {
            sum += 55;
        }
        if(cTea.isSelected()) {
            sum += 50;
        }
        if(cSundae.isSelected()) {
            sum += 40;
        }
        if(rbNone.isSelected()) {
            sum = sum;
        }
        if(rb5.isSelected()) {
            total = sum * 0.05;
            sum = sum - total;
        }
        if(rb10.isSelected()) {
            total = sum * 0.10;
            sum = sum - total;
        }
        if(rb15.isSelected()) {
            total = sum * 0.15;
            sum = sum - total;
        }
        JOptionPane.showMessageDialog(panel1, "The total price is Php " + String.format("%.2f", sum));
    }

    public static void main(String[] args) {
        FoodOrderGUI fo = new FoodOrderGUI();
        fo.setContentPane(fo.panel1);
        fo.setSize(550, 450);
        fo.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fo.setVisible(true);
        fo.setTitle("Food Ordering System");
    }

}
