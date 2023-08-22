package ss16_IO_text_file.exercise;

import java.util.ArrayList;
import java.util.List;

public class CountryDisplayByReader {
    public static void main(String[] args) {
        ReadAndWriteFileEx readAndWriteFileEx = new ReadAndWriteFileEx();
        List<String> countryList = new ArrayList<>();
        countryList = readAndWriteFileEx.readFileEx("/Users/mac/Documents/GitHub_ver2/C0623G1_DoanThiHuongLy_Module_2/project/src/ss16_IO_text_file/exercise/countryList.csv");
        for(String str: countryList) {
            System.out.println(str);
        }
    }
}
