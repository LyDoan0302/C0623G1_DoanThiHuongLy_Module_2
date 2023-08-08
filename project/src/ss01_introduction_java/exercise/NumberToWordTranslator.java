package ss01_introduction_java.exercise;

import java.util.Scanner;

public class NumberToWordTranslator {
    public static void main(String[] args) {
        // Buoc 1: Viet ma de chuong trinh hoi cac so can doc.
        System.out.println("Input the number that need to be translated to word: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //int hundreds;
        String numberToWord;
        String ones = "teen";
        //String numberToWord2;
if(number >= 0 && number < 10) {
    // Buoc 2: Doc cac so co 1 chu so
    switch (number) {
        case 0:
            numberToWord = "zero";
            break;
        case 1:
            numberToWord = "one";
            break;
        case 2:
            numberToWord = "two";
            break;
        case 3:
            numberToWord = "three";
            break;
        case 4:
            numberToWord = "four";
            break;
        case 5:
            numberToWord = "five";
            break;
        case 6:
            numberToWord = "six";
            break;
        case 7:
            numberToWord = "seven";
            break;
        case 8:
            numberToWord = "eight";
            break;
        case 9:
            numberToWord = "nine";
            break;
        default:
            numberToWord = "out of ability.";
            break;
    }
    System.out.println("number " + number + "  translated to word is " + numberToWord);
} else if(number >= 10 && number < 20) {
    switch (number) {
        case 10:
            numberToWord = "ten";
            break;
        case 11:
            numberToWord = "eleven";
            break;
        case 12:
            numberToWord = "twelve";
            break;
        case 13:
            numberToWord = "thỉrt" + ones;
            break;
        case 14:
            numberToWord = "four" + ones;
            break;
        case 15:
            numberToWord = "fif" + ones;
            break;
        case 16:
            numberToWord = "six" + ones;
            break;
        case 17:
            numberToWord = "seven" + ones;
            break;
        case 18:
            numberToWord = "eigh" + ones;
            break;
        case 19:
            numberToWord = "nine" + ones;
            break;
        default:
            numberToWord = "out of ability";
            break;
    }
    System.out.println("number " + number + " translated to word is " + numberToWord);
} else if (number >= 20 && number < 100) {

   switch (number) {
       case 20:
           numberToWord = "twenty";
           break;
       case 30:
           numberToWord = "thirty";
           break;
       case 50:
           numberToWord = "fifty";
           break;
       case 80:
           numberToWord = "eighty";
           break;
       default:
           numberToWord = "out of ability";
           break;
    }

}

    }

}
