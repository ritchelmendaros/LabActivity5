package FoodOrdering;

import javax.swing.*;

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

    public static void main(String[] args) {
        FoodOrderGUI fo = new FoodOrderGUI();
        fo.setContentPane(fo.panel1);
        fo.setSize(550, 450);
        fo.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fo.setVisible(true);
        fo.setTitle("Food Ordering System");
    }

}
