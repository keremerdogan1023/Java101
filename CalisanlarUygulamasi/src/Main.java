import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hoşgeldiniz");
        System.out.println("1. Yazılımcı İşlemleri: \n"+
                "2. Yönetici İşlemleri: \n" +
                "Çıkış için i' ye basınız.");

        while (true){
            System.out.println("Yapacağınız işlemi seçiniz:");
            String islem = scanner.nextLine();
            if (islem.equals("i")){
                System.out.println("Sistemden çıkış yapılıyor...");
                break;
            } else if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci(1,"Kerem", "Erdoğan", "Java");
                System.out.println("1. Bilgileri Göster \n"+
                        "2. Taske Başla\n "+
                        "Çıkış için i'ye basın");
                while (true){
                    System.out.println("İşlemi seçiniz: ");
                    String yazilimciIslem = scanner.nextLine();
                    if (yazilimciIslem.equals("i")){
                        System.out.println("Sistemden çıkış yapılıyor...");
                        break;
                    } else if (yazilimciIslem.equals("1")) {
                        yazilimci.bilgileriAl();
                    } else if (yazilimciIslem.equals("2")) {
                        yazilimci.taskYap();
                    }else {
                        System.out.println("Geçersiz İşlem!!");
                    }
                }
            }else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici(2,"Ahmet", "Koca", 5);
                System.out.println("1. Bilgileri Göster \n"+
                        "2. Çalışan işe al\n "+
                        "Çıkış için i'ye basın");
                while (true){
                    System.out.println("İşlemi seçiniz: ");
                    String yoneticiIslem = scanner.nextLine();
                    Calisan calisan = new Calisan(1,"Emre","Ölçer");
                    if (yoneticiIslem.equals("i")){
                        System.out.println("Sistemden çıkış yapılıyor...");
                        break;
                    } else if (yoneticiIslem.equals("1")) {
                        yonetici.bilgileriAl();
                    } else if (yoneticiIslem.equals("2")) {
                        yonetici.iseAlim(calisan);
                    }else {
                        System.out.println("Geçersiz İşlem!!");
                    }
                }
            }else {
                System.out.println("Geçersiz İşlem!!");
            }
        }
    }
}