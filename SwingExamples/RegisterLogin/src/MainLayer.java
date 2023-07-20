import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class User{
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

public class MainLayer extends JFrame {
    private static ArrayList<User> userList = new ArrayList<User>();

    public static ArrayList<User> getUserList() {
        return userList;
    }

    public static void setUserList(ArrayList<User> userList) {
        MainLayer.userList = userList;
    }

    private JPanel registerLoginPanel;
    private JPanel loginPanel;
    private JButton registerButton;
    private JButton loginButton;
    private JTextField tfId;
    private JTextField tfPassword;
    private JPanel mainPanel;
    private JPasswordField pfPassword;

    public MainLayer() {
    setContentPane(mainPanel);
    setTitle("Welcome");
    setSize(500,500);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
    registerButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            RegisterLayer registerLayer = new RegisterLayer();
            registerLayer.setVisible(true);
        }
    });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = tfId.getText();
                String password = new String(pfPassword.getPassword());

                if (userList.size() == 0){
                    JOptionPane.showMessageDialog(null,"Hiçbir kullanıcı bulunmamaktadır.");
                }
                else {
                    for (User user : userList){
                        if (user.getUsername().equals(username) && user.getPassword().equals(password)){
                            JOptionPane.showMessageDialog(null,"Hoşgeldiniz "+ username);
                            return;
                        }

                    }
                    JOptionPane.showMessageDialog(null,"Böyle bir kullanıcı bulunmamaktadır. Lütfen register olun.");
                }

            }
        });
    }

    public static void main(String[] args) {
        MainLayer mainLayer = new MainLayer();
    }
}
