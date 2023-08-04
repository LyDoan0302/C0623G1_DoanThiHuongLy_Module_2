package ss3_method.exerecise;

import java.util.Scanner;

public class MaxOfMatrixFinding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = {{1, 7, 3}, {3, 7, 5}, {3, 1, 7}};
        int max = matrix[0][0];
        String index = "";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max <= matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == max) {
                    index += "[" + i + "][" + j + "],";
                }
            }
        }
        System.out.println("max " + max + " index " + index);
    }
}
