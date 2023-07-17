public class Beyblade {
    private String owner;
    private int rotationalSpeed;
    private int attackPower;

    public Beyblade(String owner, int rotationalSpeed, int attackPower) {
        this.owner = owner;
        this.rotationalSpeed = rotationalSpeed;
        this.attackPower = attackPower;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getRotationalSpeed() {
        return rotationalSpeed;
    }

    public void setRotationalSpeed(int rotationalSpeed) {
        this.rotationalSpeed = rotationalSpeed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    public void attack(){
        System.out.println(getOwner()+ " "+ attackPower + " ve "+ rotationalSpeed + " ile saldırıyor.");
    }
    public void summonHolyMonster(){
        System.out.println("Bu beyblade'in kutsal canavarı bulunmamaktadır.");
    }
    public void showInformations(){
        System.out.println("Beyblade'in sahibinin ismi : " + owner +
                "\nBeyblade'in dönüş hızı: " + rotationalSpeed +
                "\nBeyblade'in saldırı gücü: " + attackPower);
    }
}
