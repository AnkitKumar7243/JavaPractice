//Print all the values Between 1 and 50 except for the multiple of 3.
package Loops;
import java.util.Scanner;
public class continue_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        for(int num =1; num <=50; num++){
            if (num% 3==0) {
                continue;
            }
            System.out.println(num);
        }
    }
}
