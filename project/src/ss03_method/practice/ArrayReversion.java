package ss03_method.practice;

import java.util.Scanner;

public class ArrayReversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Input the size of array: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size out of bound array length");
            }

        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Input the element of array at index " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Element in array ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int k = 0; k < array.length / 2; k++) {
            int temp = array[k];
            array[k] = array[size - 1 - k];
            array[size - 1 - k] = temp;
        }
        System.out.printf("\n%-20s%s", "Reversed element", "");
        for (int l = 0; l < array.length; l++) {
            System.out.print(array[l] + "\t");
        }
    }

}
