package ss17_IO_binaryFile_serialization.exercise.ex1.ultilities;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<String> readFile(String filePath) {
        List<String> readFileList = new ArrayList<>();
        File file;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try{
            file = new File(filePath);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String str = "";
            while ((str = bufferedReader.readLine()) != null) {
                readFileList.add(str);
            }
            return readFileList;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(bufferedReader != null) {
                    bufferedReader.close();
                }
                if(fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return readFileList;
    }
    public void writeFile(String fileTargetPath, List<String> listString ) {
        File file;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try{
            file = new File(fileTargetPath);
            if(!file.exists()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for(String str : listString) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
        } catch(IOException e ) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if(fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
