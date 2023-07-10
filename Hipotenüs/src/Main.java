import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üçgenin 1.kenarının uzunluğunu giriniz: ");
        int kenar1 = scanner.nextInt();
        System.out.println("Üçgenin 2.kenarının uzunluğunu giriniz");
        int kenar2 = scanner.nextInt();

        double h = Math.sqrt(kenar1*kenar1+kenar2*kenar2);
        System.out.println("Üçgenin hipotenüs uzunluğu: "+ h);
    }
}