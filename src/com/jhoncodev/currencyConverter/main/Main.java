package com.jhoncodev.currencyConverter.main;

import com.jhoncodev.currencyConverter.models.UseApi;

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

                String baseCurrency = "";
                String convertToCurrency = "";

                switch (op){
                    case 1: baseCurrency = "PEN"; convertToCurrency = "USD"; break;
                    case 2: baseCurrency = "USD"; convertToCurrency = "PEN"; break;
                    case 3: baseCurrency = "ARS"; convertToCurrency = "USD"; break;
                    case 4: baseCurrency = "USD"; convertToCurrency = "ARS"; break;
                    case 5: baseCurrency = "BRL"; convertToCurrency = "USD"; break;
                    case 6: baseCurrency = "USD"; convertToCurrency = "BRL"; break;
                    case 7: baseCurrency = "COP"; convertToCurrency = "USD"; break;
                    case 8: baseCurrency = "USD"; convertToCurrency = "COP"; break;
                }

                System.out.print("Enter balance to convert: ");
                float balanceToConvert = scanner.nextFloat();

                UseApi.useExchangeRateApi(baseCurrency, convertToCurrency, String.valueOf(balanceToConvert));

            }else{
                System.err.println("Enter a correct option please!");
            }

            System.out.println("******************************************");
        }
    }
}
