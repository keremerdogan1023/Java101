public class Ucgen extends Sekil {
    private int a;
    private int b;
    private int c;

    public Ucgen(String name, int a, int b, int c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    void alanHesapla() {
        double u = (a+b+c)/ 2.0;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println(getName()+" 'in alanı:"+ alan);
    }
}
