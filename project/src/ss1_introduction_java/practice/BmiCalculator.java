package ss1_introduction_java.practice;
import java.util.Scanner;
public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.println("Your weight (in kg)");
        weight = scanner.nextDouble();

        System.out.println("Your height (in m)");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height,2);

        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if(bmi < 18) {
            System.out.printf("%-20s%s", bmi, "Underweight");
        }
        else if(bmi < 25) {
            System.out.printf("%-20s%s", bmi, "Normal");
        }
        else if(bmi < 30) {
            System.out.printf("%-20s%s", bmi, "Overweight");
        }
        else {
            System.out.printf("%-20s%s", bmi, "obese");
        }
        int a = 330 % 100;
        System.out.println(a);
    }
}
