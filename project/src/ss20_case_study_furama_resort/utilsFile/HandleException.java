package ss20_case_study_furama_resort.utilsFile;

import java.util.Scanner;

public class HandleException {
    private static Scanner scanner = new Scanner(System.in);

    public static int checkInt() {
        int input;
        while (true) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                return input;
            } catch (Exception e) {
                System.out.print("Enter again: ");
            }
        }
    }
    public static double checkDouble() {
        double input;
        while (true) {
            try {
                input = Double.parseDouble(scanner.nextLine());
                return input;
            } catch (Exception e) {
                System.out.println("Enter again:");
            }
        }
    }
}
