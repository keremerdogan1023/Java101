import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RegisterLayer extends JFrame {
    private JPanel RegisterPanel;
    private JTextField tfId;
    private JPasswordField pfPassword;
    private JButton registerButton;
public RegisterLayer() {
    setContentPane(RegisterPanel);
    setTitle("Welcome");
    setSize(500,500);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
    registerButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = tfId.getText();
            String password = new String(pfPassword.getPassword());
            ArrayList<User> users = MainLayer.getUserList();
            users.add(new User(username,password));

            setVisible(false);

        }
    });
}
}
