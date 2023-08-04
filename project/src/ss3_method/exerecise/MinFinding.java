package ss3_method.exerecise;

import java.util.Scanner;

public class MinFinding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] checkNumbers = {23, 56, 21, 34, 21, 67, 32};
        findMin(checkNumbers);

        System.out.println("Input size of array");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Input the element of array at index " + i);
            numbers[i] = scanner.nextInt();
        }
        findMin(numbers);
    }

    public static int findMin(int[] array) {
        int min = array[0];
        String index = "";
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (min == array[i]) {
                index +=  i + ", ";
            }
        }
        System.out.println("Min " + min + " ;index " + index);
        return min;
    }
}
