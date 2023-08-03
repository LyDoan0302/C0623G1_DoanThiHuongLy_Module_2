package ss2_loop_array.exercise;

import java.util.Scanner;

public class DrawSth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        Scanner input = new Scanner(System.in);

        System.out.println("Menu ");
        System.out.println("1. Draw rectangle");
        System.out.println("2. Draw the square triangle (The corner is square at 4 different angles: top-left, top-right, bottom-left, bottom-right)");
        System.out.println("3. Draw isosceles triangle");
        System.out.println("4. Exit");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Input the width of rectangle ");
                int widthRec = scanner.nextInt();
                System.out.println("Input the height of rectangle ");
                int heightRec = scanner.nextInt();
                // rectangle
                for (int i = 0; i < heightRec; i++) {
                    for (int j = 0; j < widthRec; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println("Input the height of triangle ");
                int heightTri = scanner.nextInt();
                for (int i = 0; i < heightTri; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }

                for (int i = 0; i < heightTri; i++) {
                    for (int j = heightTri; j >= i; j--) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }

                for (int i = 0; i < heightTri; i++) {
                    for (int j = heightTri; j >= i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = heightTri - 1 - i; k < heightTri; k++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }

                for (int i = 0; i < heightTri; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = i; k < heightTri; k++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;

            case 3:
                System.out.println("Input the height of triangle ");
                int heightTri1 = scanner.nextInt();

                for (int i = 0; i < heightTri1; i++) {
                    for (int j = heightTri1; j >= i; j--) {
                        System.out.print("  ");
                    }
                    for (int j = heightTri1 - 1 - i; j <= heightTri1 - 1 + i ; j++ ) {
                        System.out.print(" *");
                    }
                    System.out.println();
                    System.out.println();
                }
                break;

            case 4:
                System.exit(4);

            default:
                System.out.println("No choice!");
                break;
        }
    }
}
