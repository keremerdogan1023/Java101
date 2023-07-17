import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üçgenin 1.kenarının uzunluğunu giriniz: ");
        int edge1 = scanner.nextInt();
        System.out.println("Üçgenin 2.kenarının uzunluğunu giriniz");
        int edge2 = scanner.nextInt();

        double h = Math.sqrt(edge1*edge1+edge2*edge2);
        System.out.println("Üçgenin hipotenüs uzunluğu: "+ h);
    }
}