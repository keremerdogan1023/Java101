import java.util.Scanner;

public class Main {
    public static int ebobBulma(int a, int b){
        int ebob = 1;
        for (int i = 1; i<=a && i<=b; i++){
            if (a % i== 0 && b % i == 0){
                ebob = i;
            }
        }
        return ebob;
    }
    //kullanıcıdan alınan iki sayının ebobunu bulma
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        int ebob = ebobBulma(sayi1,sayi2);
        System.out.println("En büyük ortak böleniniz: "+ ebob);
    }
}