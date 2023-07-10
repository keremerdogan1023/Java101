import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza hoşgeldiniz");
        double anapara;
        int süre;
        double faizYuzdesi = 0.06;
        System.out.println("Faize yatırmak istediğiniz para miktarını giriniz:");
        anapara=scanner.nextDouble();
        System.out.println("Paranızı faize yatırmak istediğiniz yıl sayısını giriniz:");
        süre = scanner.nextInt();

        for (int i = 1; i<=süre; i++){
            anapara = (anapara*faizYuzdesi)+anapara;
            System.out.println(i + " yıl sonunda anaparanız:" + anapara);
        }

    }
}