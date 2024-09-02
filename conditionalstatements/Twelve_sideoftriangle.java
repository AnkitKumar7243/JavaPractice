package conditionalstatements;
import java.util.Scanner;
public class Twelve_sideoftriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side ");
         int a = sc.nextInt();
         System.out.print("Enter the second side ");
         int b = sc.nextInt();
         System.out.print("Enter the third side ");
         int c = sc.nextInt();
         if (a+b>c && b+c>a && a+c>b ) {
            System.out.println("Valid triangle");
            
         }
         else{
            System.out.println("invalid triangle");
         }

    }
}
