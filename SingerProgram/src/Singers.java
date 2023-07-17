import java.util.ArrayList;

public class Singers {
    private ArrayList<String> singersList = new ArrayList<String >();

    public void showSingers(){
        System.out.println("Şarkıcı listesinde " + singersList.size() + " adet şarkıcı var");
        for (int i = 0; i< singersList.size(); i++){
            System.out.println(i+1 + ".Şarkıcı:"+ singersList.get(i));
        }
    }
    public void addSinger(String name){
        singersList.add(name);
        System.out.println(name + " isimli şarkıcı eklendi.");
    }
    public void updateSinger(String name, int index){
        singersList.set(index-1,name);
        System.out.println(index +". sıradaki şarkıcı güncellendi" );
    }
    public void deleteSinger(int index){
        String isim = singersList.get(index-1);
        singersList.remove(index-1);
        System.out.println(isim+ " isimli şarkıcı listeden silindi.");

    }
    public void searchSinger(String name){
        int position = singersList.indexOf(name);

        if (position >=0){
            position += 1;
            System.out.println("Şarkıcı bulundu.");
            System.out.println(name + " isimli şarkıcı "+ position + ". sırada");
        }
        else {
            System.out.println("İstediğiniz şarkıcı bulunamadı.");
        }

    }

}
