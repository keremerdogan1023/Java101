public class EsitAgirlik extends Candidate {
    public EsitAgirlik(int turkishSubject, int mathSubject, int literatureSubject, int physicsSubject, String name) {
        super(turkishSubject, mathSubject, literatureSubject, physicsSubject, name);
    }

    @Override
    int calculatePoints() {
        return getTurkishSubject()*5 + getLiteratureSubject()*4 + getMathSubject()*4 + getPhysicsSubject()*1;
    }
}
