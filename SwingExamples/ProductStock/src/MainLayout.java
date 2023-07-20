import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainLayout extends JFrame{
    private JTextField tfProductName;
    private JTextField tfPrice;
    private JComboBox cbCategory;
    private JButton addProduct;
    private JTable table1;
    private JPanel MainPanel;
    private JLabel messageLabel;
    private JButton updateProduct;
    private JButton deleteProduct;

    public MainLayout() {
        setContentPane(MainPanel);
        setTitle("Welcome");
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        createTable();
        addProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("");
                DefaultTableModel model = (DefaultTableModel) table1.getModel();

                if (tfProductName.getText().trim().equals("")){
                    messageLabel.setText("Ürün ismi boş bırakılamaz.");
                }
                else {
                    Object [] added = {tfProductName.getText(),cbCategory.getSelectedItem().toString(),tfPrice.getText()};
                    model.addRow(added);
                }
            }
        });
        updateProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               messageLabel.setText("");
                DefaultTableModel model = (DefaultTableModel) table1.getModel();
                int selectedRow = table1.getSelectedRow();
                if (selectedRow == -1){
                    if (table1.getRowCount() == 0){
                        messageLabel.setText("Ürün tablosu şuanda boş");
                    }
                    else {
                        messageLabel.setText("Lütfen güncellenecek bir ürün seçiniz.");
                    }
                }
                else {
                    model.setValueAt(tfProductName.getText(),selectedRow,0);
                    model.setValueAt(cbCategory.getSelectedItem().toString(),selectedRow,1);
                    model.setValueAt(tfPrice.getText(),selectedRow,2);
                    messageLabel.setText("Ürün başarıyla güncellendi.");
                }
            }
        });
        table1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                DefaultTableModel model = (DefaultTableModel) table1.getModel();

                int selectedRow = table1.getSelectedRow();
                tfProductName.setText(model.getValueAt(selectedRow,0).toString());
                cbCategory.setSelectedItem(model.getValueAt(selectedRow,1).toString());
                tfPrice.setText(model.getValueAt(selectedRow,2).toString());
            }
        });
        deleteProduct.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("");
                DefaultTableModel model = (DefaultTableModel) table1.getModel();
                int selectedRow = table1.getSelectedRow();

                if (selectedRow == -1){
                    if (table1.getRowCount() == 0){
                        messageLabel.setText("Ürün tablosu boş");
                    }else {
                        messageLabel.setText("Lütfen bir ürün seçiniz.");
                    }
                }else {
                    model.removeRow(selectedRow);
                    messageLabel.setText("Ürün başarıyla silindi.");
                }
            }
        });
    }

    private void createTable(){
      table1.setModel(new DefaultTableModel(
              null,
              new String[] {"Ürün İsmi","Kategori","Fiyat"}

      ));
    }

    public static void main(String[] args) {
        MainLayout layout = new MainLayout();
    }
}

