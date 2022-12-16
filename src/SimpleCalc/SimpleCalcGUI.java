package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                compute();
            }
        });
    }

    public void compute() {
        String op = (String) cbOperations.getSelectedItem();
        double n1 = Double.parseDouble(tfNumber1.getText());
        double n2 = Double.parseDouble(tfNumber2.getText());
        double res = 0;
        if(op == "+") {
            res = n1 + n2;
            lblResult.setText(String.valueOf(String.format("%.0f", (res))));
        }
        if(op == "-") {
            res = n1 - n2;
            lblResult.setText(String.valueOf(String.format("%.0f", (res))));
        }
        if(op == "*") {
            res = n1 * n2;
            lblResult.setText(String.valueOf(String.format("%.0f", (res))));
        }
        if(op == "/") {
            res = n1 / n2;
            lblResult.setText(String.valueOf(String.format("%.0f", (res))));
        }
    }

    public static void main(String[] args) {
        SimpleCalcGUI calc = new SimpleCalcGUI();
        calc.setContentPane(calc.panel1);
        calc.setSize(550, 400);
        calc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calc.setVisible(true);
        calc.setTitle("Simple Calculator");
    }
}
