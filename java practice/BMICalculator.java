import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int weight = scanner.nextInt();

        float height = scanner.nextFloat();

        float bmi = weight / (height * height);

        if (bmi < 18) {
            System.out.println(0);
        } else if (bmi >= 18 && bmi < 25) {
            System.out.println(1);
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println(2);
        } else if (bmi >= 30 && bmi < 40) {
            System.out.println(3);
        } else if (bmi >= 40) {
            System.out.println(4);
        }

    }
}