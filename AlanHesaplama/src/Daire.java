public class Daire extends Sekil{
    private int yaricap;

    public Daire(String name, int yaricap) {
        super(name);
        this.yaricap = yaricap;
    }

    @Override
    void alanHesapla() {
        System.out.println(getName() + " in alanı :" + (Math.PI * yaricap * yaricap));
    }
}
