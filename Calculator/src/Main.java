import java.util.Scanner;

public class Main {
    public static int toplama(int a, int b){
        return a+b;
    }
    public static int toplama(int a, int b, int c){
        return a+b+c;
    }
    public static int cikarma(int a, int b){
        return a-b;
    }
    public static int cikarma(int a, int b,int c){
        return a-b-c;
    }
    public static int carpma(int a, int b){
        return a*b;
    }
    public static int carpma(int a, int b,int c){
        return a*b*c;
    }
    public static int bolme(int a, int b){
        return a/b;
    }
    public static int bolme(int a, int b, int c){
        return a/b/c;
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1;
        int sayi2;
        int sayi3;
        double sonuc;
        System.out.println(" 1.Toplama İşlemi: \n 2.Çıkarma İşlemi: " +
                "\n 3.Çarpma İşlemi: \n 4.Bölme İşlemi:");

        while (true){
            System.out.println("\nİşlemi seçiniz:");
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("Çıkış yapılıyor...");
                break;
            } else if (islem.equals("1")) {
                int sayiadeti;
                System.out.println("İşlem yapmak istediğiniz sayı adetini giriniz(2 veya 3)");
                sayiadeti = scanner.nextInt();

                if (sayiadeti == 2){
                    System.out.println("İlk sayıyı giriniz:");
                    sayi1 = scanner.nextInt();
                    System.out.println("İkinci sayıyı giriniz:");
                    sayi2 = scanner.nextInt();
                    scanner.nextLine();
                    int toplam = toplama(sayi1,sayi2);
                    System.out.println("Sonuç:" + toplam);
                } else if (sayiadeti == 3) {
                    System.out.println("İlk sayıyı giriniz:");
                    sayi1 = scanner.nextInt();
                    System.out.println("İkinci sayıyı giriniz:");
                    sayi2 = scanner.nextInt();
                    System.out.println("Üçüncü sayıyı giriniz:");
                    sayi3 = scanner.nextInt();
                    scanner.nextLine();
                    int toplam = toplama(sayi1,sayi2,sayi3);
                    System.out.println("Sonuç:" + toplam);

                }
                else {
                    scanner.nextLine();
                    System.out.println("Uygun bir method bulunmamaktadır.");
                }
            } else if (islem.equals("2")) {
                int sayiadeti;
                System.out.println("İşlem yapmak istediğiniz sayı adetini giriniz(2 veya 3)");
                sayiadeti = scanner.nextInt();

                if (sayiadeti == 2){
                    System.out.println("İlk sayıyı giriniz:");
                    sayi1 = scanner.nextInt();
                    System.out.println("İkinci sayıyı giriniz:");
                    sayi2 = scanner.nextInt();
                    scanner.nextLine();
                    sonuc = cikarma(sayi1,sayi2);
                    System.out.println("Sonuç:" + sonuc);
                } else if (sayiadeti == 3) {
                    System.out.println("İlk sayıyı giriniz:");
                    sayi1 = scanner.nextInt();
                    System.out.println("İkinci sayıyı giriniz:");
                    sayi2 = scanner.nextInt();
                    System.out.println("Üçüncü sayıyı giriniz:");
                    sayi3 = scanner.nextInt();
                    scanner.nextLine();
                    sonuc = cikarma(sayi1,sayi2,sayi3);
                    System.out.println("Sonuç:" + sonuc);

                }
                else {
                    scanner.nextLine();
                    System.out.println("Uygun bir method bulunmamaktadır.");
                }
            } else if (islem.equals("3")) {
                int sayiadeti;
                System.out.println("İşlem yapmak istediğiniz sayı adetini giriniz(2 veya 3)");
                sayiadeti = scanner.nextInt();

                if (sayiadeti == 2){
                    System.out.println("İlk sayıyı giriniz:");
                    sayi1 = scanner.nextInt();
                    System.out.println("İkinci sayıyı giriniz:");
                    sayi2 = scanner.nextInt();
                    scanner.nextLine();
                    sonuc = carpma(sayi1,sayi2);
                    System.out.println("Sonuç:" + sonuc);
                } else if (sayiadeti == 3) {
                    System.out.println("İlk sayıyı giriniz:");
                    sayi1 = scanner.nextInt();
                    System.out.println("İkinci sayıyı giriniz:");
                    sayi2 = scanner.nextInt();
                    System.out.println("Üçüncü sayıyı giriniz:");
                    sayi3 = scanner.nextInt();
                    scanner.nextLine();
                    sonuc = carpma(sayi1,sayi2,sayi3);
                    System.out.println("Sonuç:" + sonuc);

                }
                else {
                    scanner.nextLine();
                    System.out.println("Uygun bir method bulunmamaktadır.");
                }
            } else if (islem.equals("4")) {
                    int sayiadeti;
                    System.out.println("İşlem yapmak istediğiniz sayı adetini giriniz(2 veya 3)");
                    sayiadeti = scanner.nextInt();

                    if (sayiadeti == 2){
                        System.out.println("İlk sayıyı giriniz:");
                        sayi1 = scanner.nextInt();
                        System.out.println("İkinci sayıyı giriniz:");
                        sayi2 = scanner.nextInt();
                        scanner.nextLine();
                        sonuc = bolme(sayi1,sayi2);
                        System.out.println("Sonuç:" + sonuc);
                    } else if (sayiadeti == 3) {
                        System.out.println("İlk sayıyı giriniz:");
                        sayi1 = scanner.nextInt();
                        System.out.println("İkinci sayıyı giriniz:");
                        sayi2 = scanner.nextInt();
                        System.out.println("Üçüncü sayıyı giriniz:");
                        sayi3 = scanner.nextInt();
                        scanner.nextLine();
                        sonuc = bolme(sayi1,sayi2,sayi3);
                        System.out.println("Sonuç:" + sonuc);

                    }
                    else {
                        scanner.nextLine();
                        System.out.println("Uygun bir method bulunmamaktadır.");
                    }
                }
            else {
                System.out.println("Geçersiz işlem");
            }
        }
    }
}