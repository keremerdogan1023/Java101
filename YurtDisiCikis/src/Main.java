public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Havalimanına hoşgeldiniz...");
        String conditions = "Yurtdışı Çıkış Kuralları:\n" +
                "--------------------------------------------------------\n"+
                "Siyasi Yasağınınızın bulunmaması gerekiyor.\n"+
                "Gideceğiniz ülkeye uygun vizenizin bulunması gerekiyor.\n"+
                "Gerekli harcın tam olarak yatırılması gerekmektedir.\n "+
                "--------------------------------------------------------";
        String message = "Bütün şartların sağlanması gerekmektedir";
        while (true){
            System.out.println(conditions);
            Passanger passanger = new Passanger();
            System.out.println("Harç bedeli kontrol ediliyor...");

            Thread.sleep(2000);
            if(passanger.controlFeesAbroad() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("Siyasi yasak kontrol ediliyor...");
            Thread.sleep(2000);
            if (passanger.controlForPoliticalBan() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("Vize durumu kontrol ediliyor...");
            Thread.sleep(2000);
            if (passanger.checkVisaStatus() == true){
                System.out.println(message);
                continue;
            }
            System.out.println("Kontroller bitmiştir. Yurtdışına çıkabilirsiniz...");
            break;
        }
    }
}