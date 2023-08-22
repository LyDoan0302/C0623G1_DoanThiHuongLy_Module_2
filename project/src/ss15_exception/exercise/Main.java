package ss15_exception.exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        IllegalTriangleException exception = new IllegalTriangleException("Error");
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        do {
            try {
                do {
                    try {
                        System.out.println("input a: ");
                        a = Integer.parseInt(scanner.nextLine());
                        if (a < 0) {
                            System.out.println(" a phai lon hon 0.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("a phai la 1 so");
                    }
                } while (a < 0);
                do {
                    try {
                        System.out.println("input b: ");
                        b = Integer.parseInt(scanner.nextLine());
                        if (b < 0) {
                            System.out.println(" b phai lon hon 0.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("b phai la 1 so");
                    }
                } while (b < 0);
                do {
                    try {
                        System.out.println("input c: ");
                        c = Integer.parseInt(scanner.nextLine());
                        if (c < 0) {
                            System.out.println(" c phai lon hon 0.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("c phai la 1 so");
                    }
                } while (c < 0);

                exception.check(a, b, c);

            } catch (IllegalTriangleException ile) {
                System.out.println(ile.getMessage());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } while (a + b <= c || a + c <= b || b + c <= a);

    }
}
