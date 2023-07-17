public class Problem {
    public static class Math2 {
        public static void areaOfCircle(int radius){
            System.out.println("Dairenin alanı :" + (java.lang.Math.PI*radius*radius));
        }
        public static void perimeterOfTriangle(int a, int b, int c){
            System.out.println("Üçgenin çevresi : " + (a+b+c));
        }

    }
    public static class Physics2 {

        public static void innerProduct(Vec vec1, Vec vec2){
            int innerProduct = vec1.getI()* vec2.getI() + vec1.getJ() * vec2.getJ() + vec1.getK()* vec2.getK();
            System.out.println(vec1.getName() + " ile " + vec2.getName() + "'in iç çarpımı :" + innerProduct);
        }

    }
}
