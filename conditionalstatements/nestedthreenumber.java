package conditionalstatements;

import java.util.Scanner;

public class nestedthreenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first digit : ");
        int a = sc.nextInt();
        System.out.println("Enter the second digit: ");
        int b = sc.nextInt();
        System.out.println("Enter the third digit : ");
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {

                System.out.println(a + " is greater");
            } else {
                System.out.println(c + " is greater");
            }

        } else {
            if (b > c) {
                System.out.println(b + " is greater ");
            } else {
                System.out.println(c + " is greater ");
            }
        }

    }
}
