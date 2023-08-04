package ss3_method.exerecise;
import java.util.Scanner;
public class LetterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = "javaIsInteresting";
        int count = 0;
        System.out.println("Input the letter to check: ");
        char letter = scanner.next().charAt(0);
        for (int i = 0; i < string.length(); i++) {
            if(letter == string.charAt(i)) {
                count++;
            }
        }
        System.out.println("Letter " + letter + " appears " + count + " time(s).");
    }
}
