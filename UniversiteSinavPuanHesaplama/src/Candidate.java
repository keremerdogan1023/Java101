public abstract class Candidate {
    private int turkishSubject;
    private int mathSubject;
    private int literatureSubject;
    private int physicsSubject;
    private String name;

    public Candidate(int turkishSubject, int mathSubject, int literatureSubject, int physicsSubject, String name) {
        this.turkishSubject = turkishSubject;
        this.mathSubject = mathSubject;
        this.literatureSubject = literatureSubject;
        this.physicsSubject = physicsSubject;
        this.name = name;
    }

    public int getTurkishSubject() {
        return turkishSubject;
    }

    public void setTurkishSubject(int turkishSubject) {
        this.turkishSubject = turkishSubject;
    }

    public int getMathSubject() {
        return mathSubject;
    }

    public void setMathSubject(int mathSubject) {
        this.mathSubject = mathSubject;
    }

    public int getLiteratureSubject() {
        return literatureSubject;
    }

    public void setLiteratureSubject(int literatureSubject) {
        this.literatureSubject = literatureSubject;
    }

    public int getPhysicsSubject() {
        return physicsSubject;
    }

    public void setPhysicsSubject(int physicsSubject) {
        this.physicsSubject = physicsSubject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    abstract int calculatePoints();
}
