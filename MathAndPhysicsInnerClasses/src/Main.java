import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hoşgeldiniz...");
        String operations = ("İşlemler...\n" +
                "1.Daire Alan Hesaplama \n" +
                "2.Üçgen Çevresi Hesaplama \n"+
                "3.Vektör iç çarpım hesaplama \n"+
                "Çıkış için : i");
        while (true){
            System.out.println(operations);
            System.out.println("İşlemi seçiniz:");
            String operation = scanner.nextLine();
            if (operation.equals("i")){
                System.out.println("Programdan çıkılıyor...");
                break;
            } else if (operation.equals("1")) {
                System.out.println("Dairenin yarıçapı: ");
                int radius = scanner.nextInt();
                scanner.nextLine();
                Problem.Math2.areaOfCircle(radius);

            } else if (operation.equals("2")) {
                System.out.println("Kenar 1 : ");
                int edge1 = scanner.nextInt();
                System.out.println("Kenar 2 : ");
                int edge2 = scanner.nextInt();
                System.out.println("Kenar 3 : ");
                int edge3 = scanner.nextInt();
                scanner.nextLine();
                Problem.Math2.perimeterOfTriangle(edge1,edge2,edge3);
            } else if (operation.equals("3")) {
                Vec vec1 = new Vec("Vektör 1");
                Vec vec2 = new Vec("Vektör 2");
                Problem.Physics2.innerProduct(vec1,vec2);
            }else {
                System.out.println("Geçersiz işlem!");
            }
        }
    }
}