package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aracın km başına tükettiği benzinin ücretini giriniz: ");
        double costPerKm = scanner.nextDouble();
        System.out.println("Total yol mesafesini giriniz(km): ");
        double totalRoad = scanner.nextDouble();
        double totalCost = totalRoad*costPerKm;
        System.out.println("Total ücret: "+ totalCost);
    }
}