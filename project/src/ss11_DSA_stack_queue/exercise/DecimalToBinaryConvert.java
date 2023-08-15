package ss11_DSA_stack_queue.exercise;

import java.util.Arrays;
import java.util.Stack;

public class DecimalToBinaryConvert {
    public static void main(String[] args) {

        int number = 30;
        System.out.println(convertDecimalToBinary(number));
    }
    public static String convertDecimalToBinary(int number) {
        Stack<Integer> stack = new Stack<>();
        String str = "";
        int quotient;
        do {
            quotient = number/2;
            stack.push(number%2);
            number = quotient;
        } while (quotient>=1);

        int size = stack.size();
        for (int i = 0; i < size; i++) {
            str += stack.pop();
        }
        return str;
    }
}

