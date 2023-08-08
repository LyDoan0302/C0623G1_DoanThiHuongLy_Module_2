package ss03_method.practice;
import java.util.Scanner;
public class MaxFinding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] properties;

        do {
            System.out.println("Input size of the array: ");
            size = scanner.nextInt();
            if(size > 20) {
                System.out.println("size is out of bound of the array's length.");
            }
        } while (size > 20);

        int i = 0;
        properties = new int[size];
        while (i < size) {
            System.out.println("Input property of some billionaires : ");
            properties[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-10s%s", "Properties: ", "");
        for (int j = 0; j < properties.length; j++) {
            System.out.print(properties[j] + "\t");
        }

        int max = properties[0];
        int index = 1;
        for (int j = 0; j < properties.length; j++) {
            if(max < properties[j]) {
                max = properties[j];
                index = j;
            }
        }
        System.out.println("\n" + "The largest property is " + max + " at index " + index);
    }
}
