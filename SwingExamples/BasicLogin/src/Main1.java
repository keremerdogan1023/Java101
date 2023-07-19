import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main1 extends JFrame {
    private int say = 0;
    private JButton tıklaButton;
    private JButton OKButton;
    private JButton clearButton;
    private JTextField tfFirstName;
    private JTextField tfLastName;
    private JLabel Welcome;
    private JPanel mainPanel;

    public Main1(){
        setContentPane(mainPanel);
        setTitle("Welcome");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = tfFirstName.getText();
                String lastName = tfLastName.getText();
                Welcome.setText("Welcome" + firstName + " " + lastName);
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfFirstName.setText("");
                tfLastName.setText("");
                Welcome.setText();
            }
        });
    }

    public static void main(String[] args) {
        Main1 myFrame = new Main1();
    }

}
