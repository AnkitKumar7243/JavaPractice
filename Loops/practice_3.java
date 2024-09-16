//Reverse the digits of a number
package Loops;
import java.util.Scanner;
public class practice_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter some digit ");
        int n=sc.nextInt();
        int ans = 0;
        while (n>0) {
            ans=ans*10+n%10;
            n/=10;
        }
        System.out.println(ans);
    }
}
