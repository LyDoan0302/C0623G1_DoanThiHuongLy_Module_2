package ss14_sort.practice;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arrNumbers = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        sortByBubble(arrNumbers);
        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.print(" " + arrNumbers[i]);
        }
    }

    public static void sortByBubble(int[] arr) {
        boolean swap = false;
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if(!swap) {
                return;
            }
        }

    }
}
