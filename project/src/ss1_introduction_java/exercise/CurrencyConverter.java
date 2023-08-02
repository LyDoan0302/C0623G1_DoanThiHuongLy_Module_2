package ss1_introduction_java.exercise;
import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        System.out.println("Input USD");
        double usd, vnd;
        usd = scanner.nextInt();
        vnd = usd * rate;
        System.out.println(usd + " is equivalent to " + vnd);
    }
}
