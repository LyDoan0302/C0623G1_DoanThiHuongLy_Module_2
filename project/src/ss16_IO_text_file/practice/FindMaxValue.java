package ss16_IO_text_file.practice;

import java.util.List;

public class FindMaxValue {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("/Users/mac/Documents/GitHub_ver2/C0623G1_DoanThiHuongLy_Module_2/project/src/ss16_IO_text_file/practice/IntData.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("/Users/mac/Documents/GitHub_ver2/C0623G1_DoanThiHuongLy_Module_2/project/src/ss16_IO_text_file/practice/Result.txt", maxValue);

    }
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
}
