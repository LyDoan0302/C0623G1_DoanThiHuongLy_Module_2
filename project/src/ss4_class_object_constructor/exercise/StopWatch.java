package ss4_class_object_constructor.exercise;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {

    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setStartTime() {
        this.startTime = System.currentTimeMillis();
    }

    public void setEndTime() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void sortSelectionNumbers(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[100000];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) Math.random();
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.setStartTime();
        stopWatch.getStartTime();
        sortSelectionNumbers(numbers);
        stopWatch.setEndTime();
        stopWatch.getEndTime();

        System.out.println("Elapsed time: " + stopWatch.getElapsedTime() + " milliseconds");
    }
}
