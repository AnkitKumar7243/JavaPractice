package conditionalstatements;
import java.util.Scanner;
public class practice_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your CGPA");
        int n = sc.nextInt();
        if (n>90) {
            System.out.println("You got the A+");
        }
        else if (n>80) {
            System.out.println("You get A ");
        }
        else if (n>70) {
            
            System.out.println("You get B+ ");
        }
        else if (n>60 ) {
            System.out.println("You get B ");
        }
        else if (n>50){
            System.out.println("You get c");
        }
        else{
            System.out.println("You are fail ! ");
        }
    }
}
