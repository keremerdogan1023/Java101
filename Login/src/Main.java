import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kullancıadı = "Kerem";
        String password = "123456";
        int denemehakki = 3;
        System.out.println("Hoşgeldiniz...");
        while (true){
            System.out.println("Kullanıcı adını giriniz: ");
            String testid = scanner.nextLine();
            System.out.println("Şifrenizi giriniz");
            String testpassword = scanner.nextLine();
            if (kullancıadı.equals(testid) && password.equals(testpassword)){
                System.out.println("Giriş başarılı");
                break;
            }
            else{
                denemehakki--;
                System.out.println("Bilgiler hatalı tekrar deneyiniz");
            }
            if (denemehakki == 0){
                System.out.println("Deneme hakkınız bitti daha sonra tekrar deneyin");
                break;
            }
        }
    }
}