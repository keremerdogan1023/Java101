import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kullanıcıdan alınan 3 sayıdan en büyüğünü bulucak.

        Scanner scanner = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();
        System.out.println("Üçüncü sayıyı giriniz: ");
        int sayi3 = scanner.nextInt();

        int enBuyukSayı;

        if (sayi1>=sayi2 && sayi1>=sayi3){
            enBuyukSayı=sayi1;
        } else if (sayi2>=sayi1 && sayi2>=sayi3) {
            enBuyukSayı=sayi2;
        }
        else {
            enBuyukSayı=sayi3;
        }
        System.out.println("En büyük sayı:" + enBuyukSayı);

    }
}