import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("İşlemler...\n" +
                    "1.Kare Alan Hesapla \n" +
                    "2.Daire Alan Hesapla \n"+
                    "3.Üçgen Alan Hesapla \n"+
                    "Çıkış için : i");
            System.out.println("Yapmak istediğiniz işlemi seçiniz.");
            String islem = scanner.nextLine();
            Shape shape = null;

            if (islem.equals("i")){
                System.out.println("Çıkış yapılıyor");
                break;
            } else if (islem.equals("1")) {
                System.out.println("Karenin kenar uzunluğunu giriniz:");
                int kenarUzunlugu = scanner.nextInt();
                scanner.nextLine();
                shape = new Square("Kare1",kenarUzunlugu);
                shape.calculateArea();
            }else if (islem.equals("2")) {
                System.out.println("Dairenin yarıçapını giriniz:");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                shape = new Circle("Daire1",yaricap);
                shape.calculateArea();
            }else if (islem.equals("3")) {
                System.out.println("Üçgenin ilk kenarını giriniz:");
                int ilkKenar = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Üçgenin ikinci kenarını giriniz:");
                int ikinciKenar = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Üçgenin üçüncü kenarını giriniz:");
                int ucuncuKenar = scanner.nextInt();
                scanner.nextLine();
                shape = new Triangle("Ucgen1",ilkKenar,ikinciKenar,ucuncuKenar);
                shape.calculateArea();
            }
            else {
                System.out.println("Geçersiz işlem");
            }
        }
    }
}