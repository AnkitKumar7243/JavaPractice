package Loops;

import java.util.Scanner;

public class two_sumofnaturalnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number  ");
        int n = sc.nextInt();
        int sum = 0;
        int num = 1;
        while (num <= n) {

            sum = sum + num;
            num++;
        }
        System.out.println(sum);

    }
}
