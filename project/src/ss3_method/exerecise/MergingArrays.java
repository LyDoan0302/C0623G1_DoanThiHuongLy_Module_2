package ss3_method.exerecise;

import java.util.Arrays;
import java.util.Scanner;

public class MergingArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the length of array 1; ");
        int size1 = scanner.nextInt();
        int[] numbers1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.println("Input the element of array 1 at index " + i);
            numbers1[i] = scanner.nextInt();
        }

        System.out.println("Input the length of array 2");
        int size2 = scanner.nextInt();
        int[] numbers2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.println("Input the element of array 2 at index " + i);
            numbers2[i] = scanner.nextInt();
        }

        int[] mergingNumbers = new int[size1 + size2];

        System.out.println("array 1 " + Arrays.toString(numbers1));
        System.out.println("array 2 " + Arrays.toString(numbers2));
        mergeArrays(numbers1, numbers2, mergingNumbers);
        System.out.println("merged array " + Arrays.toString(mergingNumbers));
    }

    public static int[] mergeArrays(int[] array1, int[] array2, int[] mergedArray) {
        int n = array1.length;
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            mergedArray[n] = array2[j];
            n++;
        }
        return mergedArray;
    }
}

