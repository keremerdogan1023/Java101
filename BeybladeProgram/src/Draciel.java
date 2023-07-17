public class Draciel extends Beyblade{
    private String holyMonster;

    public Draciel(String owner, int rotationalSpeed, int attackPower, String holyMonster) {
        super(owner, rotationalSpeed, attackPower);
        this.holyMonster = holyMonster;
    }

    @Override
    public void summonHolyMonster() {
        System.out.println("Bu beyblade'in kutsal canavarı: "+ holyMonster);
        System.out.println(getOwner()+"'in beybladeinin savunması: Kale Savunması");
    }

    @Override
    public void showInformations() {
        super.showInformations();
        System.out.println("Kutsal canavar adı: "+ holyMonster);
    }
}
