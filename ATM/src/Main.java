import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bakiye = 2500;
        int tutar;
        System.out.println("İşlemler: 1.Bakiye öğrenme\n 2.Para çekme\n 3.Para yatırma\n Çıkış için 'q' ya basın" );

        while (true){
            System.out.print("Yapacağınız işlemi seçin:");
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("Çıkış yapılıyor");
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz:"+ bakiye);
            }
            else if (islem.equals("2")) {
                System.out.println("Çekmek istediğiniz miktarı giriniz");
                tutar = scanner.nextInt();
                if (tutar<=bakiye){
                    bakiye -= tutar;
                    System.out.println("Yeni bakiye:" + bakiye);
                }
                else {
                    System.out.println("Bakiye yetersiz");
                }

            } else if (islem.equals("3")) {
                System.out.println("Yatırmak istediğiniz miktarı giriniz");
                tutar = scanner.nextInt();
                bakiye += tutar;
                System.out.println("Yeni bakiye:" + bakiye);

            }
            else {
                System.out.println("Geçersiz işlem.");
            }
        }
    }
}