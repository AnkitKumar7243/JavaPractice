package Loops;
import java.util.Scanner;
public class nestedloop_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j =1; j<=a;j++){
                System.out.print(i );
                System.out.println(j);
            }
        }
    }
}
