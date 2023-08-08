package ss03_method.practice;
public class MinFinding {
    public static void main(String[] args) {
        int[] numbers = {45,56,78,34,43,21};
        int index = findMin(numbers);
    }
    public static int findMin(int[] array) {
        int min = array[0];
        int index = 0;
        //int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                index = i;
                min = array[i];
            }
        }
        System.out.println("min " + min + " index " + index);
        return index;
    }
}
