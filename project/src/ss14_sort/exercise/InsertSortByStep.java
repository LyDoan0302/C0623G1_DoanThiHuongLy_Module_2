package ss14_sort.exercise;

import java.util.Scanner;

public class InsertSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input size");
        int size = Integer.parseInt(scanner.nextLine());
        System.out.println("input value:");
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("your input list:");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println("\nBegin sort processing...");
        sortByInsertByStep(list);

    }

    public static void sortByInsertByStep(int[] list) {
        int key;
        int j;
        for (int i = 1; i < list.length; i++) {
            key = list[i];
            j = i - 1;
            while (j >= 0 && list[j] > key) {
                System.out.println("swap" + list[j + 1] + " with " + list[j]);
                list[j + 1] = list[j];
                j--;
            }
            System.out.println("swap " + list[j + 1] + " with " + key);
            list[j + 1] = key;
            System.out.println("List after the " + i + " sort");
            for (int k = 0; k < list.length; k++) {
                System.out.println(list[k] + "\t");
            }
        }
        System.out.println();
    }
}



