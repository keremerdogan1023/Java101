import java.util.ArrayList;

public class Sarkicilar {
    private ArrayList<String> sarkiciListesi = new ArrayList<String >();

    public void sarkicilariGoster(){
        System.out.println("Şarkıcı listesinde " + sarkiciListesi.size() + " adet şarkıcı var");
        for (int i = 0; i<sarkiciListesi.size(); i++){
            System.out.println(i+1 + ".Şarkıcı:"+ sarkiciListesi.get(i));
        }
    }
    public void sarkiciEkle(String isim){
        sarkiciListesi.add(isim);
        System.out.println(isim + " isimli şarkıcı eklendi.");
    }
    public void sarkiciGuncelle(String isim, int index){
        sarkiciListesi.set(index-1,isim);
        System.out.println(index +". sıradaki şarkıcı güncellendi" );
    }
    public void sarkiciSil(int index){
        String isim = sarkiciListesi.get(index-1);
        sarkiciListesi.remove(index-1);
        System.out.println(isim+ " isimli şarkıcı listeden silindi.");

    }
    public void sarkiciAra(String isim){
        int sira = sarkiciListesi.indexOf(isim);

        if (sira >=0){
            sira += 1;
            System.out.println("Şarkıcı bulundu.");
            System.out.println(isim + " isimli şarkıcı "+ sira + ". sırada");
        }
        else {
            System.out.println("İstediğiniz şarkıcı bulunamadı.");
        }

    }

}
