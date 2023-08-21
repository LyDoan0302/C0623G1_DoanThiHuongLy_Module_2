package ss15_exception.exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        IllegalTriangleException exception = new IllegalTriangleException("Error");
       try {
           Scanner scanner = new Scanner(System.in);
           System.out.println("input a: ");
           int a = scanner.nextInt();
           System.out.println("input b: ");
           int b = scanner.nextInt();
           System.out.println("input c: ");
           int c = scanner.nextInt();
           exception.check(a, b, c);

       } catch (Exception ex) {
           System.out.println(ex.getMessage());
       }

    }
}
