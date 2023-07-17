public class Dragon extends Beyblade{
    private String holyMonster;
    private String hiddenTalent;

    public Dragon(String owner, int rotationalSpeed, int attackPower, String holyMonster, String hiddenTalent) {
        super(owner, rotationalSpeed, attackPower);
        this.holyMonster = holyMonster;
        this.hiddenTalent = hiddenTalent;
    }

    @Override
    public void summonHolyMonster() {
        System.out.println("Bu beyblade'in kutsal canavarı: "+ holyMonster);
        System.out.println(getOwner()+"'in beybladeinin saldırısı: Hayalet Kasırgası");
    }

    @Override
    public void showInformations() {
        super.showInformations();
        System.out.println("Kutsal canavar adı: "+ holyMonster);
        System.out.println("Gizli Yetenek: "+ hiddenTalent);
    }
}
