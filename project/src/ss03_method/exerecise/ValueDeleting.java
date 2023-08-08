package ss03_method.exerecise;

import java.util.Arrays;
import java.util.Scanner;

public class ValueDeleting {
    public static void main(String[] args) {
        int[] numbers = {34, 56, 36, 89, 54, 73, 98};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the value to delete: ");
        int number = scanner.nextInt();
        int[] newNumbers = deleteValue(numbers, number);
        //System.out.println(Arrays.toString(newNumbers));
    }
    public static int[] deleteValue(int[] array, int number) {
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                flag = true;
                index = i;
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                break;
            }
        }
        if (!flag) {
            System.out.println("Not found!");
        }
        System.out.println("new array: " + Arrays.toString(array) + " ; deleted value at index " + index);
        return array;
    }
}
