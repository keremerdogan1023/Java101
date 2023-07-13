import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari {
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;


    public Yolcu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yatırdığınız harç bedeli:");
        this.harc = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Siyasi yasağınız bulunmaktamıdır ?");
        String cevap = scanner.nextLine();
        if (cevap.equals("evet")){
            this.siyasiYasak = true;

        } else if (cevap.equals("hayır")) {
            this.siyasiYasak = false;
        }else {
            System.out.println("Cevap olarak evet veya hayır giriniz!");
        }
        System.out.println("Vizeniz bulunuyor mu ?");
        String cevap2 = scanner.nextLine();
        if (cevap.equals("evet")){
            this.vizeDurumu = true;

        } else if (cevap.equals("hayır")) {
            this.vizeDurumu = false;
        }else {
            System.out.println("Cevap olarak evet veya hayır giriniz!");
        }
    }

    @Override
    public boolean yurtdisiHarciKontrol() {
        if (this.harc < 15){
            System.out.println("Lütfen harcı eksiksiz yatırın");
            return false;
        }
        else{
            System.out.println("Harç işlemi tamam");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if (this.siyasiYasak == true){
            System.out.println("Siyasi yasağınız bulunuyor. Yurt dışına çıkamazsınız!");
            return false;
        }
        else {
            System.out.println("Siyasi yasağınız bulunmuyor");
            return true;
        }
    }

    @Override
    public boolean vizeDurumuKontrol() {
        if (vizeDurumu == true){
            System.out.println("Vize işlemleri tamam!");
            return true;
        }else {
            System.out.println("Geçerli bir vizeniz bulunmamaktadır");
            return false;
        }
    }
}
