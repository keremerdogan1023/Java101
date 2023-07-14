public class Sayisal extends  Aday{
    public Sayisal(int turkce, int matematik, int edebiyat, int fizik, String isim) {
        super(turkce, matematik, edebiyat, fizik, isim);
    }

    @Override
    int puanHesapla() {
        return getTurkce()*5 + getMatematik()*4 + getFizik()*4 + getEdebiyat() * 1;
    }
}
