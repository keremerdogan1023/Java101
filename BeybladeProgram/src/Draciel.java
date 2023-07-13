public class Draciel extends Beyblade{
    private String kutsalCanavar;

    public Draciel(String sahip, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(sahip, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println("Bu beyblade'in kutsal canavarı: "+ kutsalCanavar);
        System.out.println(getSahip()+"'in beybladeinin savunması: Kale Savunması");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adı: "+ kutsalCanavar);
    }
}
