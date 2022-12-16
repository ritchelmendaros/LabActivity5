package FoodOrdering;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FoodOrderGUI extends JFrame{
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
    private List<JCheckBox> bgFood;
    public FoodOrderGUI() {

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                order();
            }
        });
    }

    public void order() {
        try {
            boolean select1 = false;
            boolean select2 = false;
            double sum = 0;
            double total = 0;
            if (cPizza.isSelected()) {
                sum += 100;
                select1 = true;
            }
            if (cBurger.isSelected()) {
                sum += 80;
                select1 = true;
            }
            if (cFries.isSelected()) {
                sum += 65;
                select1 = true;
            }
            if (cSoftDrinks.isSelected()) {
                sum += 55;
                select1 = true;
            }
            if (cTea.isSelected()) {
                sum += 50;
                select1 = true;
            }
            if (cSundae.isSelected()) {
                sum += 40;
                select1 = true;
            }
            if (rbNone.isSelected()) {
                sum = sum;
                select2 = true;
            }
            if (rb5.isSelected()) {
                total = sum * 0.05;
                sum = sum - total;
                select2 = true;
            }
            if (rb10.isSelected()) {
                total = sum * 0.10;
                sum = sum - total;
                select2 = true;
            }
            if (rb15.isSelected()) {
                total = sum * 0.15;
                sum = sum - total;
                select2 = true;
            }
            if(select2 == false || select1 == false) {
                throw new IllegalArgumentException("No discount or food selected");
            }
            JOptionPane.showMessageDialog(panel1, "The total price is Php " + String.format("%.2f", sum));
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
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