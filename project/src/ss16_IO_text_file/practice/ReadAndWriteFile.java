package ss16_IO_text_file.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            file = new File(filePath);
            if(!file.exists()) {
                throw new FileNotFoundException();
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(bufferedReader != null ) {
                    bufferedReader.close();
                }
                if(fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return numbers;
    }
    public void writeFile(String filePath, int max) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(filePath);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("max value is: " + max);

        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try{
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

}
