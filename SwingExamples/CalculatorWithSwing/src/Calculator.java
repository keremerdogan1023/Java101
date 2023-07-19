import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    private JTextField firstNumber;
    private JTextField secondNumber;
    private JTextField result;
    private JButton addition;
    private JButton subtraction;
    private JButton multiplication;
    private JButton division;
    private JPanel mainPanel;
    private JButton clear;

    public Calculator() {
    setContentPane(mainPanel);
    setTitle("Welcome");
    setSize(250,200);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
    addition.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int number1 = Integer.valueOf(firstNumber.getText());
            int number2 = Integer.valueOf(secondNumber.getText());
            result.setText(String.valueOf(number1+number2));
        }
    });
    subtraction.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int number1 = Integer.valueOf(firstNumber.getText());
            int number2 = Integer.valueOf(secondNumber.getText());
            result.setText(String.valueOf(number1-number2));
        }
    });
    multiplication.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int number1 = Integer.valueOf(firstNumber.getText());
            int number2 = Integer.valueOf(secondNumber.getText());
            result.setText(String.valueOf(number1*number2));
        }
    });
    division.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int number1 = Integer.valueOf(firstNumber.getText());
            int number2 = Integer.valueOf(secondNumber.getText());
            result.setText(String.valueOf(number1/number2));
        }
    });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumber.setText("");
                secondNumber.setText("");
                result.setText("");
            }
        });
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
    }
}
