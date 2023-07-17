import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 2500;
        int amount;
        System.out.println("İşlemler: 1.Bakiye öğrenme\n 2.Para çekme\n 3.Para yatırma\n Çıkış için 'q' ya basın" );

        while (true){
            System.out.print("Yapacağınız işlemi seçin:");
            String operation = scanner.nextLine();
            if (operation.equals("q")){
                System.out.println("Çıkış yapılıyor");
                break;
            }
            else if (operation.equals("1")) {
                System.out.println("Bakiyeniz:"+ balance);
            }
            else if (operation.equals("2")) {
                System.out.println("Çekmek istediğiniz miktarı giriniz");
                amount = scanner.nextInt();
                if (amount<=balance){
                    balance -= amount;
                    System.out.println("Yeni bakiye:" + balance);
                }
                else {
                    System.out.println("Bakiye yetersiz");
                }

            } else if (operation.equals("3")) {
                System.out.println("Yatırmak istediğiniz miktarı giriniz");
                amount = scanner.nextInt();
                balance += amount;
                System.out.println("Yeni balance:" + balance);

            }
            else {
                System.out.println("Geçersiz işlem.");
            }
        }
    }
}