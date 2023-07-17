public class Dranza extends Beyblade{
    private String holyMonster;

    public Dranza(String owner, int rotationalSpeed, int attackPower, String holyMonster) {
        super(owner, rotationalSpeed, attackPower);
        this.holyMonster = holyMonster;
    }

    @Override
    public void summonHolyMonster() {
        System.out.println("Bu beyblade'in kutsal canavarı: "+ holyMonster);
        System.out.println(getOwner()+"'in beybladeinin saldırısı: Alev kılıcı");
    }

    @Override
    public void showInformations() {
        super.showInformations();
        System.out.println("Kutsal canavar adı: "+ holyMonster);

    }

    public String getHolyMonster() {
        return holyMonster;
    }

    public void setHolyMonster(String holyMonster) {
        this.holyMonster = holyMonster;
    }
}
