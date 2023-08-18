package ss13_linear_search_binary_search.exercise;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 2, 56, 9, 4, 8, 89};

        sortStringByAscending(numbers);
        System.out.println("array after sorted:" + Arrays.toString(numbers));
        int index = searchBinary(numbers, 0, numbers.length - 1, 89);
        System.out.println("Value is at index: " + index);

    }

    public static void sortStringByAscending(int[] arrNumbers) {
        Arrays.sort(arrNumbers);
        System.out.println(arrNumbers);
    }

    public static int searchBinary(int[] arrNumbers, int left, int right, int value) {
        int mid = left + (right - left) / 2;

        if (value == arrNumbers[mid]) {
            return mid;
        }
        if (value > arrNumbers[mid]) {
            return searchBinary(arrNumbers, mid + 1, right, value);
        }
        return searchBinary(arrNumbers, left, mid - 1, value);
    }
}
