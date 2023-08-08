package ss01_introduction_java.exercise;
import java.util.Scanner;
public class DisplayMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name;
        name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
