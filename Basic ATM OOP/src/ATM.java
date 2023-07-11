import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesap){
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hoşgeldiniz");
        int deneme_hakki = 3;
        int bakiye = hesap.getBakiye();
        while (true){
            if(login.login(hesap)){
                System.out.println("Giriş Başarılı");
                break;
            }
            else {
                deneme_hakki--;
                System.out.println("Giriş başarısız "+ deneme_hakki + "deneme hakkınız kaldı.");
            }
        }if (deneme_hakki == 0){
            System.out.println("Deneme hakkınız bitti daha sonra tekrar deneyiniz.");
            return;
        }

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
                int tutar = scanner.nextInt();
                scanner.nextLine();
                if (tutar<=bakiye){
                    hesap.paraCek(tutar);
                }
                else {
                    System.out.println("Bakiye yetersiz");
                }

            } else if (islem.equals("3")) {
                System.out.println("Yatırmak istediğiniz miktarı giriniz");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);

            }
            else {
                System.out.println("Geçersiz işlem.");
            }
        }
    }
}
