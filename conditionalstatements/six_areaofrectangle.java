package conditionalstatements;

import java.util.Scanner;

public class six_areaofrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length : ");
        int length = sc.nextInt();
        System.out.println("Enter breath : ");
        int breath = sc.nextInt();
        int area = length * breath;
        int perimeter = 2 * (length + breath);
        if (area > perimeter) {
            System.out.println("Area is greater than perimeter ");
        } else {
            System.out.println("Perimeter is greater than area ");

        //            input length breath ,squre or not//
        System.out.println("Enter length ");
        int l= sc.nextInt();
        System.out.println("Enter breath ");
        int b= sc.nextInt();
        if(l==b){
            System.out.println("Then area of Squre is yes ");

        }
        else{
            System.out.println("It is naot the area of Squre");
        }

        }
    }
}

