import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainLayout extends JFrame {
    private int say;
    private JProgressBar checkProgress;
    private JPanel MainPanel;
    private JButton downloadButton;

public MainLayout() {
    setContentPane(MainPanel);
    setTitle("Welcome");
    setSize(500,500);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);

    downloadButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Timer timer = new Timer(50,null);

            timer.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    say++;
                    checkProgress.setValue(say);
                    if (checkProgress.getValue() == 100){
                        setVisible(false);
                        timer.stop();
                        ResultPage resultPage = new ResultPage();
                        resultPage.setVisible(true);
                        //JOptionPane.showMessageDialog(MainLayout.this,"Dosya indirme tamamlandı");

                        //System.exit(0);
                    }
                }
            });
            timer.start();
        }
    });
}

    public static void main(String[] args) {
        MainLayout layout = new MainLayout();
    }
}
