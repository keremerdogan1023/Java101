import java.io.File;
import java.util.Scanner;

public class Main {
    private static Card[][] cards = new Card[4][4];

    public static void loadGameFromSave(){
        Scanner scanner = new Scanner(System.in);
        File file = new File("save.bin");
        if (file.exists()){
            System.out.println("Kaydedilmiş bir oyununuz var kayıttan devam etmek ister misiniz? (yes or no)");
            String answer =scanner.nextLine();
            if (answer.equals("yes")){
                cards = GameSave.loadGame();
                return;
            }

        }
        cards[0][0] = new Card('E');
        cards[0][1] = new Card('A');
        cards[0][2] = new Card('B');
        cards[0][3] = new Card('F');
        cards[1][0] = new Card('G');
        cards[1][1] = new Card('A');
        cards[1][2] = new Card('D');
        cards[1][3] = new Card('H');
        cards[2][0] = new Card('F');
        cards[2][1] = new Card('C');
        cards[2][2] = new Card('D');
        cards[2][3] = new Card('H');
        cards[3][0] = new Card('E');
        cards[3][1] = new Card('G');
        cards[3][2] = new Card('B');
        cards[3][3] = new Card('C');

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        loadGameFromSave();
        while (isGameFinished() == false) {

            gameBoard();
            System.out.print("Çıkış için q'ya basın (yes ya da no)");
            String exit = scanner.nextLine();

            if (exit.equals("yes")) {
                System.out.print("Oyunu kaydetmek istiyor musunuz ? (yes ya da no)");

                String save = scanner.nextLine();

                if (save.equals("yes")){

                    GameSave.saveGame(cards);

                }
                else {
                    System.out.println("Oyun kaydedilmedi");
                }
                System.out.println("Programdan Çıkılıyor...");
                break;

            }


            guess();
        }

    }
    public static void gameBoard(){

        for (int i = 0 ;  i < 4 ; i++) {
            System.out.println("____________________");
            for (int j = 0 ; j < 4 ; j++) {

                if (cards[i][j].isGuess()) {
                    System.out.print(" |" + cards[i][j].getValue() + "| ");

                }
                else {
                    System.out.print(" | | ");

                }
            }
            System.out.println("");
        }
        System.out.println("____________________");

    }
    public static boolean isGameFinished(){
        for (int i = 0 ; i<4; i++){
            for (int j = 0 ; j<4; j++){
                if (cards[i][j].isGuess() == false){
                    return false;
                }
            }
        }
        return true;
    }
    public static void guess(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci tahmin için i değerini giriniz: ");
        int i1 = scanner.nextInt();
        System.out.println("Birinci tahmin için j değerini giriniz: ");
        int j1 = scanner.nextInt();
        cards[i1][j1].setGuess(true);
        gameBoard();
        System.out.println("İkinci tahmin için i değerini giriniz: ");
        int i2 = scanner.nextInt();
        System.out.println("İkinci tahmin için j değerini giriniz: ");
        int j2 = scanner.nextInt();
        scanner.nextLine();
        if (cards[i1][j1].getValue() == cards[i2][j2].getValue()){
            cards[i2][j2].setGuess(true);
            System.out.println("Doğru tahmin.");
        }
        else {
            cards[i1][j1].setGuess(false);
            System.out.println("Yanlış tahmin tekrar deneyiniz...");
        }




    }
}
