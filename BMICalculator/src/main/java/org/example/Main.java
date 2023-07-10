package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz(kg):");
        int weight = scanner.nextInt();

        System.out.println("Boyunuzu giriniz(m):");
        double height = scanner.nextDouble();

        double BMI = weight/(height*height);
        System.out.println("Beden Kitle Endeksiniz: " + BMI);

        if (BMI<18.5){
            System.out.println("Zayıfsınız.");
        } else if (BMI>=18.5 && BMI < 25.0 ) {
            System.out.println("Normalsiniz.");
        } else if (BMI>=25.0 && BMI< 30.0) {
            System.out.println("Fazla Kilolusunuz.");

        } else if (BMI>= 30.0) {
            System.out.println("Obezsiniz");
        }
    }
}