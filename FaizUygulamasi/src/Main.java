import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza hoşgeldiniz");
        double balance;
        int time;
        double taxPercentage = 0.06;
        System.out.println("Faize yatırmak istediğiniz para miktarını giriniz:");
        balance=scanner.nextDouble();
        System.out.println("Paranızı faize yatırmak istediğiniz yıl sayısını giriniz:");
        time = scanner.nextInt();

        for (int i = 1; i<=time; i++){
            balance = (balance*taxPercentage)+balance;
            System.out.println(i + " yıl sonunda anaparanız:" + balance);
        }

    }
}