//            Count the number of digit for a given number n    / /
package Loops;

import java.util.Scanner;

public class practice_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numofDigit = 0;
        int original_n = n;
        while (n > 0) {
            n = n / 10;
            numofDigit++;// numofDigit = numofDigit+1

        }
        System.out.println("Number of digit in " + original_n + " = " + numofDigit);
    }
}
