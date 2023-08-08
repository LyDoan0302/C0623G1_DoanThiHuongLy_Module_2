package ss03_method.exerecise;

public class SumOfMatrixDiagonal {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {19, 14, 15, 16}};
        int sumTopLeft = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumTopLeft += matrix[i][i];
        }
        System.out.println("Total of the elements at diagonal index from top left: " + sumTopLeft);
    }
}

//        int sumTopRight = 0;
//        for (int i = matrix.length - 1; i >= 0; i--) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if ((i + j) == matrix.length - 1) {
//                    sumTopRight += matrix[i][j];
//                }
//            }
//        }
//        System.out.println("Total of the elements at diagonal index from top right: " + sumTopRight);


