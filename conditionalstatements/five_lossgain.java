package conditionalstatements;

import java.util.Scanner;

public class five_lossgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost price ");
        int cp = sc.nextInt();
        System.out.print("Enter the selleing price ");
        int sp = sc.nextInt();
        if (sp > cp) {
            System.out.print("Your profit is ");
            System.out.println(sp - cp);
        }
        if (cp > sp) {
            System.out.print("You have loss is ");
            System.out.println(cp - sp);
        }
    }
}
