package ss16_IO_text_file.practice;

import java.io.*;

public class ReadFileExample {
    public void readFileText(String filePath) {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try{
            file = new File(filePath);
            if(!file.exists()) {
                throw new FileNotFoundException();
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            int sum = 0;
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            System.out.println("sum: " + sum);
        }catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bufferedReader != null) {
                    bufferedReader.close();
                }if(fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
