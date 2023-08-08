package ss02_loop_array.exercise;

import java.util.Scanner;

public class PrintingTheFirst20Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCheck = 0;
        int countPrime = 0;
        int num = 2;

        while (countPrime < 20) {

            for (int i = 2; i <= Math.sqrt(num) ; i++) {
                if(num % i == 0) {
                    countCheck++;
                }
            }
            if(countCheck == 0) {
                countPrime++;
                System.out.println("Prime " + countPrime + " is " + num);
            }
            countCheck = 0;
            num++;

        }
    }
}
