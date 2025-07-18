package com.jhoncodev.currencyConverter.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("******************************************");
            System.out.println("Welcome to the Currency Converter\n");
            System.out.println("1) Peruvian Sol => United States Dollar");
            System.out.println("2) United States Dollar => Peruvian Sol");
            System.out.println("3) Argentine Peso => United States Dollar");
            System.out.println("4) United States Dollar => Argentine Peso");
            System.out.println("5) Brazilian Real => United States Dollar");
            System.out.println("6)United States Dollar => Brazilian Real");
            System.out.println("7) Colombian Peso => United States Dollar");
            System.out.println("8) United States Dollar => Colombian Peso");
            System.out.println("9) Exit\n");
            System.out.print("Enter a option: ");
            int op = scanner.nextInt();

            if (op > 0 && op < 10) {
                if (op == 9) {
                    break;
                }

            }else{
                System.err.println("Enter a correct option please!");
            }

            System.out.println("******************************************");
        }
    }
}
