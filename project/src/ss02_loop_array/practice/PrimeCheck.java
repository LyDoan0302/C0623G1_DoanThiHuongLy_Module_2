package ss02_loop_array.practice;
import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number to check");
        int numCheck = scanner.nextInt();

        if (numCheck < 2) {
            System.out.println("number " + numCheck + " is not a prime.");
        } else {
            int i = 2;
            boolean check = true;
            while ( i <= Math.sqrt(numCheck)) {
                if(numCheck % i == 0) {
                    check = false;
                    break;
                } i++;
            }
            if(check) {
                System.out.println("number " + numCheck + " is a prime");
            } else {
                System.out.println("number " + numCheck + " is not a prime");
            }
        }

    }
}
