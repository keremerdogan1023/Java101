public abstract class Sekil {
    private String name;

    public Sekil(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void alanHesapla();
}
