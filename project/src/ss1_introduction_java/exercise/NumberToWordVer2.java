package ss1_introduction_java.exercise;

import java.util.Scanner;

public class NumberToWordVer2 {
    public static void main(String[] args) {

        System.out.println("Input the number that need to be translated to word: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String numberToWord;
        String ones = "teen";

        String[] numberToWordInOnes = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String[] number10To19ToWord = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] numberToWordInTens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        if (number >= 0 && number < 10) {
            for (int i = 0; i < numberToWordInOnes.length; i++) {
                if (number == i) {
                    System.out.println("number " + number + "  translated to word is " + numberToWordInOnes[i]);
                }

            }
        } else if (number >= 10 && number < 20) {
            for (int i = 0; i < number10To19ToWord.length; i++) {
                if ((number % i) == i) {
                    System.out.println("number " + number + "  translated to word is " + number10To19ToWord[i - 1]);
                }
            }

        } else if (number >= 20 && number < 100) {
            double n1 = Math.floor(number / 10);
            double n2 = number % 10;
            System.out.println(n1);
            System.out.println(n2);
            for (int i = 0; i < numberToWordInTens.length; i++) {
                for (int j = 0; j < numberToWordInOnes.length; j++) {
                    if ((n1 - 2) == i && n2 == j && n2 != 0) {
                        System.out.println(numberToWordInTens[i] + numberToWordInOnes[j]);
                    }

                }

            }
        } else if (number >= 100 && number < 1000) {
            double n1 = Math.floor(number / 100);
            double n2 = number % 100;
            double n3 = Math.floor(n2 / 10);
            double n4 = n2 % 10;
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);
            System.out.println(n4);
            for (int k = 0; k < numberToWordInOnes.length; k++) {
                for (int i = 0; i < numberToWordInTens.length; i++) {
                    for (int j = 0; j < numberToWordInOnes.length; j++) {
                        if (n1 == k && (n3 - 2) == i && n4 == j && n4 != 0) {
                            System.out.println(numberToWordInOnes[k] + " " + "hundred and " + numberToWordInTens[i] + " " + numberToWordInOnes[j]);
                        }

                    }

                }
            }
        }
    }
}
