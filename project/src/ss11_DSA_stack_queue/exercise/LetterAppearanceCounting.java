package ss11_DSA_stack_queue.exercise;
import java.util.LinkedHashMap;
import java.util.Map;

public class LetterAppearanceCounting {
    public static void main(String[] args) {
        String string = "LetterAppearanceCounting";
        countLetterAppearance(string);
    }
    public static void countLetterAppearance(String string) {
        String newString = string.toLowerCase();
        System.out.println(newString);
        char[] strings = newString.toCharArray();
        Map<Character, Integer> stringMap = new LinkedHashMap<>();
        int value = 1;
        for (int i = 0; i < strings.length; i++) {
            if(!stringMap.containsKey(strings[i])) {
                stringMap.put(strings[i], 1);
            } else {
                stringMap.put(strings[i], stringMap.get(strings[i]) + 1);
            }
        }
        System.out.println(stringMap);
    }
}
