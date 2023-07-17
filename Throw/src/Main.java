import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void ageCheck(int age) throws IOException{
        if (age<18){
            throw new IOException();
        }
        else {
            System.out.println("Mekana hoşgeldiniz...");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz: ");
        int age = scanner.nextInt();
        try{
            ageCheck(age);
        }
        catch (IOException e){
            System.out.println("18 yaşından küçükler mekana giremez!");
        }

    }
}