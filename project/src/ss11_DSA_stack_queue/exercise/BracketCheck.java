package ss11_DSA_stack_queue.exercise;

import java.util.Arrays;
import java.util.Stack;

public class BracketCheck {
    public static void main(String[] args) {
        String string = "s * (s – a) * (s – b) * (s – c)  ";
        getResultCheckBracket(string);
        String string1 = "s * (s – a) * (s – b) * (s – c)))  ";
        getResultCheckBracket(string1);
    }

    public static String[] stringToArray(String string) {
        String[] strings = string.split("");
        return strings;
    }

    public static boolean checkBracket(String string) {
        String[] strings = stringToArray(string);

        Stack bStack = new Stack<>();
        Stack sym = new Stack<>();
        Stack left = new Stack<>();
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("(")) {
                bStack.push(strings[i]);
                sym.push(strings[i]);
            } else if (strings[i].equals(")")) {
                if (bStack.isEmpty()) {
                    return false;
                } else {
                    left.push(bStack.pop());
                }
            }
        }
        if (sym.equals(left)) {
            return true;
        } else {
            return false;
        }

    }

    public static void getResultCheckBracket(String string) {
        if (checkBracket(string)) {
            System.out.println("Bracket is well.");
        } else {
            System.out.println("Bracket is not good.");
        }
    }

}


