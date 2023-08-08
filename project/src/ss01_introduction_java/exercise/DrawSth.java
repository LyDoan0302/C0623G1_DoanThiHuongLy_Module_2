package ss01_introduction_java.exercise;

public class DrawSth {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++ ) {
            for (int j = 1; j <= 10 ; j++) {
                if (i + j == 6 || j - i == 5 ) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 4; i >= 1; i-- ) {
            for (int j = 1; j <= 10 ; j++) {
                if (i + j == 6 || j - i == 5 ) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
