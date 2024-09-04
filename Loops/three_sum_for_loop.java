package Loops;

import java.util.Scanner;

public class three_sum_for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the digit ");
        int n = sc.nextInt();
        for (int num = 1; num <= n; num++) {
            System.out.println(num);
        }

        // subtraction n

        for (int num = n; num >= 1; num--) {
            System.out.println(num);
        }
    }
}
