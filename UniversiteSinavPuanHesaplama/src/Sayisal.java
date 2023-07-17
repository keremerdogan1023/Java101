public class Sayisal extends Candidate {
    public Sayisal(int turkishSubject, int mathSubject, int literatureSubject, int physicsSubject, String name) {
        super(turkishSubject, mathSubject, literatureSubject, physicsSubject, name);
    }

    @Override
    int calculatePoints() {
        return getTurkishSubject()*5 + getMathSubject()*4 + getPhysicsSubject()*4 + getLiteratureSubject() * 1;
    }
}
