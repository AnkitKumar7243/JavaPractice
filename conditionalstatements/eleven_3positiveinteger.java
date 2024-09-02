package conditionalstatements;

import java.util.Scanner;

public class eleven_3positiveinteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the first digit ");
        // int a = sc.nextInt();
        // System.out.print("Enter the second digit ");
        // int b = sc.nextInt();
        // System.out.print("Enter the third digit ");
        // int c = sc.nextInt();
        // if (a > b && a > c) {
        // System.out.println(a+" is greater ");

        // }
        // if (b > a && b > c) {
        // System.out.println(b+" is greater ");

        // }
        // if (c > a && c > b) {
        // System.out.println(c+" is greater ");
        // }

        // If the ages of Ram, Shyam and Ajay are input through the keyboard, write a
        // program to determine the youngest of the three.
        System.out.println("Enter the age of Ram");
        int Ram = sc.nextInt();
        System.out.println("enter the age of Shyam");
        int Shyam = sc.nextInt();
        System.out.println("Enter the age of Ajay");
        int Ajay = sc.nextInt();
        if (Ram < Shyam && Ram < Ajay) {
            System.out.println("Ram is youngest then Shyam and Ajay");

        }
        if (Shyam < Ram && Shyam < Ajay) {
            System.out.println("Shyam is youngest then Ram and Ajay");

        }
        if (Ajay < Ram && Ajay < Shyam) {
            System.out.println("Ajay is youngest then Ram and Shyam");
        } else {
            System.out.println("The all of three age is same");
        }
    }
}
