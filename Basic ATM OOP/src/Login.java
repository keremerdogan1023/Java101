import java.util.Scanner;

public class Login {
    public boolean login(Account account){
        Scanner scanner = new Scanner(System.in);
        String kullanici_adi;
        String sifre;
        System.out.println("Kullanıcı adınızı giriniz:");
        kullanici_adi = scanner.nextLine();
        System.out.println("Şifrenizi giriniz:");
        sifre = scanner.nextLine();
        if (kullanici_adi.equals(account.getId())  && sifre.equals(account.getPassword())){
            System.out.println("Başarıyla giriş yapıldı.");
            return true;
        }
        else {
            System.out.println("Giriş bilgileri hatalı!");
            return false;
        }
    }
}
