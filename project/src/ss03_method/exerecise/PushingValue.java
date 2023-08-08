package ss03_method.exerecise;

import java.util.Arrays;
import java.util.Scanner;

public class PushingValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int[] newNumbers = new int[numbers.length + 1];

        System.out.println("Input the value to push:");
        int number = scanner.nextInt();
        System.out.println("Input the index of array to push a value: ");
        int index = scanner.nextInt();
        pushValue(numbers,number,index,newNumbers);
    }

    public static int[] pushValue(int[] array, int number, int index, int[] newArray) {
        boolean flag = true;
        int temp;
        for (int i = 0; i < array.length; i++) {
            if (index < -1 || index > array.length - 1) {
                flag = false;
            }
            if (index == i) {
                flag = true;
                for (int j = 0; j < index; j++) {
                    newArray[j] = array[j];
                }
                newArray[index] = number;
                for (int k = index + 1; k < newArray.length; k++) {
                    newArray[k] = array[k - 1];
                }
            }
        }
        if (!flag) {
            System.out.println(index + " is not found.");
            return array;
        } else {
            System.out.println("New array: " + Arrays.toString(newArray));
            return newArray;
        }
    }
}
