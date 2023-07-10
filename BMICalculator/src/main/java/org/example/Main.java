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

    }
}