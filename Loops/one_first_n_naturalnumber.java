package Loops;

import java.util.Scanner;

public class one_first_n_naturalnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to print ");
        int n = sc.nextInt();
        int num = 1;
        while (num <= n) {
            System.out.println(num);
            num++;
        }
        System.out.println("These are the number you want to print");
    }
}
