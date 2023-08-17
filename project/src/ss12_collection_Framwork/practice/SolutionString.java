package ss12_collection_Framwork.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionString {
    public static void main(String[] args) {
        String string = "DanangGym";
        String[] strings = string.split("");
        String str = strings[0];
        String strAlp = "ABCDEFGHIJKLMNOPKRSTUVWYZ";
        for (int i = 1; i < strings.length; i++) {
            if (strAlp.indexOf(strings[i]) != -1) {
                if (" ".indexOf(strings[i - 1]) != -1) {
                    str += strings[i];
                } else {
                    str += " " + strings[i];
                }
            } else {
                str += strings[i];
            }
        }
            System.out.println(str.toLowerCase().trim());

//        char[] strings = string.toCharArray();
//        System.out.println(Arrays.toString(strings));
//        //String str = "";
//        List<Character> stringList = new ArrayList<>();
//        for (int i = 0; i < strings.length; i++) {
//            stringList.add(strings[i]);
//        }
//        for (int i = 0; i < stringList.size(); i++) {
//            if (Character.isUpperCase(stringList.get(i)) && i !=0) {
//
//                   // stringList.add(i, "");
//
//            }
//
//        }
//        System.out.println(stringList);
//    }
//    public String correctString(String string) {
//        String[] strings = string.split("");
//    }
        }
    }
