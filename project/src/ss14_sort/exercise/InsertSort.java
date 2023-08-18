package ss14_sort.exercise;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        sortByInserting(arr);
        System.out.println("sort by ascending: " +Arrays.toString(arr));
        sortDescByInserting(arr);
        System.out.println("sort by descending: " + Arrays.toString(arr));
    }
    public static void sortByInserting(int[] arr) {
        int key;
        int j;
        for (int i = 1; i < arr.length ; i++) {
            key = arr[i];
            j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void sortDescByInserting(int[] arr) {
        int key1;
        int j;
        for (int i = 1; i < arr.length ; i++) {
            key1 = arr[i];
            j = i - 1;
            while(j >= 0 && arr[j] < key1) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key1;
        }
    }
}
