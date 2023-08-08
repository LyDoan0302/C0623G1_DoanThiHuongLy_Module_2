package ss03_method.practice;

import java.util.Scanner;

public class FahrenheitCelsiusConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu: ");
            System.out.println("1. Convert Celsius to Fahrenheit ");
            System.out.println("2. Convert Fahrenheit tp Celsius ");
            System.out.println("0. Exit ");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Input Celsius to convert: ");
                    celsius = scanner.nextDouble();
                    System.out.println(celsius + " is equivalent to " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit");
                }
                case 2: {
                    System.out.println("Input Fahrenheit to convert: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println(fahrenheit + " is equivalent to " + convertFahrenheitToCelsius(fahrenheit) + " Celsius");
                }
                case 0:
                    System.exit(0);
            }

        } while (choice != 0);
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
