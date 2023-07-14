import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Üniversite sınavı puan hesaplama programı.");
        String islemler = "İşlemler...\n" +
                "1.Eşit ağırlık puanları yazdırma .."+
                "2.Sayısal puanları yazdırma"+
                "3.Eşit ağırlık 1.bulma"+
                "4. Sayısal 1. bulma" +
                "Çıkış için i'ye basın";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Öğrencinin ismini giriniz:");
        String isim1 = scanner.nextLine();
        System.out.println("Öğrencinin Türkçe netini giriniz:");
        int netTurkce1 = scanner.nextInt();
        System.out.println("Öğrencinin Matematik netini giriniz:");
        int netMatematik1 = scanner.nextInt();
        System.out.println("Öğrencinin Edebiyat netini giriniz:");
        int netEdebiyat1 = scanner.nextInt();
        System.out.println("Öğrencinin Fizik netini giriniz:");
        int netFizik1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Öğrencinin ismini giriniz:");
        String isim2 = scanner.nextLine();
        System.out.println("Öğrencinin Türkçe netini giriniz:");
        int netTurkce2 = scanner.nextInt();
        System.out.println("Öğrencinin Matematik netini giriniz:");
        int netMatematik2 = scanner.nextInt();
        System.out.println("Öğrencinin Edebiyat netini giriniz:");
        int netEdebiyat2 = scanner.nextInt();
        System.out.println("Öğrencinin Fizik netini giriniz:");
        int netFizik2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Öğrencinin ismini giriniz:");
        String isim3 = scanner.nextLine();
        System.out.println("Öğrencinin Türkçe netini giriniz:");
        int netTurkce3 = scanner.nextInt();
        System.out.println("Öğrencinin Matematik netini giriniz:");
        int netMatematik3 = scanner.nextInt();
        System.out.println("Öğrencinin Edebiyat netini giriniz:");
        int netEdebiyat3 = scanner.nextInt();
        System.out.println("Öğrencinin Fizik netini giriniz:");
        int netFizik3 = scanner.nextInt();
        scanner.nextLine();
        while (true){

            System.out.print("İşlemi Giriniz : ");
            String islem = scanner.nextLine();
            if (islem.equals("i")){
                System.out.println("Çıkış yapılıyor...");
                break;
            }else if (islem.equals("1")) {

                EsitAgirlik ogrenci1 = new EsitAgirlik(netTurkce1, netMatematik1, netEdebiyat1, netFizik1,isim1);
                EsitAgirlik ogrenci2 = new EsitAgirlik(netTurkce2, netMatematik2, netEdebiyat2, netFizik2,isim2);
                EsitAgirlik ogrenci3 = new EsitAgirlik(netTurkce3, netMatematik3, netEdebiyat3, netFizik3,isim3);
                System.out.println(isim1+":" + ogrenci1.puanHesapla()+"\n"+
                        isim2+":" + ogrenci2.puanHesapla()+"\n"+
                        isim3+":" + ogrenci3.puanHesapla()+"\n");

            }
            else if (islem.equals("2")) {

                Sayisal ogrenci1 = new Sayisal(netTurkce1, netMatematik1, netEdebiyat1, netFizik1,isim1);
                Sayisal ogrenci2 = new Sayisal(netTurkce2, netMatematik2, netEdebiyat2, netFizik2,isim2);
                Sayisal ogrenci3 = new Sayisal(netTurkce3, netMatematik3, netEdebiyat3, netFizik3,isim3);
                System.out.println(isim1+":" + ogrenci1.puanHesapla()+"\n"+
                        isim2+":" + ogrenci2.puanHesapla()+"\n"+
                        isim3+":" + ogrenci3.puanHesapla()+"\n");
            } else if (islem.equals("3")) {
                EsitAgirlik ogrenci1 = new EsitAgirlik(netTurkce1, netMatematik1, netEdebiyat1, netFizik1,isim1);
                EsitAgirlik ogrenci2 = new EsitAgirlik(netTurkce2, netMatematik2, netEdebiyat2, netFizik2,isim2);
                EsitAgirlik ogrenci3 = new EsitAgirlik(netTurkce3, netMatematik3, netEdebiyat3, netFizik3,isim3);

                EsitAgirlik birinci = birinci(ogrenci1,ogrenci2, ogrenci3);

                System.out.println("Birinci Eşit Ağırlık Öğrencisi : " + birinci.getIsim());
                System.out.println("Öğrenci Puanı : " + birinci.puanHesapla());
            } else if (islem.equals("4")) {
                Sayisal ogrenci1 = new Sayisal(netTurkce1, netMatematik1, netEdebiyat1, netFizik1,isim1);
                Sayisal ogrenci2 = new Sayisal(netTurkce2, netMatematik2, netEdebiyat2, netFizik2,isim2);
                Sayisal ogrenci3 = new Sayisal(netTurkce3, netMatematik3, netEdebiyat3, netFizik3,isim3);
                Sayisal birinci = birinci(ogrenci1,ogrenci2, ogrenci3);

                System.out.println("Birinci Eşit Ağırlık Öğrencisi : " + birinci.getIsim());
                System.out.println("Öğrenci Puanı : " + birinci.puanHesapla());
            }else {
                System.out.println("Geçersiz işlem!");
            }
        }
        }

    public static <E extends Aday> E birinci(E e1,E e2,E e3) {

        if (e1.puanHesapla() > e2.puanHesapla() && e1.puanHesapla() > e3.puanHesapla()) {

            return e1;
        }
        else if (e2.puanHesapla() > e1.puanHesapla() && e2.puanHesapla() > e3.puanHesapla()) {

            return e2;
        }
        else if (e3.puanHesapla() > e2.puanHesapla() && e3.puanHesapla() > e1.puanHesapla()) {

            return e3;
        }
        else {
            return e1;
        }
}}