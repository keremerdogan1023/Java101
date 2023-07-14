public class Kare extends Sekil{
    private int kenar;

    public Kare(String name, int kenar) {
        super(name);
        this.kenar = kenar;
    }

    @Override
    void alanHesapla() {
        System.out.println(getName()+ " in alanı :" + (kenar*kenar));
    }
}
