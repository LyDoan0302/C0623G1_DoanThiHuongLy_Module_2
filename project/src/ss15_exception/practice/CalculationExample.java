package ss15_exception.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input number x: ");
            int x = scanner.nextInt();
            System.out.println("Input number y: ");
            int y = scanner.nextInt();

            CalculationExample calc = new CalculationExample();
            calc.calculate(x, y);

        } catch (Exception e) {
            System.out.println("exception : " + e.getMessage());
        }
        System.out.println("ok");
    }
    private void calculate(int x, int y) {

            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Sum of x + y = " + a);
            System.out.println("Sub of x - y = " + b);
            System.out.println("Mul of x * y = " + c);
            System.out.println("Div of x / y = " + d);

    }
}
