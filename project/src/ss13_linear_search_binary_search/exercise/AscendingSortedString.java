package ss13_linear_search_binary_search.exercise;


import java.util.Scanner;

public class AscendingSortedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string to sort by ascending:");
        String string = scanner.nextLine();
        String str = sortStringByAscending(string);
        System.out.println(str);
    }

    public static String sortStringByAscending(String string) {
        String str = "";
        char max = string.charAt(0);

        for (int i = 0; i < string.length(); i++) {

            if (max <= string.charAt(i)) {
                max = string.charAt(i);
                str += string.charAt(i);
            }
        }
        return str;
    }
}
