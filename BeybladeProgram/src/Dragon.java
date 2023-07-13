public class Dragon extends Beyblade{
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String sahip, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
        super(sahip, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println("Bu beyblade'in kutsal canavarı: "+ kutsalCanavar);
        System.out.println(getSahip()+"'in beybladeinin saldırısı: Hayalet Kasırgası");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adı: "+ kutsalCanavar);
        System.out.println("Gizli Yetenek: "+ gizliYetenek);
    }
}
