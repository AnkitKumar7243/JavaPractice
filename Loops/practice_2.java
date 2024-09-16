//Find the sum of digit in a given number n 
package Loops;

import java.util.Scanner;

public class practice_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumofDigits = 0;
        int original_n = 0;
        while (n > 0) {
            sumofDigits += n % 10;
            n = n / 10;
        }

        System.out.println("Number sum of Digit is " + original_n + " = " + sumofDigits);

    }

}
