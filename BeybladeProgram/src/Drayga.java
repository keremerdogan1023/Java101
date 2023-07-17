public class Drayga extends Beyblade{
    private String holyMonster;

    public Drayga(String owner, int rotationalSpeed, int attackPower, String holyMonster) {
        super(owner, rotationalSpeed, attackPower);
        this.holyMonster = holyMonster;
    }

    @Override
    public void summonHolyMonster() {
        System.out.println("Bu beyblade'in kutsal canavarı: "+ holyMonster);
        System.out.println(getOwner()+"'in beybladeinin saldırısı: Kaplan pençesi");
    }

    @Override
    public void showInformations() {
        super.showInformations();
        System.out.println("Kutsal canavar adı: "+ holyMonster);
    }
}
