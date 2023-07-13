public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Havalimanına hoşgeldiniz...");
        String sartlar = "Yurtdışı Çıkış Kuralları:\n" +
                "--------------------------------------------------------\n"+
                "Siyasi Yasağınınızın bulunmaması gerekiyor.\n"+
                "Gideceğiniz ülkeye uygun vizenizin bulunması gerekiyor.\n"+
                "Gerekli harcın tam olarak yatırılması gerekmektedir.\n "+
                "--------------------------------------------------------";
        String message = "Bütün şartların sağlanması gerekmektedir";
        while (true){
            System.out.println(sartlar);
            Yolcu yolcu = new Yolcu();
            System.out.println("Harç bedeli kontrol ediliyor...");

            Thread.sleep(2000);
            if(yolcu.yurtdisiHarciKontrol() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("Siyasi yasak kontrol ediliyor...");
            Thread.sleep(2000);
            if (yolcu.siyasiYasakKontrol() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("Vize durumu kontrol ediliyor...");
            Thread.sleep(2000);
            if (yolcu.vizeDurumuKontrol() == true){
                System.out.println(message);
                continue;
            }
            System.out.println("Kontroller bitmiştir. Yurtdışına çıkabilirsiniz...");
            break;
        }
    }
}