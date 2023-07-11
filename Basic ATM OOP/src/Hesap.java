public class Hesap {
    private String kullanici_adi;
    private String sifre;
    private int bakiye;

    public Hesap() {
    }

    public Hesap(String kullanici_adi, String sifre, int bakiye) {
        this.kullanici_adi = kullanici_adi;
        this.sifre = sifre;
        this.bakiye = bakiye;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public void paraYatir(int miktar){
        bakiye += miktar;
        System.out.println("İşlem sonrası yeni bakiyeniz: "+ bakiye);
    }
    public void paraCek(int miktar){
        if (miktar<=bakiye){
            bakiye -= miktar;
            System.out.println("İşlem sonrası yeni bakiyeniz:"+ bakiye);
        }
        else {
            System.out.println("Yetersiz bakiye!");
        }
    }
}
