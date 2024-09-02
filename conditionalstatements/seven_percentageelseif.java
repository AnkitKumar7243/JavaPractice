package conditionalstatements;

import java.util.Scanner;

public class seven_percentageelseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your percentage : ");
        int n = sc.nextInt();
        if (n > 90) {
            System.out.println("Excellent");

        } else if (n > 80) {
            System.out.println("Very Good");
        } else if (n > 70) {
            System.out.println("Good");

        } else if (n > 60) {
            System.out.println("ok ! ok!");
        } else if (n > 50) {
            System.out.println("Just pass");

        } else {
            System.out.println("Fail");
        }
    }
}
