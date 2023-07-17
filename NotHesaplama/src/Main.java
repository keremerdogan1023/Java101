import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Vize 1 notunu giriniz: ");//%30 etkili
        int midterm1 = scanner.nextInt();
        System.out.println("Vize 2 notunu giriniz: ");//%30 etkili
        int midterm2 = scanner.nextInt();
        System.out.println("Final notunu giriniz: ");//%40 etkili
        int finalGrade = scanner.nextInt();
        double average = (midterm1*0.3)+(midterm2*0.3)+(finalGrade*0.4);
        System.out.println("Toplam notun: "+ average);
        
        if (average>=90){
            System.out.println("AA");
        } else if (average>=85) {
            System.out.println("BA");
        }else if (average>=80) {
            System.out.println("BB");
        }else if (average>=75) {
            System.out.println("CB");
        }else if (average>=70) {
            System.out.println("CC");
        }else if (average>=65) {
            System.out.println("DC");
        }else if (average>=60) {
            System.out.println("DD");
        }else if (average>=55) {
            System.out.println("FD");
        }else {
            System.out.println("FF");
        }
    }
}