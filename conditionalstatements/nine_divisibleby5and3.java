package conditionalstatements;

import java.util.Scanner;

public class nine_divisibleby5and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        // int n = sc.nextInt();
        // if (n % 5 == 0 && n % 3 == 0) {
        //     System.out.println("This number is divisible by 5 and 3 ");

        // } else {
        //     System.out.println("This number is not divisible by 5 and 3 ");
        // }
        // divisible by 5 but not by 3

        int n =sc.nextInt();
        if (n%5==0 && n%3!=0){
            System.out.println("number divisible by 5");

        }
        else{
            System.out.println("it is not divisible");
        }


    }

}
