public class Dranza extends Beyblade{
    private String kutsalCanavar;

    public Dranza(String sahip, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(sahip, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println("Bu beyblade'in kutsal canavarı: "+ kutsalCanavar);
        System.out.println(getSahip()+"'in beybladeinin saldırısı: Alev kılıcı");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adı: "+ kutsalCanavar);

    }

    public String getKutsalCanavar() {
        return kutsalCanavar;
    }

    public void setKutsalCanavar(String kutsalCanavar) {
        this.kutsalCanavar = kutsalCanavar;
    }
}
