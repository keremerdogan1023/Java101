import java.util.Scanner;

public class Main {
    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scanner = new Scanner(System.in);
    public static void islemleriGoster(){
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
        islemleriGoster();
        boolean exit = false;
        int islem;
        while (!exit){
            System.out.println("Yapıcağınız işlemi seçiniz:");
            islem = scanner.nextInt();
            scanner.nextLine();
            if (islem == 0){
                islemleriGoster();
            } else if (islem == 1) {
                sarkicilar.sarkicilariGoster();
            } else if (islem == 2){
                System.out.println("Eklemek istediğiniz şarkıcının ismini giriniz:");
                String sarkiciİsim = scanner.nextLine();
                sarkicilar.sarkiciEkle(sarkiciİsim);
            } else if (islem == 3) {
                System.out.println("Güncellemek istediğiniz şarkıcının sırasını giriniz:");
                int sira = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Yeni şarkıcı ismini giriniz:");
                String yeniİsim = scanner.nextLine();
                sarkicilar.sarkiciGuncelle(yeniİsim,sira);
            } else if (islem == 4) {
                System.out.println("Silmek istediğiniz şarkıcının sırasını giriniz:");
                int sira = scanner.nextInt();
                scanner.nextLine();
                sarkicilar.sarkiciSil(sira);
            } else if (islem == 5) {
                System.out.println("Aradığınız şarkıcının ismini giriniz:");
                String arananİsim = scanner.nextLine();
                sarkicilar.sarkiciAra(arananİsim);

            } else if (islem == 6) {
                System.out.println("Sistemden çıkılıyor");
                exit = true;
            }

        }


    }
}