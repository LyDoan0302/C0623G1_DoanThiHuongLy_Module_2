package ss16_IO_text_file.practice;

import java.util.Scanner;

public class IOMainTest {
    public static void main(String[] args) {
        System.out.println("Input filePath: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
