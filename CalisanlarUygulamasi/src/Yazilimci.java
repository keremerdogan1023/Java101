import java.util.List;

public class Yazilimci extends Calisan{
    String diller;
    public Yazilimci(int id, String isim, String soyisim,String diller) {
        super(id, isim, soyisim);
        this.diller = diller;
    }

    @Override
    public void bilgileriAl() {
        super.bilgileriAl();
        System.out.println("Yazılımcının çalıştığı diller:" + diller);
    }
    public void taskYap(){
        System.out.println("Yazılımcı taske başladı.");
    }
}
