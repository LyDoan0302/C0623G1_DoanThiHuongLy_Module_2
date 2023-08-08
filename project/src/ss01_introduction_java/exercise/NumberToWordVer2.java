package ss01_introduction_java.exercise;
import java.util.Scanner;
public class NumberToWordVer2 {
    public static void main(String[] args) {

        System.out.println("Input the number that need to be translated to word: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String numberToWord;
        String ones = "teen";

        String[] numberToWordInOnes = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] number10To19ToWord = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] numberToWordInTens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        if (number >= 0 && number < 10) {
                System.out.println("number " + number + "  translated to word is " + numberToWordInOnes[number]);
        }
        else if (number >= 10 && number < 20) {
                System.out.println("number " + number + "  translated to word is " + number10To19ToWord[number % 10]);
        }
        else if (number >= 20 && number < 100) {
            int n1 = number / 10;
            int n2 = number % 10;
                if (n2 != 0) {
                    System.out.println(numberToWordInTens[n1 - 2] + " " + numberToWordInOnes[n2]);
            }

        } else if (number >= 100 && number < 1000) {
            int n1 = number / 100;
            int n2 = number % 100;
            int n3 = n2 / 10;
            int n4 = n2 % 10;
            if (n2 > 10 && n2 < 20) {
                System.out.println(numberToWordInOnes[n1] + " hundred and " + number10To19ToWord[n4]);
            } else {
                if (n3 == 0) {
                    System.out.println(numberToWordInOnes[n1] + " hundred and " + numberToWordInOnes[n4]);
                } else if (n4 != 0) {
                    System.out.println(numberToWordInOnes[n1] + " hundred and " + numberToWordInTens[n3 - 2] + " " + numberToWordInOnes[n4]);
                } else {
                    if (n2 == 10) {
                        System.out.println(numberToWordInOnes[n1] + " hundred and " + number10To19ToWord[0]);
                    } else {
                    System.out.println(numberToWordInOnes[n1] + " hundred and " + numberToWordInTens[n3 - 2]);
                }
            }
        }
        } else {
            System.out.println("Out of ability");
        }
    }
}
