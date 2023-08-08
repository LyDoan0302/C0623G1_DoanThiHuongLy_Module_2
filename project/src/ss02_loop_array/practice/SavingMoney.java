package ss02_loop_array.practice;
import java.util.Scanner;
public class SavingMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the deposit money ");
        double depositMoney = scanner.nextInt();
        System.out.println("Input interest rate in a year");
        double intRate = scanner.nextInt();
        System.out.println("Input the number of month to send money");
        double month = scanner.nextInt();
        double totalInterest = 0;

        for (int i = 0; i < month; i++) {
            totalInterest += depositMoney * intRate / 100 / 12 * month;
        }
        System.out.println("The total interest you get: " + totalInterest);
    }
}
