import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;
import java.util.Map;

public class OrderApp extends JFrame {
    Map<String,Integer> orders = new LinkedHashMap<String,Integer>();
    private JPanel MainPanel;
    private JCheckBox iskenderCheckBox;
    private JCheckBox beytiCheckBox;
    private JCheckBox ayranCheckBox;
    private JCheckBox salataCheckBox;
    private JButton siparişleriGösterButton;
public OrderApp() {
    setContentPane(MainPanel);
    setTitle("Welcome");
    setSize(250,200);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);


    siparişleriGösterButton.addActionListener(new ActionListener() {

        public void showOrders(){
            int total = 0;
            String  message = "";
            if (orders.isEmpty()){
                message = "Siparişiniz yoktur.";
            }
            else {
                message += "Siparişler \n";
                for (Map.Entry<String,Integer> entry : orders.entrySet()){
                    message += entry.getKey() + "\n";
                    total += entry.getValue();
                }
                message += "Toplam Tutar: " + total + "TL";
            }
            JOptionPane.showMessageDialog(null,message);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
          if (iskenderCheckBox.isSelected()){
              orders.put("İskender",100);
          }
          else {
              orders.remove("İskender");
          }
            if (beytiCheckBox.isSelected()){
                orders.put("Beyti",100);
            }
            else {
                orders.remove("Beyti");
            }
            if (ayranCheckBox.isSelected()){
                orders.put("Ayran",10);
            }
            else {
                orders.remove("Ayran");
            }
            if (salataCheckBox.isSelected()){
                orders.put("Salata",30);
            }
            else {
                orders.remove("Salata");
            }
            showOrders();
        }
    });
}

    public static void main(String[] args) {
        OrderApp orderApp = new OrderApp();
    }
}
