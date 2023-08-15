package ss11_DSA_stack_queue.exercise;

import java.util.Arrays;
import java.util.Stack;

public class ElementReverseStack {
    public static void main(String[] args) {

        Integer[] integers = new Integer[10];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = i + 1;
        }
        integersReverseStack(integers);

        String string = "elementReverseStack";
        stringReverseStack(string);

    }

    public static void integersReverseStack(Integer[] integers) {
        Stack<Integer> integerStack = new Stack<>();
        System.out.println("Array before reversed: ");
        System.out.println(Arrays.toString(integers));
        for (int i = 0; i < integers.length; i++) {
            integerStack.push(integers[i]);
        }

        for (int i = 0; i < integers.length; i++) {
            integers[i] = integerStack.pop();
        }
        System.out.println("Array after reversed: ");
        System.out.println(Arrays.toString(integers));
    }

    public static void stringReverseStack(String string) {
        Stack<String> stringStack = new Stack<>();
        char[] strings = string.toCharArray();
        System.out.println("string before reversed: ");
        System.out.println(string);
        for (int i = 0; i < strings.length; i++) {
            stringStack.push(String.valueOf(strings[i]));
        }
        String str = "";
        for (int i = 0; i < strings.length; i++) {
            str += stringStack.pop();
        }
        System.out.println("string after reversed: ");
        System.out.println(str);
    }


}
