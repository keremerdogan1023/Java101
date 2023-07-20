import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Raffle extends JFrame {
    private String filePath = "";
    private ArrayList<String > participants = new ArrayList<String >();
    private Set<String> winners = new TreeSet<String>();
    private DefaultListModel model = new DefaultListModel<>();

    private JTextField searchBox;
    private JButton gözatButton;
    private JList winnersList;
    private JButton çekilişYapButton;
    private JPanel MainPanel;


    public Raffle() {
    setContentPane(MainPanel);
    setTitle("Welcome");
    setSize(500,500);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
    winnersList.setModel(model);
    Random random = new Random();
    gözatButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            int i = fileChooser.showOpenDialog(Raffle.this);

            if (i == JFileChooser.APPROVE_OPTION){
                Raffle.this.filePath = fileChooser.getSelectedFile().getPath();
                searchBox.setText(filePath);

            }


        }
    });

        çekilişYapButton.addActionListener(new ActionListener() {
            public void raffle(){
                try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"ISO8859_9"))){
                    String word;
                    while ((word = reader.readLine()) != null ) {
                        participants.add(word);

                    }


            } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                while (winners.size() != 10){
                    winners.add(participants.get(random.nextInt(participants.size())));

                }

            }
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Raffle.this.filePath.equals("")){
                    JOptionPane.showMessageDialog(Raffle.this,"Lütfen bir dosya seçiniz.");

                }
                else {

                    raffle();

                    for (String winner : winners){
                        model.addElement(winner);



                }


            }
        }});
    }

    public static void main(String[] args) {
        Raffle raffle = new Raffle();
    }
}
