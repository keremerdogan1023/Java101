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
            String operation = scanner.nextLine();
            if (operation.equals("i")){
                System.out.println("Sistemden çıkış yapılıyor...");
                break;
            } else if (operation.equals("1")) {
                SoftwareDeveloper softwareDeveloper = new SoftwareDeveloper(1,"Kerem", "Erdoğan", "Java");
                System.out.println("1. Bilgileri Göster \n"+
                        "2. Taske Başla\n "+
                        "Çıkış için i'ye basın");
                while (true){
                    System.out.println("İşlemi seçiniz: ");
                    String softwareDevOperation = scanner.nextLine();
                    if (softwareDevOperation.equals("i")){
                        System.out.println("Sistemden çıkış yapılıyor...");
                        break;
                    } else if (softwareDevOperation.equals("1")) {
                        softwareDeveloper.getInformation();
                    } else if (softwareDevOperation.equals("2")) {
                        softwareDeveloper.doTask();
                    }else {
                        System.out.println("Geçersiz İşlem!!");
                    }
                }
            }else if (operation.equals("2")) {
                Manager manager = new Manager(2,"Ahmet", "Koca", 5);
                System.out.println("1. Bilgileri Göster \n"+
                        "2. Çalışan işe al\n "+
                        "Çıkış için i'ye basın");
                while (true){
                    System.out.println("İşlemi seçiniz: ");
                    String managerOperation = scanner.nextLine();
                    Employee employee = new Employee(1,"Emre","Ölçer");
                    if (managerOperation.equals("i")){
                        System.out.println("Sistemden çıkış yapılıyor...");
                        break;
                    } else if (managerOperation.equals("1")) {
                        manager.getInformation();
                    } else if (managerOperation.equals("2")) {
                        manager.hiring(employee);
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