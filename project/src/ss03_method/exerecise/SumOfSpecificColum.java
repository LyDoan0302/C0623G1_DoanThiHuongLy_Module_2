package ss03_method.exerecise;

import java.util.Scanner;

public class SumOfSpecificColum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] numbers = {{1, 2, 3, 4}, {2, 3, 4, 5}, {6, 7, 8, 9}, {3, 4, 5, 6}};
        System.out.println("Input the index of colum you want to sum: ");
        int index = scanner.nextInt();
        if (index < 0  || index >= numbers.length) {
            System.out.println("index should not exceed " + numbers.length);
        } else {
            int sumNumber = 0;
            for (int i = 0; i < numbers.length; i++) {
                sumNumber += numbers[i][index];
            }
            System.out.println("total sum of the elements at colum's index " + index + ": " + sumNumber);

        }

    }

}
