import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hoşgeldiniz...");
        String islemler = ("İşlemler...\n" +
                "1.Daire Alan Hesaplama \n" +
                "2.Üçgen Çevresi Hesaplama \n"+
                "3.Vektör iç çarpım hesaplama \n"+
                "Çıkış için : i");
        while (true){
            System.out.println(islemler);
            System.out.println("İşlemi seçiniz:");
            String islem = scanner.nextLine();
            if (islem.equals("i")){
                System.out.println("Programdan çıkılıyor...");
                break;
            } else if (islem.equals("1")) {
                System.out.println("Dairenin yarıçapı: ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.daireAlan(yaricap);

            } else if (islem.equals("2")) {
                System.out.println("Kenar 1 : ");
                int kenar1 = scanner.nextInt();
                System.out.println("Kenar 2 : ");
                int kenar2 = scanner.nextInt();
                System.out.println("Kenar 3 : ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.ucgenCevresi(kenar1,kenar2,kenar3);
            } else if (islem.equals("3")) {
                Vec vec1 = new Vec("Vektör 1");
                Vec vec2 = new Vec("Vektör 2");
                Problem.Fizik.icCarpim(vec1,vec2);
            }else {
                System.out.println("Geçersiz işlem!");
            }
        }
    }
}