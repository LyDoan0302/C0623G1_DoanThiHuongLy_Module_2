package ss16_IO_text_file.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadAndWriteFileExTest {
    public static void main(String[] args) {
        ReadAndWriteFileEx readAndWriteFileEx = new ReadAndWriteFileEx();

        List<String> listString = new ArrayList<>();
        listString = readAndWriteFileEx.readFileEx("/Users/mac/Documents/GitHub_ver2/C0623G1_DoanThiHuongLy_Module_2/project/src/ss16_IO_text_file/exercise/source_file.txt");

        readAndWriteFileEx.writeFileEx("/Users/mac/Documents/GitHub_ver2/C0623G1_DoanThiHuongLy_Module_2/project/src/ss16_IO_text_file/exercise/target_file.txt",listString);

    }
}
