import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1;
        int sayi2;
        double sonuc;
        System.out.println(" 1.Toplama İşlemi: \n 2.Çıkarma İşlemi: " +
                "\n 3.Çarpma İşlemi: \n 4.Bölme İşlemi:");
        System.out.println("\nİşlemi seçiniz:");
        String islem = scanner.nextLine();
        switch (islem){
            case "1":
                System.out.println("Toplama İşlemi:\n");
                System.out.println("Birinci sayıyı giriniz: ");
                sayi1 = scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz: ");
                sayi2 = scanner.nextInt();
                sonuc = sayi1+sayi2;
                System.out.println("Sonuç: "+ sonuc);
                break;
            case "2":
                System.out.println("Çıkarma İşlemi:\n");
                System.out.println("Birinci sayıyı giriniz: ");
                sayi1 = scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz: ");
                sayi2 = scanner.nextInt();
                sonuc = sayi1-sayi2;
                System.out.println("Sonuç: "+ sonuc);
                break;
            case "3":
                System.out.println("Çarpma İşlemi:\n");
                System.out.println("Birinci sayıyı giriniz: ");
                sayi1 = scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz: ");
                sayi2 = scanner.nextInt();
                sonuc = sayi1*sayi2;
                System.out.println("Sonuç: "+ sonuc);
                break;
            case "4":
                System.out.println("Bölme İşlemi:\n");
                System.out.println("Birinci sayıyı giriniz: ");
                sayi1 = scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz: ");
                sayi2 = scanner.nextInt();
                sonuc = ((double)sayi1/sayi2);
                System.out.println("Sonuç: "+ sonuc);
                break;
            default:
                System.out.println("1-4 arasında işlem seçiniz ");
        }

    }
}