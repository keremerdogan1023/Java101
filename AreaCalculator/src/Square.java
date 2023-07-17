public class Square extends Shape{
    private int edgeLenght;

    public Square(String name, int edgeLenght) {
        super(name);
        this.edgeLenght = edgeLenght;
    }

    @Override
    void calculateArea() {
        System.out.println(getName()+ " in alanı :" + (edgeLenght*edgeLenght));
    }
}
