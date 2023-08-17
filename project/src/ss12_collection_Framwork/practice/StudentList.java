package ss12_collection_Framwork.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class StudentList {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Ly", 20);
        hashMap.put("Le", 21);
        hashMap.put("Loan", 22);
        hashMap.put("Lan", 23);
        hashMap.put("Linh", 24);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f,true);
        linkedHashMap.put("Ly", 20);
        linkedHashMap.put("Le", 21);
        linkedHashMap.put("Loan", 22);
        linkedHashMap.put("Lan", 23);
        linkedHashMap.put("Linh", 24);
        System.out.println("\nThe age for " + "student is " +linkedHashMap);
    }
}
