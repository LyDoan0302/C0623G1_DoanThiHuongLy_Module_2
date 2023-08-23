package ss17_IO_binaryFile_serialization.exercise.ex2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input source file:");
        String sourcePath = scanner.nextLine();
        System.out.println("Input destination file:");
        String destPath = scanner.nextLine();
        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);
        //copyFileUsingJava7Files(sourceFile, destFile);
        copyFileUsingStream(sourceFile, destFile);
        System.out.println("Copy completed");
    }
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream(File source, File dest) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try{
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer,0,length);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try{
                if(inputStream != null) {
                    inputStream.close();
                }
                if(outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
