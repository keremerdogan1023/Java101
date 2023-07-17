import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String id = "Kerem";
        String password = "123456";
        int tryAttemptNumber = 3;
        System.out.println("Hoşgeldiniz...");
        while (true){
            System.out.println("Kullanıcı adını giriniz: ");
            String testid = scanner.nextLine();
            System.out.println("Şifrenizi giriniz");
            String testpassword = scanner.nextLine();
            if (id.equals(testid) && password.equals(testpassword)){
                System.out.println("Giriş başarılı");
                break;
            }
            else{
                tryAttemptNumber--;
                System.out.println("Bilgiler hatalı tekrar deneyiniz");
            }
            if (tryAttemptNumber == 0){
                System.out.println("Deneme hakkınız bitti daha sonra tekrar deneyin");
                break;
            }
        }
    }
}