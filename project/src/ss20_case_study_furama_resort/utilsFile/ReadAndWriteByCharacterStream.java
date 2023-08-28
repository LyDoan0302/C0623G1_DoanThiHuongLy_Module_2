package ss20_case_study_furama_resort.utilsFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteByCharacterStream {
    public static List<String> readByCharacterStream(String pathName) {
        List<String> stringList = new ArrayList<>();
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            file = new File(pathName);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String str = "";
            while ((str = bufferedReader.readLine()) != null) {
                stringList.add(bufferedReader.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (fileReader != null) {
                fileReader.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return stringList;
    }

    public static void writeByCharacterStream(String pathName, List<String> stringList) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(pathName)))) {
            for (String line : stringList) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
