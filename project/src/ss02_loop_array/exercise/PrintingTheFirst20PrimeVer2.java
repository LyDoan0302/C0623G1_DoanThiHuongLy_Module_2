package ss02_loop_array.exercise;

public class PrintingTheFirst20PrimeVer2 {
    public static void main(String[] args) {
        int i = 2;
        int num = 2;
        int count = 0;
        boolean check;
        while (count < 20) {
            check = true;
            i = 2;
            while (i <= num/2) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                count++;
                System.out.println(num);
            }
            num++;
        }
    }
}