package ss02_loop_array.exercise;

public class PrimeLessThan100 {
    public static void main(String[] args) {
        int i = 2;
        int num = 2;
        int count = 0;
        boolean check;
        while (num < 100) {
            check = true;
            i = 2;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(num);
            }
            num++;
        }
    }
}
