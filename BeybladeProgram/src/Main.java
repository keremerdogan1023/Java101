import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hoşgeldiniz...");
        System.out.println("Çıkış için i'ye basın");
        while (true){
            System.out.println("Hangi Beyblade'i üretmek istiyorsunuz: ");
            String beybladeTuru = scanner.nextLine();
            if (beybladeTuru.equals("i")){
                System.out.println("Çıkış yapılıyor...");
                break;
            }
            else {
                BeybladeFactory beybladeFactory = new BeybladeFactory();
                Beyblade beyblade = beybladeFactory.beybladeUret(beybladeTuru);

                if (beyblade == null){
                    System.out.println("Geçersiz beyblade ismi!");
                }
                else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                }
            }

        }
    }
}