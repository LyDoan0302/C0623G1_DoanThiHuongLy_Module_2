package ss13_linear_search_binary_search.exercise;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class LargestSizeStringSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = "abcabcdgabxy";
        searchLargestSizeString(string);

    }
    public static void searchLargestSizeString(String string) {
        LinkedList<Character> max = new LinkedList<>();
        String str = "";
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> listTemp = new LinkedList<>();
            listTemp.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > listTemp.getLast()) {
                    listTemp.add(string.charAt(j));
                } else {
                    break;
                }
                //System.out.println("listTemp: " + listTemp);

            }
            if (listTemp.size() > max.size()) {
                max.clear();
                max.addAll(listTemp);
            }
        }
        for (Character chr : max) {
            str += chr;
        }
        System.out.println("String is found: " + str);
    }
}
