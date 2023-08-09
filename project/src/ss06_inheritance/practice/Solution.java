package ss06_inheritance.practice;

public class Solution {
    static boolean solution(int[] array) {
        int totalSum = 0;
        for (int sum : array) {
            totalSum += sum;
        }
        int leftSum = 0;
        for (int i = 1; i < array.length - 1; i++) {
            leftSum += array[i-1];
            if (totalSum - leftSum - array[i] == leftSum) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3};
        System.out.println(solution(array));
    }
}

