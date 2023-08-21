package ss15_exception.practice;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInput index of element:");
        int x = scanner.nextInt();
        try{
            System.out.println("Value of element has index 5 : "
                    + x + " is " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Index out of array bound.");
        }
    }
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Array's elements list: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}
