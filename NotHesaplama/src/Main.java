import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Vize 1 notunu giriniz: ");//%30 etkili
        int vize1 = scanner.nextInt();
        System.out.println("Vize 2 notunu giriniz: ");//%30 etkili
        int vize2 = scanner.nextInt();
        System.out.println("Final notunu giriniz: ");//%40 etkili
        int finalNot = scanner.nextInt();
        double ortalama = (vize1*0.3)+(vize2*0.3)+(finalNot*0.4);
        System.out.println("Toplam notun: "+ ortalama);
        
        if (ortalama>=90){
            System.out.println("AA");
        } else if (ortalama>=85) {
            System.out.println("BA");
        }else if (ortalama>=80) {
            System.out.println("BB");
        }else if (ortalama>=75) {
            System.out.println("CB");
        }else if (ortalama>=70) {
            System.out.println("CC");
        }else if (ortalama>=65) {
            System.out.println("DC");
        }else if (ortalama>=60) {
            System.out.println("DD");
        }else if (ortalama>=55) {
            System.out.println("FD");
        }else {
            System.out.println("FF");
        }
    }
}