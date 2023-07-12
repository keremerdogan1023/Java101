public class Yonetici extends Calisan{
    private int sorumluOlduguKisiler;

    public Yonetici(int id, String isim, String soyisim, int sorumluOlduguKisiler) {
        super(id, isim, soyisim);
        this.sorumluOlduguKisiler = sorumluOlduguKisiler;
    }
    public void iseAlim(Calisan calisan){
        System.out.println(calisan.getIsim()+" işe alınmıştır.");
        sorumluOlduguKisiler++;
    }

    @Override
    public void bilgileriAl() {
        super.bilgileriAl();
        System.out.println("Yönetici " + sorumluOlduguKisiler + " kişiden sorumlu.");
    }
}
