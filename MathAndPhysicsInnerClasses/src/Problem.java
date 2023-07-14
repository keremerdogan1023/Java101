public class Problem {
    public static class Matematik{
        public static void daireAlan(int yaricap){
            System.out.println("Dairenin alanı :" + (Math.PI*yaricap*yaricap));
        }
        public static void ucgenCevresi(int a, int b, int c){
            System.out.println("Üçgenin çevresi : " + (a+b+c));
        }

    }
    public static class Fizik{

        public static void icCarpim(Vec vec1, Vec vec2){
            int icCarpim = vec1.getI()* vec2.getI() + vec1.getJ() * vec2.getJ() + vec1.getK()* vec2.getK();
            System.out.println(vec1.getIsim() + " ile " + vec2.getIsim() + "'in iç çarpımı :" + icCarpim);
        }

    }
}
