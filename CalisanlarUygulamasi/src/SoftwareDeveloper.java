public class SoftwareDeveloper extends Employee {
    String languages;
    public SoftwareDeveloper(int id, String name, String surname, String languages) {
        super(id, name, surname);
        this.languages = languages;
    }

    @Override
    public void getInformation() {
        super.getInformation();
        System.out.println("Yazılımcının çalıştığı diller:" + languages);
    }
    public void doTask(){
        System.out.println("Yazılımcı taske başladı.");
    }
}
