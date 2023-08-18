package ss13_linear_search_binary_search.exercise;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AscendingSortedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string to sort by ascending:");
        String string = scanner.nextLine();

        sortStringByAscending(string);
    }

    public static void sortStringByAscending(String string) {
        String str = "";
        List<Character> max = new ArrayList<>();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if(string.charAt(j) > string.charAt(i)) {
                    list.add(string.charAt(j));
                }
            }
            if(list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character chr : max) {
            System.out.print(chr);
        }
        System.out.println();
    }
}
