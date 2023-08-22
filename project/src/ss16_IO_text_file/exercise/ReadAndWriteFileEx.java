package ss16_IO_text_file.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileEx {
    public List<String> readFileEx (String pathSourceFile) {
        List<String> listString = new ArrayList<>();
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            file = new File(pathSourceFile);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String str = "";
            while((str = bufferedReader.readLine()) != null) {
                listString.add(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(bufferedReader != null) {
                    bufferedReader.close();
                }
                if(fileReader != null) {
                    fileReader.close();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
        return listString;
    }
    public void writeFileEx(String pathTargetFile, List<String> listString) {
        File file = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            file = new File(pathTargetFile);
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);

            for(String line: listString) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } try {
            if(bufferedWriter != null) {
                bufferedWriter.close();
            }
            if(fileWriter != null) {
                fileWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
