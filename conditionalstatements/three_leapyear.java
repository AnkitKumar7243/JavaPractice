package conditionalstatements;

import java.util.Scanner;

public class three_leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = sc.nextInt();
        if (n % 4 == 0) {
            System.out.println("Your enter a number is leap year ");
            System.out.println("GOOD");

        } else {
            System.out.println("You enter number is not a leap year ");
            System.out.println("Try again !");
        }
    }

}
