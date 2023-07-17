import java.util.Scanner;

public class Main {
    private static Singers singers = new Singers();
    private static Scanner scanner = new Scanner(System.in);
    public static void showOperations(){
        System.out.println("0-İşlemleri Görüntüle");
        System.out.println("1-Şarkıcıları Görüntüle");
        System.out.println("2-Şarkıcı Ekle");
        System.out.println("3-Şarkıcı Güncelle");
        System.out.println("4-Şarkıcı Sil");
        System.out.println("5-Şarkıcı Ara");
        System.out.println("6-Uygulamadan Çık");
    }
    public static void main(String[] args) {
        System.out.println("Şarkıcı uygulamasına hoşgeldiniz...");
        showOperations();
        boolean exit = false;
        int operation;
        while (!exit){
            System.out.println("Yapıcağınız işlemi seçiniz:");
            operation = scanner.nextInt();
            scanner.nextLine();
            if (operation == 0){
                showOperations();
            } else if (operation == 1) {
                singers.showSingers();
            } else if (operation == 2){
                System.out.println("Eklemek istediğiniz şarkıcının ismini giriniz:");
                String singerName = scanner.nextLine();
                singers.addSinger(singerName);
            } else if (operation == 3) {
                System.out.println("Güncellemek istediğiniz şarkıcının sırasını giriniz:");
                int position = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Yeni şarkıcı ismini giriniz:");
                String newName = scanner.nextLine();
                singers.updateSinger(newName,position);
            } else if (operation == 4) {
                System.out.println("Silmek istediğiniz şarkıcının sırasını giriniz:");
                int position = scanner.nextInt();
                scanner.nextLine();
                singers.deleteSinger(position);
            } else if (operation == 5) {
                System.out.println("Aradığınız şarkıcının ismini giriniz:");
                String wantedName = scanner.nextLine();
                singers.searchSinger(wantedName);

            } else if (operation == 6) {
                System.out.println("Sistemden çıkılıyor");
                exit = true;
            }

        }


    }
}