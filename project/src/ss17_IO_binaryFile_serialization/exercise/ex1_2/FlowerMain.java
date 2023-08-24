package ss17_IO_binaryFile_serialization.exercise.ex1_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FlowerMain {

    public static final String PATH_NAME = "/Users/mac/Documents/GitHub_ver2/C0623G1_DoanThiHuongLy_Module_2/project/src/ss17_IO_binaryFile_serialization/exercise/ex1_2/flowerListSourceFile.txt";
    public static void main(String[] args) {
        List<Flower> flowerList = new ArrayList<>();
        flowerList.add(new Flower(1, "Hoa Phuong", "mau do", "khong mui"));
        flowerList.add(new Flower(2, "Hoa Lay On", "mau trang", "thom"));
        flowerList.add(new Flower(3, "Hoa Thuy Tien", "mau trang", "thom"));
        flowerList.add(new Flower(4, "Hoa Huong Duong", "mau vang", "khong mui"));
        writeFileWithByteStream(PATH_NAME, flowerList);
        System.out.println(readFileWithByteStream(PATH_NAME));

    }


    public static List<Flower> readFileWithByteStream(String pathName) {
        File file;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            file = new File(pathName);
            if (!file.exists()) {
                file.createNewFile();
            }
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);

            return (List<Flower>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return new ArrayList<>();
    }

    public static void writeFileWithByteStream(String pathName, List<Flower> flowers) {
        File file;
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            file = new File(pathName);
            if (!file.exists()) {
                file.createNewFile();
            }
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(flowers);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
