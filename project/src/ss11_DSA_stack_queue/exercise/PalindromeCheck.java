package ss11_DSA_stack_queue.exercise;

import java.util.*;

public class PalindromeCheck {
    public static void main(String[] args) {
        String string1 = "Able was I ere I saw elbA";
        checkPalindrome(string1);
        String string2 = " was I ere i saw Elba";
        checkPalindrome(string2);

    }
        public static void checkPalindrome (String string){
            char[] strings = string.toCharArray();
            System.out.println(string);
            Stack<String> stack = new Stack<>();
            Queue<String> queue = new LinkedList<>();
            for (int i = 0; i < strings.length; i++) {
                stack.push(String.valueOf(strings[i]));
                queue.add(String.valueOf(strings[i]));
            }
            System.out.println("stack: " + stack);

            System.out.println("queue: " + queue);

            int size = stack.size();
            boolean flag = true;
            for (int i = 0; i < size; i++) {
                if (!stack.pop().equals(queue.poll())) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("This is a palindrome.");
            } else {
                System.out.println("This is not a palindrome");
            }
        }

    }


