import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainLayout extends JFrame{
    private JTextField tfId;
    private JPasswordField pfPassword;
    private JButton girişYapButton;
    private JLabel messageLabel;
    private JPanel MainPanel;

    public MainLayout() {
        setContentPane(MainPanel);
        setTitle("Welcome");
        setSize(250,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    girişYapButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = tfId.getText();
            String password = new String(pfPassword.getPassword());
            String message;
            if (username.equals("Kerem Erdoğan") && password.equals("12345")){
                message = "Hoşgeldiniz " + username;
            }

            else if ((!username.equals("Kerem Erdoğan") && password.equals("12345"))){
                message = "Kullanıcı adı hatalı";
            }
            else if ((username.equals("Kerem Erdoğan") && !password.equals("12345"))){
                message = "Parola hatalı";
            }
            else {
                message = "Kullanıcı adı ve parola hatalı";
            }
            messageLabel.setText(message);
            if (message.equals("Hoşgeldiniz " + username)){
                JOptionPane.showMessageDialog(null,message);
                System.exit(0);
            }
            else {
                JOptionPane.showMessageDialog(null,message);
            }

        }
    });

}

    public static void main(String[] args) {
        MainLayout layout = new MainLayout();
    }
}
