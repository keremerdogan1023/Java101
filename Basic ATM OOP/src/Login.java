import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap){
        Scanner scanner = new Scanner(System.in);
        String kullanici_adi;
        String sifre;
        System.out.println("Kullanıcı adınızı giriniz:");
        kullanici_adi = scanner.nextLine();
        System.out.println("Şifrenizi giriniz:");
        sifre = scanner.nextLine();
        if (kullanici_adi.equals(hesap.getKullanici_adi())  && sifre.equals(hesap.getSifre())){
            System.out.println("Başarıyla giriş yapıldı.");
            return true;
        }
        else {
            System.out.println("Giriş bilgileri hatalı!");
            return false;
        }
    }
}
