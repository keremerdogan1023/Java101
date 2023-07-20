import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainLayer extends JFrame {
    DefaultListModel model = new DefaultListModel();
    private JList list1;
    private JLabel messageLabel;
    private JButton kullanıcıSilButton;
    private JButton kullanıcıEkleButton;
    private JPanel MainPanel;


    public MainLayer() {
    setContentPane(MainPanel);
    setTitle("Welcome");
    setSize(500,500);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
    list1.setModel(model);
    kullanıcıEkleButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            messageLabel.setText("");
            String answer = JOptionPane.showInputDialog("Kullanıcı ismi");

            if (answer != null){
                if (answer.trim().equals("")){
                    messageLabel.setText("Boş bir kullanıcı ismi girdiniz.");
                }
                else {
                    model.addElement(answer);
                    messageLabel.setText("Kullanıcım başarılı bir şekilde eklendi");
                }
            }
            else {
                messageLabel.setText("İşlem iptal edildi.");
            }

        }
    });


        kullanıcıSilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("");
                int selectedIndex = list1.getSelectedIndex();
                if (selectedIndex == -1){
                    if (model.getSize() == 0){
                        messageLabel.setText("Liste şuanda boş");
                    }
                    else {
                        messageLabel.setText("Lütfen satırı seçiniz.");

                    }

                }else {
                    Object deleted = model.getElementAt(selectedIndex);
                    model.removeElement(deleted);
                }

            }
        });
    }

    public static void main(String[] args) {
        MainLayer layer = new MainLayer();
    }
}
