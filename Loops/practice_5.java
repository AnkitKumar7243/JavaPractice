//    Print the first n factorial number 
package Loops;
import java.util.Scanner;
public class practice_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int fact = 1;
        for(int i =1; i<=n; i++){
            fact = fact*i;
            System.out.println("factorial of " +i + " :"+ fact );
        }
    }
}
